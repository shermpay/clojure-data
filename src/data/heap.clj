(ns data.heap)

(defprotocol IHeap
  (insert [this o] "Insert an object into the Heap")
  (compare-fn [this] "Returns the compare-fn used"))

(deftype PersistentHeap [elements compare-fn]
  IHeap
  (insert [this o] 
    (let [new-heap (vec (cons nil elements))
          [final final-p] 
          (loop [pos (count new-heap)
                 res new-heap]
            (let [p-pos (quot pos 2)]
              (if (and (> pos 1) (> 0 (compare o (get res p-pos))))
                (recur p-pos (assoc res pos (get res p-pos)))
                [res pos])))]
      (PersistentHeap. (rest (assoc (vec final) final-p o)) (.compare-fn this))))

  (compare-fn [this] (.compare-fn this))

  Object
  (toString [this] (str elements))

  clojure.lang.Seqable
  (seq [this] (seq elements))
  clojure.lang.IPersistentCollection
  (empty [this] (PersistentHeap. [] <))
  (equiv [this o] (= elements o))
  (cons [this o] (cons o elements))

  clojure.lang.Counted
  (count [this] (count elements))

  clojure.lang.ISeq
  (first [this] (first elements))
  (next [this] (next elements))
  (more [this] (rest elements)))

(defn heap
    "Constructs a heap of given args."
    [& {:keys [compare-fn elements]
        :or [< '()]}]
    (if (empty? elements) 
      (PersistentHeap. [] compare-fn)
      (let [heapify (fn [elements i]
                      (let [n (count elements)]
                        (loop  [i i
                                res (vec elements)]
                          (let [l (* 2 i)
                                r (inc l)
                                c (get res i)
                                best (let [m (if (and (< l n) (compare-fn (res l) c))
                                               l
                                               i)]
                                       (if (and (< r n) (compare-fn (res r) (res m)))
                                         r
                                         m))]
                            (if (not (= i best))
                              (recur best (assoc (assoc res i (res best)) best c))
                              res)))))]
        (let [n (count elements)]
          (loop [i (inc (quot n 2))
                 res (vec (cons nil elements))]
            (if (> i 1)
              (recur (dec i) (heapify res (dec i)))
              (PersistentHeap. (rest res) compare-fn)))))))

(defn add
  "Insert objs into heap and while maintaining heap properties"
  [& objs]
  (loop [[o & more] objs
         res heap]
    (if (nil? more)
      res
      (recur more (insert heap o)))))
