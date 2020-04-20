(ns priority-map-test.core-test
  (:require [clojure.test :refer :all]
            [priority-map-test.core :refer :all]))

(deftest subseq-test
  (testing "showing that clojure.data.priority-map/subseq does not live well with protojure"
    (is (false (call-subseq p 2)))))
