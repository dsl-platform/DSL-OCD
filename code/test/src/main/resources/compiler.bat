@echo off
setlocal enabledelayedexpansion

rem ---------------------------------------------------------------------------

rem Switch current directory to here
set BASE=%~dp0

rem Read project name from the parent folder
for %%? in ("%BASE%..") do set NAME=%%~n?

rem Set source folders for reading DSL generated files & tests
set SRC=%BASE%src\
set SRC_GEN=%SRC%generated\
set SRC_GEN_JAVA=%SRC_GEN%java\
set SRC_GEN_RSRC=%SRC_GEN%resources\
set SRC_TEST=%SRC%test\
set SRC_TEST_JAVA=%SRC_TEST%java\
set SRC_TEST_RSRC=%SRC_TEST%resources\

rem Set log folder for writing scripts & logs
set LOG=%BASE%log\

rem Set binaries folder for compiling generated & test classes
set BIN=%BASE%bin\
set BIN_GEN=%BIN%generated\
set BIN_TEST=%BIN%test\

rem Set jar folder for bundling of compiled classes
set JAR=%BASE%jar\
set JAR_GEN=%JAR%%NAME%-generated.jar
set JAR_TEST=%JAR%%NAME%-test.jar

rem Set tools folder which holds JDK/JRE
for %%? in ("%BASE%..\..\..\..\tools\java") do set TOOLS=%%~f?\
set TOOLS_JRE=%TOOLS%jre\jre-6u45\
set TOOLS_JRE_JAVA=%TOOLS_JRE%bin\java.exe
set TOOLS_JRE_RT=%TOOLS_JRE%lib\rt.jar
set TOOLS_JDK=%TOOLS%jdk\jdk-8u0\
set TOOLS_JDK_JAVAC=%TOOLS_JDK%bin\javac.exe
set TOOLS_JDK_JAR=%TOOLS_JDK%bin\jar.exe

rem Set lib folder which hosts compile & test dependencies
set LIB=%TOOLS%lib\
set LIB_COMPILE=%LIB%compile\
set LIB_TEST=%LIB%test\

rem ---------------------------------------------------------------------------

rem No steps other than setup are taken by default, they need to be specified
set CUR_STEP=1
set MAX_STEP=1

set DO_CLEAN=false
set DO_SETUP=true
set DO_DSL=false
set DO_COMPILE_GENERATED=false
set DO_PACKAGE_GENERATED=false
set DO_COMPILE_TEST=false
set DO_PACKAGE_TEST=false
set DO_RUN_TEST=false

:parser
if "%~1"=="" goto :parser_end

if "%~1"=="clean" (
  set DO_CLEAN=true
  goto :parser_loop
)

if "%~1"=="dsl" (
  set DO_DSL=true
  goto :parser_loop
)

if "%~1"=="compile:generated" (
  set DO_COMPILE_GENERATED=true
  goto :parser_loop
)

if "%~1"=="package:generated" (
  set DO_PACKAGE_GENERATED=true
  goto :parser_loop
)

if "%~1"=="compile:test" (
  set DO_COMPILE_TEST=true
  goto :parser_loop
)

if "%~1"=="package:test" (
  set DO_PACKAGE_TEST=true
  goto :parser_loop
)

if "%~1"=="run:test" (
  set DO_RUN_TEST=true
  goto :parser_loop
)

echo Unknown parameter "%~1" found, system halted^^!
goto :exit

:parser_loop
set /a MAX_STEP+=1
shift
goto :parser

:parser_end

rem ---------------------------------------------------------------------------

if not %DO_CLEAN%==true goto :clean_skip

echo.
echo ### [%CUR_STEP%/%MAX_STEP%] ### CLEANING OLD RESOURCES
echo.

if exist "%SRC_GEN_JAVA%" (
  echo + Cleaning generated sources ...
  rmdir /S /Q "%SRC_GEN_JAVA%"
)

if exist "%BIN_GEN%" (
  echo + Cleaning output class folder for generated sources ...
  rmdir /S /Q "%BIN_GEN%"
)

if exist "%BIN_TEST%" (
  echo + Cleaning output class folder for tests  ...
  rmdir /S /Q "%BIN_TEST%"
)

if exist "%JAR%*.jar" (
  echo + Cleaning generated ^& test jars ...
  del /Q "%JAR%*.jar"
)

