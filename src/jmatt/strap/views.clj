(ns jmatt.strap.views
  (:use [hiccup core page-helpers]))

(defn index-page []
  (html5
    [:head
      [:title "Strap"]
     (include-css "/css/reset-min.css")
     (include-css "/css/base-min.css")
     (include-css "/css/style.css")]
    [:body
     [:div {:class "container"}
     [:h1 "Strap"]
      [:h3 "Just put your website in <code>resources/public</code> and type <code>lein ring server</code>."]]]))

;; Add Any needed scaffolding here.
