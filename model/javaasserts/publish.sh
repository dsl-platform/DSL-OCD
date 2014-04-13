#!/bin/bash

cwd="$( pwd )"; cd "$( dirname "$0" )"; dir="$( pwd )"; cd "$cwd"

echo Publishing project to a binary repository ...
"$dir/sbt.sh" clean publish
