#!/bin/sh
echo start cljs build...
lein cljsbuild once
echo cljs build complete.
echo start grunt build...
grunt build
echo grunt build complete.
echo application compiled.
