# Monument Locator

Purpose of this application is pretty simple. Use GeoLocation to verify
locations of monuments defined in a monuments.geojson file.

Uses [LeafletJS](http://leafletjs.com/) with the following plugins.

* [Leaflet.markercluster](https://github.com/Leaflet/Leaflet.markercluster)
* [leaflet-locatecontrol](https://github.com/domoritz/leaflet-locatecontrol)
* [esri-leaflet](https://github.com/Esri/esri-leaflet)

## Demo
Demo of application can be seen [here](http://odoe.github.io/monitoringlocator/resources/public/).

## Installation
>Will load dependencies with [Bower](https://github.com/bower/bower) and build Leaflet from source.

    chmod 755 setup.sh
    ./setup.sh

## Build
>Compiles JS to resources/public

    chmod 755 build.sh
    ./build.sh

Application written in [ClojureScript](https://github.com/clojure/clojurescript), post-processed with [GruntJS](http://gruntjs.com/).

*Note* - I included a dummy [monuments.geojson](https://github.com/odoe/monitoringlocator/blob/gh-pages/resources/json/monuments.geojson) file for application.
