#!/bin/bash

echo Cross-publishing the project ...
`dirname $0`/sbt.sh clean +compile +publish
