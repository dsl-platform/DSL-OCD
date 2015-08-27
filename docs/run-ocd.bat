@echo off
setlocal
pushd "%~dp0"

if exist DSL-Trash rmdir /S /Q DSL-Trash
if exist "%USERPROFILE%\.ivy2\cache\com.dslplatform.ocd" move "%USERPROFILE%\.ivy2\cache\com.dslplatform.ocd" DSL-Trash
if exist "%USERPROFILE%\.ivy2\local\com.dslplatform.ocd" move "%USERPROFILE%\.ivy2\local\com.dslplatform.ocd" DSL-Trash

if exist DSL-OCD move DSL-OCD DSL-Trash
if exist DSL-OCD-Target move DSL-OCD-Target DSL-Trash

start /MIN cmd /c rmdir /S /Q DSL-Trash

if exist DSL-OCD-SSH goto :ssh
git clone --depth 1 https://melezov@github.com/element-doo/DSL-OCD.git
goto :cloned

:ssh
set DSL_SSH_OLD_HOME=%HOME%
set HOME=DSL-OCD-SSH
git clone --depth 1 ssh://git@github.com/element-doo/DSL-OCD.git
set HOME=%DSL_SSH_OLD_HOME%

:cloned
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