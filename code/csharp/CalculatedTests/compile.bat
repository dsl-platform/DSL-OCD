@echo off
setlocal

set GENERATED=%~dp0src\generated

java -jar ^
  "%~dp0dsl-clc.jar" latest ^
  --project-ini-path="%GENERATED%\resources\project.ini" ^
  --dsl-path="%~dp0dsl" ^
  --output-path="%GENERATED%" ^
  %*
