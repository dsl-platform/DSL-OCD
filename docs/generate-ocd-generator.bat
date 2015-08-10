@echo off
pushd "D:\Code"

if exist "C:\Users\Marko\.ivy2\cache\com.dslplatform.ocd" rmdir /S /Q "C:\Users\Marko\.ivy2\cache\com.dslplatform.ocd"
if exist "C:\Users\Marko\.ivy2\local\com.dslplatform.ocd\" rmdir /S /Q "C:\Users\Marko\.ivy2\local\com.dslplatform.ocd"
if exist "D:\Code\DSL-OCD-Target" rmdir /S /Q "D:\Code\DSL-OCD-Target"

if exist DSL-OCD-Publish rmdir /S /Q DSL-OCD-Publish
call git clone --depth 1 file:///D:\Code\DSL-OCD DSL-OCD-Publish

cd "D:\Code\DSL-OCD-Publish\util\generator"
call sbt publishLocal publish

cd "D:\Code\DSL-OCD-Publish\util\testing"
call sbt publishLocal publish
copy /Y "D:\Code\DSL-OCD-Publish\util\testing\target\dsl-ocd-util-testing-0.1.0-SNAPSHOT.jar" "D:\Code\DSL-OCD\test\src\main\resources\template.tools\lib"

cd "D:\Code\DSL-OCD-Publish\model\generator"
call sbt run

cd "D:\Code\DSL-OCD-Publish\model\kinds"
call sbt publishLocal publish

cd "D:\Code\DSL-OCD-Publish\model\boxes"
call sbt publishLocal publish

cd "D:\Code\DSL-OCD-Publish\model\types"
call sbt publishLocal publish

cd "D:\Code\DSL-OCD-Publish\model\dsls"
call sbt publishLocal publish

cd "D:\Code\DSL-OCD-Publish\model\javas"
call sbt publishLocal publish

cd "D:\Code\DSL-OCD-Publish\model\java-asserts"
call sbt publishLocal publish
copy /Y "d:\Code\DSL-OCD-Publish\model\java-asserts\target\dsl-ocd-model-java-asserts-0.1.0-SNAPSHOT.jar" "D:\Code\DSL-OCD\test\src\main\resources\template.tools\lib"

cd "D:\Code\DSL-OCD-Publish\model\scalas"
call sbt publishLocal publish

cd "D:\Code\DSL-OCD\util\generator"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\util\testing"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\generator"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\kinds"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\boxes"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\types"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\dsls"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\javas"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\java-asserts"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\model\scalas"
call sbt clean eclipse

cd "D:\Code\DSL-OCD\test"
call sbt clean eclipse run

cd "D:\Code\DSL-OCD-Target"
call ant all report
report\site\index.html

popd
goto :EOF
