(ns data.queue
  ())

(defprotocol IQueue
  (add [this o] "Adds an object into the Queue")
  (delete [this o] "Deletes an object from the front of the Queue"))

(defn queue []
  ())
