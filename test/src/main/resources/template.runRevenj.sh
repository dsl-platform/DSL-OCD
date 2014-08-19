#!/bin/sh

# Configs:
CURRENT_DIR=$(pwd)

REVENJ_PATH=./revenj/

echo "Starting our instance of Revenj, on localhost:${projectPort}"
mono "$REVENJ_PATH/Revenj.Http.exe"

