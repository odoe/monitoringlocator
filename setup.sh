#!/bin/bash
echo start set up ...
echo installing node modules
npm install
echo installing bower components ...
bower install
echo compile leaflet ...
cd resources/libs/Leaflet
npm install
jake
cd ../..
echo set up is complete.
