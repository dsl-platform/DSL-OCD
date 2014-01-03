#!/bin/sh

dir="$( dirname "$(readlink -f "$0")" )"
generated="$dir/src/generated"

java \
  -jar "$dir/dsl-clc.jar" latest \
  --project-ini-path='~/.config/DSL-OCD/project.ini' \
  --dsl-path="$dir/dsl" \
  --output-path="$generated" \
  "$@"
