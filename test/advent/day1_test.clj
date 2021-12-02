(ns advent.day1-test
  (:require [advent.day1 :as day1]
            [clojure.test :refer :all]))

 
(deftest deeper-count-test
  (is (= 7 (day1/deeper-count [199
                               200
                               208
                               210
                               200
                               207
                               240
                               269
                               260
                               263]))))
