# Monument Locator

Purpose of this application is pretty simple. Use GeoLocation to verify
locations of monuments defined in a monuments.geojson file.

Uses [LeafletJS](http://leafletjs.com/) with the following plugins.

* [Leaflet.markercluster](https://github.com/Leaflet/Leaflet.markercluster)
* [leaflet-locatecontrol](https://github.com/domoritz/leaflet-locatecontrol)
* [esri-leaflet](https://github.com/Esri/esri-leaflet)

## Installation
>Will load dependencies with [Bower](https://github.com/bower/bower) and build Leaflet from source.

    chmod 755 setup.sh
    ./setup.sh

## Build
>Compiles JS to resources/public

    chmod 755 build.sh
    ./build.sh

Application written in [ClojureScript](https://github.com/clojure/clojurescript), post-processed with [GruntJS](http://gruntjs.com/).

*Note* - I did not include a monuments.geojson file for application.
Place a monuments.geojson file in [json folder](https://github.com/odoe/monitoringlocator/tree/master/resources/json) to use.