if exist "%LOG%" (
  echo + Cleaning scripts, params ^& logs ...
  del /Q "%LOG%*.*"
)

set /a CUR_STEP+=1
:clean_skip

rem ---------------------------------------------------------------------------

if not %DO_SETUP%==true goto :setup_skip

echo.
echo ### [%CUR_STEP%/%MAX_STEP%] ### SETTING UP DIRECTORIES
echo.

if not exist "%SRC_GEN_JAVA%" (
  echo + Creating generated sources folder ...
  mkdir "%SRC_GEN_JAVA%"
)

if not exist "%SRC_GEN_RSRC%" (
  echo + Creating generated resources folder ...
  mkdir "%SRC_GEN_RSRC%"
)

if not exist "%BIN_GEN%" (
  echo + Creating output class folder for generated sources ...
  mkdir "%BIN_GEN%"
)

if not exist "%BIN_TEST%" (
  echo + Creating output class folder for tests  ...
  mkdir "%BIN_TEST%"
)

if not exist "%JAR%" (
  echo + Creating output folder for jars ...
  mkdir "%JAR%"
)

if not exist "%LOG%" (
  echo + Creating log folder ...
  mkdir "%LOG%"
)

set /a CUR_STEP+=1
:setup_skip

rem ---------------------------------------------------------------------------

if not %DO_DSL%==true goto :dsl_skip

rem if not exist "%DSL%" goto :compile_dsl_ok
rem if exist "%SRC_GEN_JAVA%" goto :compile_dsl_ok
rem
rem echo.
rem echo ### [1/6] ### GENERATING SOURCES FROM THE DSL
rem echo.
rem
rem set DSL_COMPILE_RUN=%LOG%dsl-compile.bat
rem set DSL_COMPILE_LOG=%LOG%dsl-compile.log
rem
rem echo + Creating DSL compile script ...
rem > "%DSL_COMPILE_RUN%" (
rem   echo @"%LIB_JAVA%" ^^
rem   echo   -jar ^^
rem   echo   "%~dp0dsl-clc.jar" latest ^^
rem   echo   --logging-level=trace ^^
rem   echo   --project-ini-path="%SRC_GEN_RSRC%dsl-project.ini" ^^
rem   echo   --dsl-path="%~dp0..\dsl" ^^
rem   echo   --language=java ^^
rem   echo   --with-active-record ^^
rem   echo   --output-path="%SRC_GEN%
rem )
rem
rem echo + Running DSL compilation ...
rem call "%DSL_COMPILE_RUN%" > "%DSL_COMPILE_LOG%" 2>&1
rem if not errorlevel 1 goto :compile_dsl_ok
rem echo ^^! DSL compilation failed, see log in:
rem echo "%DSL_COMPILE_LOG%"
rem echo.
rem goto :EOF
rem :compile_dsl_ok

set /a CUR_STEP+=1
:dsl_skip

rem ---------------------------------------------------------------------------

if not %DO_COMPILE_GENERATED%==true goto :compile_generated_skip

echo.
echo ### [%CUR_STEP%/%MAX_STEP%] ### COMPILING GENERATED SOURCES
echo.

set GEN_SRC_JAVAC_RUN=%LOG%compile-generated.bat
set GEN_SRC_JAVAC_ARG=%LOG%compile-generated.params
set GEN_SRC_JAVAC_LOG=%LOG%compile-generated.log

rem Check if any generated source exists
for /f "usebackq delims=*" %%? in (`dir /S /B "%SRC_GEN_JAVA%*.java" 2^>NUL`) do (
  goto :compile_generated_found
)

echo ^^! No generated sources found, skipping compilation^^!
goto :compile_generated_end

:compile_generated_found
rem Compiling against JREs runtime library (JRE 6 compatibility)
echo + Creating arguments for the compiler script ... && >"%GEN_SRC_JAVAC_ARG%" (
  rem echo -verbose
  echo -deprecation
  echo -encoding UTF-8
  echo -Xlint
  echo -source 1.6
  echo -target 1.6
  echo -bootclasspath "%TOOLS_JRE_RT:\=/%"
  echo -d "%BIN_GEN:\=/%."
)

rem Adding compile dependencies to the classpath
set CLASSPATH=
for /f "usebackq delims=*" %%? in (`dir /S /B "%LIB_COMPILE%*.jar"`) do (
  set CLASSPATH=!CLASSPATH!;%%~f?
)

