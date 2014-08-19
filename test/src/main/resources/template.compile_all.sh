#!/bin/bash

##
# Descends into all generated projects and:
#   - creates the database if it does not exist
#   - starts the DSL compiler client, feeds it only yeses

CURRENT=$(pwd)
for DIR in */; do
    echo "Descending into: " $DIR
    cd $DIR
    bash create_database.sh
    yes | bash compile_dsls.sh
    cd $CURRENT
done
