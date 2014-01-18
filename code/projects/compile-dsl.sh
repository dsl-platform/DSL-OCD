#!/bin/sh

dir="$( dirname "$(readlink -f "$0")" )"
generated="$dir/src/generated"

java -Ddsl-clc-api-properties=~/.config/DSL-OCD/ocd.config \
  -jar "$dir/dsl-clc.jar" latest \
  --project-ini-path='~/.config/DSL-OCD/projects-compile.ini' \
  --dsl-path="$dir/dsl" \
  --language=scala \
  --output-path="$generated" \
  "$@"
