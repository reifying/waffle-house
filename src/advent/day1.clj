(ns advent.day1)

(defn deeper-count
  "When provided a list of depths, count the number of times a depth measurement 
  increases from the previous measurement."
  [coll]
  (->> (partition 2 1 coll)
       (filter (fn [[depth1 depth2]] (< depth1 depth2)))
       count))
