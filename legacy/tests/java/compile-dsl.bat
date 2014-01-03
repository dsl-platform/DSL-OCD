@echo off
setlocal

set GENERATED=%~dp0src\generated

java -jar ^
  "%~dp0dsl-clc.jar" latest ^
  --project-ini-path="~/.config/DSL-OCD/project.ini" ^
  --dsl-path="%~dp0dsl" ^
  --output-path="%GENERATED%" ^
  %*
