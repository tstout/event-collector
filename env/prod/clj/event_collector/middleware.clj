(ns event-collector.middleware
  (:require
   [ring.middleware.defaults :refer [site-defaults api-defaults wrap-defaults]]))

(def middleware
  ;;[#(wrap-defaults % site-defaults)]
  [#(wrap-defaults % api-defaults)])
