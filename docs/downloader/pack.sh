#!/bin/bash
cd "`dirname "$0"`"

sbt packCopyDependencies
rm dependencies/downloader-*.jar
