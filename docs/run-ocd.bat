@echo off
pushd "%~dp0"

if exist "%USERPROFILE%\.ivy2\cache\com.dslplatform.ocd" rmdir /S /Q "%USERPROFILE%\.ivy2\cache\com.dslplatform.ocd"
if exist DSL-OCD rmdir /S /Q DSL-OCD
if exist DSL-OCD-Target rmdir /S /Q DSL-OCD-Target

git clone --depth 1 https://melezov@github.com/element-doo/DSL-OCD.git
cd DSL-OCD\test
call sbt run

echo Tweak DSL-OCD-Target settings and press Enter to contiue
pause

cd ..\..\DSL-OCD-Target
call ant drop-db
call ant all >report\windows-run.log 2>&1
call ant report

cd report\site
start index.html
7z a -r ..\windows-run.zip *

popd
