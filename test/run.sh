#!/bin/bash

echo Running the test generator ...
`dirname $0`/sbt.sh "$@" run