rem Add classpath to the parameters file
set CLASSPATH=%CLASSPATH:~1%
>>"%GEN_SRC_JAVAC_ARG%" echo -classpath "%CLASSPATH:\=/%"

rem Writing the generated sources to be parameters file
for /f "usebackq delims=*" %%? in (`dir /S /B "%SRC_GEN_JAVA%*.java" 2^>NUL`) do (
  set GEN_SRC_TARGET=%%~f?
  >>"%GEN_SRC_JAVAC_ARG%" echo "%GEN_SRC_TARGET:\=/%"
)

rem The first @ turns off the echo, the second one is a javac syntax for loading the parameters file
echo + Creating the compiler script ... && >>"%GEN_SRC_JAVAC_RUN%" (
  echo @"%TOOLS_JDK_JAVAC%" ^^
  echo   @"%GEN_SRC_JAVAC_ARG%"
)

echo + Compiling generated sources ...
call "%GEN_SRC_JAVAC_RUN%" >"%GEN_SRC_JAVAC_LOG%" 2>&1
if not errorlevel 1 goto :compile_generated_end
echo ^^! Error occurred whilst compiling generated sources, see log in:
echo "%GEN_SRC_JAVAC_LOG%"
echo.
goto :exit

:compile_generated_end
set /a CUR_STEP+=1
:compile_generated_skip

rem ---------------------------------------------------------------------------

if not %DO_PACKAGE_GENERATED%==true goto :package_generated_skip

echo.
echo ### [%CUR_STEP%/%MAX_STEP%] ### PACKAGING GENERATED CLASSES
echo.

set GEN_SRC_JAR_RUN=%LOG%package-generated.bat
set GEN_SRC_JAR_LOG=%LOG%package-generated.log

echo + Creating jar script for generated classes ^& resources ...
>"%GEN_SRC_JAR_RUN%" (
  echo @"%TOOLS_JDK_JAR%" ^^
  echo   -cfv ^^
  echo   "%JAR_GEN%" ^^
  echo   -C "%BIN_GEN%." . ^^
  echo   -C "%SRC_GEN_RSRC%." .
)

rem Provide different message if there are no class files to package
set GEN_SRC_JAR_MSG=^^! No generated classes found, will only package the resources ...
for /f "usebackq delims=*" %%? in (`dir /S /B "%BIN_GEN%*.class" 2^>NUL`) do (
  set GEN_SRC_JAR_MSG=+ Packaging generated classes ...
  goto :package_generated_found
)
:package_generated_found

echo !GEN_SRC_JAR_MSG!
call "%GEN_SRC_JAR_RUN%" >"%GEN_SRC_JAR_LOG%" 2>&1
if not errorlevel 1 goto :package_generated_end
echo ^^! Error occurred whilst jarring generated sources, see log in:
echo "%GEN_SRC_JAR_LOG%"
echo.
goto :EOF

:package_generated_end
set /a CUR_STEP+=1
:package_generated_skip

rem ---------------------------------------------------------------------------

if not %DO_COMPILE_TEST%==true goto :compile_test_skip

echo.
echo ### [%CUR_STEP%/%MAX_STEP%] ### COMPILING TESTS
echo.

set TEST_JAVAC_RUN=%LOG%compile-test.bat
set TEST_JAVAC_ARG=%LOG%compile-test.params
set TEST_JAVAC_LOG=%LOG%compile-test.log

rem Check if any test exists
for /f "usebackq delims=*" %%? in (`dir /S /B "%SRC_TEST_JAVA%*.java" 2^>NUL`) do (
  goto :compile_test_found
)

echo ^^! No test sources found, skipping compilation^^!
goto :compile_test_end

:compile_test_found
rem Compiling against JREs runtime library (JRE 6 compatibility)
echo + Creating arguments for the compiler script ... && >"%TEST_JAVAC_ARG%" (
  rem echo -verbose
  echo -deprecation
  echo -encoding UTF-8
  echo -Xlint
  echo -source 1.6
  echo -target 1.6
  echo -bootclasspath "%TOOLS_JRE_RT:\=/%"
  echo -d "%BIN_TEST:\=/%."
)

