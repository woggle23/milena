(defproject dvlopt/milena
            "0.4.0-alpha3"

  :description  "Clojure client for Kafka"
  :url          "https://github.com/dvlopt/milena"
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.apache.kafka/kafka-clients "1.0.0"]
                 [org.apache.kafka/kafka-streams "1.0.0"]]
  :profiles     {:dev {:source-paths ["dev"]
                       :main         user
                       :dependencies [[org.clojure/clojure    "1.9.0"]
                                      [org.clojure/test.check "0.10.0-alpha2"]
                                      [criterium              "0.4.4"]
                                      [com.taoensso/nippy     "2.13.0"]]
                       :plugins      [[venantius/ultra "0.5.1"]
                                      [lein-midje      "3.0.0"]
                                      [lein-codox      "0.10.3"]]
                       :codox        {:output-path  "doc/auto"
                                      :source-paths ["src"]}
                       :global-vars  {*warn-on-reflection* true}}})
