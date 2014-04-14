@echo off

echo Running the model generator ...
call "%~dp0sbt.bat" %* run
