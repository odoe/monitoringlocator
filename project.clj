(defproject map-prj "0.1.0-SNAPSHOT"
  :description "Application to verify monument locations"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1586"]
                 [prismatic/dommy "0.1.1"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "0.3.0"]]
  :cljsbuild
  {:builds
   [{:source-paths ["src/cljs"],
     :compiler
     {:pretty-print false,
      :output-to "resources/js/main.js",
      :externs ["src/cljs/externs/externs.js"],
      :optimizations :advanced }}]})
