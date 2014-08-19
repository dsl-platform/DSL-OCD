#!/bin/bash

##
# Stops all currently running Revenj instances.
# Runs the Revenj instances for each of the generated projects.

CURRENT=$(pwd)

echo "Killing off old server instances..."
ps aux | grep 'mono.*Revenj.Http.exe' | awk '{printf "%d\n",$2}' | xargs kill -9

echo "Deploying all server instances"
for DIR in */; do
    cd $DIR
    if [ -e runRevenj.sh ]; then
        bash runRevenj.sh &
    fi
    cd $CURRENT
done
