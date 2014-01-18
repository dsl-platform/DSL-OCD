@echo off
setlocal

set GENERATED=%~dp0src\generated

java -Ddsl-clc-api-properties=~/.config/DSL-OCD/ocd.config ^
  -jar "%~dp0dsl-clc.jar" latest ^
  --project-ini-path="~/.config/DSL-OCD/projects-compile.ini" ^
  --dsl-path="%~dp0dsl" ^
  --language=scala ^
  --output-path="%GENERATED%" ^
  %*
