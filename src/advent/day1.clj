(ns advent.day1)

(def sliding-window-size 3)

(defn deeper-count
  "When provided a list of depths, count the number of times a depth measurement 
  increases from the previous measurement."
  [coll]
  (->> (partition 2 1 coll)
       (filter (fn [[depth1 depth2]] (< depth1 depth2)))
       count))

(defn deeper-sliding-count
  "When provided a list of depths, count the number of times the sum of 
  measurements in this sliding window increases from the previous sum."
  [coll]
  (->> (partition sliding-window-size 1 coll)
       (map (partial reduce +))
       deeper-count))
