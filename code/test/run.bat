@echo off

echo Running the test generator ...
call "%~dp0sbt.bat" %* run
