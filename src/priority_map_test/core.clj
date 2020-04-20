(ns priority-map-test.core
  (:gen-class)
  (:refer-clojure :exclude [subseq])
  (:require [clojure.data.priority-map :refer [subseq priority-map-keyfn-by]]))

(def p (priority-map-keyfn-by first <
                              :a [2 :apple], :b [1 :banana], :c [3 :carrot]))

(defn call-subseq [pm n]
  (subseq pm <= n))

(defn -main [& args]
  (prn "main running")
  (call-subseq p 2))
