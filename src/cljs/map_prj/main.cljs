(ns map-prj.main
  (:use-macros
    [dommy.macros :only [sel1]])
  (:require
    [dommy.core :as dommy]
    [goog.net.XhrIo :as xhr]))

(def L (this-as ct (aget ct "L")))

(def esri (.-esri L))

(def control (.-control L))

(defn map-div [n]
  "Creates a map-div element with id given."
  [:div { :id (str n) }])

(defn parseResponse [e]
  "Returns JSON response from a target."
  (.getResponseJson
    (.-target e)))

(defn labeler [feature layer]
  (.bindPopup layer
              (.-Monument (.-properties feature))))

(def lblhandle (js-obj "onEachFeature" labeler))

(defn monuments [m]
  (fn [event]
    "Handles the GeoJSON of the monuments."
    (let [data (parseResponse event)]
      (let [markers
            (.markerClusterGroup L)]
        (.addLayer markers
                   (.geoJson L data lblhandle))
        (.addLayer m markers)
        (.fitBounds m
                    (.getBounds markers))
        ))))

(defn handler [event]
  "Handles the receipt of JSON configuration."
  (let [data (parseResponse event)]
    (dommy/append!
      (sel1 :body) (map-div (.-mapname data)))

    (let [emap (-> L (.map (.-mapname data))
                   (.setView (.-center data) (.-zoom data)))]
      (-> esri (.basemapLayer (.-basemap data))
          (.addTo emap))
      (-> control (.locate (js-obj "drawCircle" false "follow" true))
          (.addTo emap))
      (xhr/send (.-monumentsfile data) (monuments emap) "GET"))))

;; start the application
(xhr/send "config.json" handler "GET")
