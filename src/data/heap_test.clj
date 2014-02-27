; CIDER 0.6.0alpha (package: 20140221.726) (Clojure 1.5.1, nREPL 0.2.3)
user> 
#<Namespace data.heap>
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (conj h 1)
[nil 5 3 7 1]
data.heap> (conj h 1)
[nil 5 3 7 1]
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (conj h 1)
[nil 5 3 7 1]
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (conj h 1)
[nil 5 3 7 1]
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> h
[nil 5 3 7]
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (cons h 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (.elements h)
IllegalArgumentException No matching field found: elements for class clojure.lang.PersistentVector  clojure.lang.Reflector.getInstanceField (Reflector.java:271)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> h
(nil 5 3 7)
data.heap> (.elements h)
IllegalArgumentException No matching field found: elements for class clojure.lang.Cons  clojure.lang.Reflector.getInstanceField (Reflector.java:271)
data.heap> (.elements h)
IllegalArgumentException No matching field found: elements for class clojure.lang.Cons  clojure.lang.Reflector.getInstanceField (Reflector.java:271)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (.elements h)
IllegalArgumentException No matching field found: elements for class clojure.lang.PersistentVector$ChunkedSeq  clojure.lang.Reflector.getInstanceField (Reflector.java:271)
data.heap> (def h (heap 5 3 7))
#'data.heap/h
data.heap> (.elements h)
IllegalArgumentException No matching field found: elements for class clojure.lang.PersistentVector$ChunkedSeq  clojure.lang.Reflector.getInstanceField (Reflector.java:271)
data.heap> (->Heap 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (->Heap 1)
IllegalArgumentException Don't know how to create ISeq from: java.lang.Long  clojure.lang.RT.seqFrom (RT.java:505)
data.heap> (heap 1)
(1)
data.heap> (.elements (heap 1))
IllegalArgumentException No matching field found: elements for class clojure.lang.ArraySeq  clojure.lang.Reflector.getInstanceField (Reflector.java:271)
data.heap> (.elements (heap 1))
(1)
data.heap> (heap 1)
(1)
data.heap> (.elements (heap 1))
(1)
data.heap> (heap 1)
(1)
data.heap> (def h (heap 1))
#'data.heap/h
data.heap> (conj h 1)
(1 1)
nil
data.heap> (def h (heap 1))
#'data.heap/h
data.heap> (conj h 1)
StackOverflowError   clojure.lang.RT.conj (RT.java:562)
data.heap> (def h (heap 1))
#'data.heap/h
data.heap> (conj h 1)
StackOverflowError   clojure.lang.RT.conj (RT.java:562)
data.heap> (def h (heap 1))
#'data.heap/h
data.heap> h
(nil 1)
data.heap> (conj h 1)
StackOverflowError   clojure.lang.RT.conj (RT.java:562)
data.heap> (conj h 2)
StackOverflowError   clojure.lang.RT.conj (RT.java:562)
data.heap> (.printStackTrace *e)
nil
data.heap> (.printStackTrace e*)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: e* in this context, compiling:(/tmp/form-init7303046986787587063.clj:1:1) 
data.heap> (conj h 2)
StackOverflowError   clojure.lang.RT.conj (RT.java:562)
data.heap> (.printStackTrace e*)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: e* in this context, compiling:(/tmp/form-init7303046986787587063.clj:1:1) 
data.heap> (def h (heap 1))
#'data.heap/h
data.heap> (conj h 1)
(1 nil 1)
data.heap> (conj h 0)
(0 nil 1)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> (conj h 0)
(0 nil 5 8 4)
data.heap> (conj h 9)
(9 nil 5 8 4)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> (conj h 9)
ClassCastException clojure.lang.Cons cannot be cast to clojure.lang.Associative  clojure.lang.RT.assoc (RT.java:702)
data.heap> (conj h 9)
ClassCastException clojure.lang.Cons cannot be cast to clojure.lang.Associative  clojure.lang.RT.assoc (RT.java:702)
data.heap> (.elements h)
(nil 5 8 4)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> h
(nil 5 8 4)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> h
(nil 5 8 4)
data.heap> (conj h 9)
ClassCastException clojure.lang.PersistentVector cannot be cast to clojure.lang.ISeq  data.heap.Heap (form-init7303046986787587063.clj:10)
data.heap> (conj h 9)
ClassCastException clojure.lang.PersistentVector cannot be cast to clojure.lang.ISeq  data.heap.Heap (form-init7303046986787587063.clj:10)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> (conj h 9)
(nil 5 8 4 9)
data.heap> (conj h 3)
(nil 3 5 4 8)
data.heap> (conj h 3)
(nil 3 5 4 8)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> (conj h 3)
ClassCastException clojure.lang.PersistentVector cannot be cast to clojure.lang.ISeq  data.heap.Heap (form-init7303046986787587063.clj:10)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> (conj h 3)
ClassCastException clojure.lang.PersistentVector cannot be cast to clojure.lang.ISeq  data.heap.Heap (form-init7303046986787587063.clj:10)
data.heap> (conj h 3)
ClassCastException clojure.lang.PersistentVector cannot be cast to clojure.lang.ISeq  data.heap.Heap (form-init7303046986787587063.clj:10)
data.heap> (def h (heap 5 8 4))
#'data.heap/h
data.heap> (conj h 3)
(nil 3 5 4 8)
data.heap> (.elements h)
[nil 5 8 4]
data.heap> (cons 1 [1 2])
(1 1 2)
data.heap> (cons 1 [1 2])
(1 1 2)
data.heap> (source conj)
CompilerException java.lang.RuntimeException: Unable to resolve symbol: source in this context, compiling:(/tmp/form-init7303046986787587063.clj:1:1) 
data.heap> (use 'clojure.repl)
nil
data.heap> (source conj)
(def
 ^{:arglists '([coll x] [coll x & xs])
   :doc "conj[oin]. Returns a new collection with the xs
    'added'. (conj nil item) returns (item).  The 'addition' may
    happen at different 'places' depending on the concrete type."
   :added "1.0"
   :static true}
 conj (fn ^:static conj 
        ([coll x] (. clojure.lang.RT (conj coll x)))
        ([coll x & xs]
         (if xs
           (recur (conj coll x) (first xs) (next xs))
           (conj coll x)))))
nil
data.heap> (source cons)
(def
 ^{:arglists '([x seq])
    :doc "Returns a w seq where x is the first element and seq is
    the rest."
   :added "1.0"
   :static true}

 cons (fn* ^:static cons [x seq] (. clojure.lang.RT (cons x seq))))
nil
data.heap> (conj h 3)
(nil 3 5 4 8)
data.heap> (type (conj h 3))
clojure.lang.PersistentVector$ChunkedSeq
data.heap> (->Heap 1 2)
ArityException Wrong number of args (2) passed to: heap$eval2924$--GT-Heap  clojure.lang.AFn.throwArity (AFn.java:437)
data.heap> (->Heap [1 2])
(1 2)
data.heap> (type (->Heap [1 2]))
data.heap.Heap
data.heap> (sort)
ArityException Wrong number of args (0) passed to: core$sort  clojure.lang.AFn.throwArity (AFn.java:437)
data.heap> (doc sort)
-------------------------
clojure.core/sort
([coll] [comp coll])
  Returns a sorted sequence of the items in coll. If no comparator is
  supplied, uses compare.  comparator must implement
  java.util.Comparator.  If coll is a Java array, it will be modified.
  To avoid this, sort a copy of the array.
nil
data.heap> 
