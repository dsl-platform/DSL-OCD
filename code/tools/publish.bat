@echo off

echo Publishing project to the binary repository ...
call "%~dp0sbt.bat" %* clean publish
