@echo off
pushd "%~dp0"

sbt packCopyDependencies
del dependencies\downloader-*.jar

popd