rem Adding compile dependencies to the classpath
set CLASSPATH=
for /f "usebackq delims=*" %%? in (`dir /S /B "%LIB_COMPILE%*.jar"`) do (
  set CLASSPATH=!CLASSPATH!;%%~f?
)

rem Adding test dependencies to the classpath
for /f "usebackq delims=*" %%? in (`dir /S /B "%LIB_TEST%*.jar"`) do (
  set CLASSPATH=!CLASSPATH!;%%~f?
)

if not exist "%JAR_GEN%" (
  echo ^^! Missing generated dependency, you need to compile/package generated sources first^^!
  goto :exit
)

rem Adding generated package to the classpath
set CLASSPATH=%CLASSPATH%;%JAR_GEN%

rem Add classpath to the parameters file
set CLASSPATH=%CLASSPATH:~1%
>>"%TEST_JAVAC_ARG%" echo -classpath "%CLASSPATH:\=/%"

rem Writing the test sources to be parameters file
for /f "usebackq delims=*" %%? in (`dir /S /B "%SRC_TEST_JAVA%*.java" 2^>NUL`) do (
  set TEST_TARGET=%%~f?
  >>"%TEST_JAVAC_ARG%" echo "!TEST_TARGET:\=/!"
)

rem The first @ turns off the echo, the second one is a javac syntax for loading the parameters file
echo + Creating the compiler script ... && >>"%TEST_JAVAC_RUN%" (
  echo @"%TOOLS_JDK_JAVAC%" ^^
  echo   @"%TEST_JAVAC_ARG%"
)

echo + Compiling test sources ...
call "%TEST_JAVAC_RUN%" >"%TEST_JAVAC_LOG%" 2>&1
if not errorlevel 1 goto :compile_test_end
echo ^^! Error occurred whilst compiling test sources, see log in:
echo "%TEST_JAVAC_LOG%"
echo.
goto :exit

:compile_test_end
set /a CUR_STEP+=1
:compile_test_skip

rem ---------------------------------------------------------------------------

if not %DO_PACKAGE_TEST%==true goto :package_test_skip

echo.
echo ### [%CUR_STEP%/%MAX_STEP%] ### PACKAGING TEST CLASSES
echo.

set TEST_JAR_RUN=%LOG%package-test.bat
set TEST_JAR_LOG=%LOG%package-test.log

echo + Creating jar script for test classes ^& resources ...
>"%TEST_JAR_RUN%" (
  echo @"%TOOLS_JDK_JAR%" ^^
  echo   -cfv ^^
  echo   "%JAR_TEST%" ^^
  echo   -C "%BIN_TEST%." . ^^
  echo   -C "%SRC_TEST_RSRC%." .
)

rem Provide different message if there are no class files to package
set TEST_JAR_MSG=^^! No test classes found, will only package the resources ...
for /f "usebackq delims=*" %%? in (`dir /S /B "%BIN_TEST%*.class" 2^>NUL`) do (
  set TEST_JAR_MSG=+ Packaging test classes ...
  goto :package_test_found
)
:package_test_found

echo !TEST_JAR_MSG!
call "%TEST_JAR_RUN%" >"%TEST_JAR_LOG%" 2>&1
if not errorlevel 1 goto :package_test_end
echo ^^! Error occurred whilst jarring test classes, see log in:
echo "%TEST_JAR_LOG%"
echo.
goto :EOF

:package_test_end
set /a CUR_STEP+=1
:package_test_skip

rem ---------------------------------------------------------------------------

if not %DO_RUN_TEST%==true goto :run_test_skip

echo.
echo ### [%CUR_STEP%/%MAX_STEP%] ### RUNNING TESTS
echo.

set RUN_TEST_RUN=%LOG%run-test-run.bat
set RUN_TEST_LOG=%LOG%run-test-run.log

echo + Creating JUnit run script ...
>"%RUN_TEST_RUN%" (
  echo @"%TOOLS_JRE_JAVA%" ^^
  echo   -classpath "%LIB_COMPILE%*;%LIB_TEST%*;%JAR%*" ^^
  echo   org.junit.runner.JUnitCore ^^
  echo   com.dslplatform.ocd.test.TestEntryPoint
)

echo + About to run JUnit ...
echo.

call "%RUN_TEST_RUN%" >"%RUN_TEST_LOG%" 2>&1

:run_test_skip

rem ---------------------------------------------------------------------------

:exit
endlocal
