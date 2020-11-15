(ns example
  (:require [clj-http.client :as client]))

(defn -main
  [& _]
  (println (get (client/get "https://example.com") :body)))
