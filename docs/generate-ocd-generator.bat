@echo off
pushd "D:\Code"

if exist "C:\Users\Marko\.ivy2\cache\com.dslplatform.ocd" rmdir /S /Q "C:\Users\Marko\.ivy2\cache\com.dslplatform.ocd"
if exist "C:\Users\Marko\.ivy2\local\com.dslplatform.ocd" rmdir /S /Q "C:\Users\Marko\.ivy2\local\com.dslplatform.ocd"

echo ### ABOUT TO RESET DSL-OCD (!HARD!) ###
pause
echo ### ARE YOU REALLY, REALLY SURE ??? ###
pause

cd "D:\Code\DSL-OCD"
git reset --hard
git clean -d -f

cd "D:\Code\DSL-OCD\util\generator"
call sbt clean update eclipse publishLocal publish

cd "D:\Code\DSL-OCD\util\testing"
call sbt clean update eclipse publishLocal publish
copy /Y "D:\Code\DSL-OCD\util\testing\target\dsl-ocd-util-testing-0.1.0-SNAPSHOT.jar" "D:\Code\DSL-OCD\test\src\main\resources\template.tools\lib"

cd "D:\Code\DSL-OCD\model\generator"
call sbt clean update eclipse run

cd "D:\Code\DSL-OCD\model\kinds"
call sbt clean update eclipse publishLocal publish

cd "D:\Code\DSL-OCD\model\boxes"
call sbt clean update eclipse publishLocal publish

cd "D:\Code\DSL-OCD\model\types"
call sbt clean update eclipse publishLocal publish

cd "D:\Code\DSL-OCD\model\dsls"
call sbt clean update eclipse publishLocal publish

cd "D:\Code\DSL-OCD\model\javas"
call sbt clean update eclipse publishLocal publish

cd "D:\Code\DSL-OCD\model\java-asserts"
call sbt clean update eclipse publishLocal publish
copy /Y "d:\Code\DSL-OCD\model\java-asserts\target\dsl-ocd-model-java-asserts-0.1.0-SNAPSHOT.jar" "D:\Code\DSL-OCD\test\src\main\resources\template.tools\lib"

cd "D:\Code\DSL-OCD\model\scalas"
call sbt clean update eclipse publishLocal publish

cd "D:\Code\DSL-OCD\test"
call sbt clean update eclipse run

cd "D:\Code\DSL-OCD-Target"
call ant all report
report\site\index.html

popd
goto :EOF
