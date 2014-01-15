#!/bin/bash

echo Running the model generator ...
`dirname $0`/sbt.sh "$@" run
