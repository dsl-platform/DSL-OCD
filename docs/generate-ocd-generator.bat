@echo off
setlocal

if exist "%USERPROFILE%\.ivy2\cache\com.dslplatform.ocd" rmdir /S /Q "%USERPROFILE%\.ivy2\cache\com.dslplatform.ocd"
if exist "%USERPROFILE%\.ivy2\local\com.dslplatform.ocd" rmdir /S /Q "%USERPROFILE%\.ivy2\local\com.dslplatform.ocd"

echo ### ABOUT TO RESET DSL-OCD (!HARD!) ###
pause
echo ### ARE YOU REALLY, REALLY SURE ??? ###
pause

set OCD=%~dp0\DSL-OCD
cd /D "%OCD%"

call git reset --hard
call git clean -d -f

:: cd "%OCD%\util\testing"
:: call sbt clean update eclipse publishLocal publish
:: copy /Y "%OCD%\util\testing\target\dsl-ocd-util-testing-0.1.0.jar" "%OCD%\test\src\main\resources\template.tools\lib"

:: cd "%OCD%\util\report"
:: call mvn clean package
:: copy /Y "%OCD%\util\report\target\ocd-report-0.1.0-jar-with-dependencies.jar" "%OCD%\test\src\main\resources\template.tools\build\ocd-report-0.1.0.jar"

:: cd "%OCD%\util\ping"
:: call sbt clean update eclipse publishLocal publish
:: copy /Y "%OCD%\util\ping\target\dsl-ocd-util-ping-0.1.0.jar" "%OCD%\test\src\main\resources\template.tools\build"

cd "%OCD%\model\generator"
call sbt clean update eclipse run

cd "%OCD%\model\kinds"
call sbt clean update eclipse publishLocal publish

cd "%OCD%\model\boxes"
call sbt clean update eclipse publishLocal publish

cd "%OCD%\model\types"
call sbt clean update eclipse publishLocal publish

cd "%OCD%\model\dsls"
call sbt clean update eclipse publishLocal publish

cd "%OCD%\model\javas"
call sbt clean update eclipse publishLocal publish

cd "%OCD%\model\java-asserts"
call sbt clean update eclipse publishLocal publish
copy /Y "%OCD%\model\java-asserts\target\dsl-ocd-model-java-asserts-0.1.0-SNAPSHOT.jar" "%OCD%\test\src\main\resources\template.tools\lib"

cd "%OCD%\model\scalas"
call sbt clean update eclipse publishLocal publish

cd "%OCD%\test"
call sbt clean update eclipse run

popd
goto :EOF
