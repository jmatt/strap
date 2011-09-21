(defproject strap "0.1.1"
  :description "Strap a Webserver Together."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [compojure "0.6.4"]
                 [hiccup "0.3.6"]]
  :dev-dependencies [[lein-ring "0.4.5"]]
  :ring {:handler jmatt.strap.routes/app})
