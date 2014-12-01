# The project base directory
BASE=$(pwd)

# The project name - the generated directory basename
NAME="$(basename ${projectRoot})"

# Generated (re)sources, and generated tests
SRC="$BASE/src"
SRC_GEN="$SRC/generated"
SRC_GEN_JAVA="$SRC_GEN/java"
SRC_GEN_RES="$SRC_GEN/resources"
SRC_TEST="$SRC/test"
SRC_TEST_JAVA="$SRC_TEST/java"
SRC_TEST_RES="$SRC_TEST/resources"

# Script basenames
DB_DROP=db-drop
DSL_COMPILE=dsl-compile
DEPLOY_MODEL=deploy-model
COMPILE_GENERATED=compile-generated
COMPILE_TEST=compile-test
PACKAGE_GENERATED=package-generated
PACKAGE_TESTS=package-test
RUN_TESTS=run-tests
START_REVENJ=start-revenj
KILL_REVENJ=kill-revenj

# Logging dir
LOG="$BASE/log"

# Scripts dir
SCRIPT="$BASE/bin"

# TODO: Binaries for compiling generated and test classes ?
TARGET="$BASE/target"
TARGET_MAIN="$TARGET/classes"
TARGET_TEST="$TARGET/test-classes"

# The project libraries dir, compiled and downloaded
PROJECT_LIB="$BASE/lib"

# The tools path
TOOLS="${toolsPath}"
JRE="$TOOLS/${javaParent}/jre"
JRE_BIN="$JRE/bin"
JDK="$TOOLS/${javaParent}/jdk"
RT_JAR="$JDK/lib/rt.jar"
JDK_BIN="$JDK/bin"
JAVA="$JDK_BIN/java"
JAVAC="$JDK_BIN/javac"
JDK_JAR="$JDK/bin/jar"

# DSL platform compiler client
TOOLS_DPCC="$TOOLS/dcc-java-user/dsl-clc.jar"
# TODO: vidi kaj je ovo
TOOLS_DPCC_AP="api.properties"

# DSL source which we are to compile
DSL_PATH="${dslSource}"
TEMPORARY_DIRECTORY_CLIENT="$BASE/client.tmp"
TEMPORARY_DIRECTORY_SERVER="$BASE/server.tmp"
DSL_EMPTY="$TOOLS/dsl/empty.dsl"

# Compile and test dependencies
JDK_LIB="$TOOLS/${javaParent}/jdk/lib"
COMMON_TEST_LIB="$TOOLS/${javaParent}/lib/test"

PROJECT_LIB="$BASE/lib"

REVENJ_PATH="$BASE/revenj"
REVENJ_EXE="$BASE/revenj/Revenj.Http.exe"
REVENJ_CONFIG_TEMPLATE=${revenjPath}
REVENJ_PID_FILE=.revenj.pid
GENERATED_MODEL=./model

function resetSteps() {
    maxSteps=0
}

function addStep() {
    maxSteps=$((maxSteps+1))
}

function remStep() {
    maxSteps=$((maxSteps-1))
}

function delIfExists() {
    if [ -e "$1" ]; then
	if [ ! -L "$1" ]; then
	    rm -rf "$1"
	fi
    fi
}

function title() {
    currentStep=$((currentStep+1))
    echo ""
    echo "##[$currentStep / $maxSteps]## $1"
}

function checkError() {
    if [ "$?" -ne 0 ]; then
	echo "$1"
	[[ "$2" ]] && echo "($2)"
	exit
    fi
}

function checkErrorNoExit() {
    if [ "$?" -ne 0 ]; then
	echo "$1"
	[[ "$2" ]] && echo "($2)"
    fi
}

function tryRun() {
    local script=$1
    local msg=$2
    echo "Running the script: $script"
    bash "$script" 2>&1 | tee -a "$script.log"
    checkError "Error running the script $script check the log at $script.log !" "$msg"
}

function tryRunNoFail() {
    local script=$1
    local msg=$2
    echo "Running the script: $script"
    bash "$script" 2>&1 | tee -a "$script.log"
    checkErrorNoExit "Error running the script $script, check the log at $script.log !" "$msg"
}

function clean() {
    title "Cleaning old resources ..."

    echo "Cleaning generated sources ..."
    delIfExists "$SRC_GEN_JAVA"
    echo "Cleaning generated resources ..."
    delIfExists "$SRC_GEN_RES"
    echo "Cleaning output class folder for generated sources ..."
    delIfExists "$TARGET_MAIN"
    echo "Cleaning output class folder for tests ..."
    delIfExists "$TARGET_TEST"
    echo "Cleaning the target dir alltogether ..."
    delIfExists "$TARGET"
    echo "Cleaning generated and test jars ..."
    delIfExists "$PROJECT_LIB/"
    echo "Removing the DSL platform temporary folder"
    delIfExists "$TEMPORARY_DIRECTORY_CLIENT"
    delIfExists "$TEMPORARY_DIRECTORY_SERVER"
    echo "Cleaning scripts, params, and logs"
    delIfExists "$LOG"
    delIfExists "$SCRIPT"
    echo "Cleaning the Revenj model"
    delIfExists "$GENERATED_MODEL"
    echo "Cleaning the Revenj instance"
    delIfExists "$REVENJ_PATH"
    echo "Cleaning the Revenj PID file"
    delIfExists "$REVENJ_PID_FILE"
}

function setup() {
    title "Setting up directories and tools"

    echo "Trying to make the tools used executable"
    chmod a+x "$JRE_BIN/"*
    chmod a+x "$JDK_BIN/"*

    echo "Creating generated sources folder..."
    mkdir -p "$SRC_GEN_JAVA"
    echo "Creating generated resources folder..."
    mkdir -p "$SRC_GEN_RES"

    echo "Creating output class folder for generated sources"
    mkdir -p "$TARGET_MAIN"
    echo "Creating output class folder for generated tests"
    mkdir -p "$TARGET_TEST"
    echo "Creating output folder for JARs: $PROJECT_LIB"
    mkdir -p "$PROJECT_LIB"

    echo "Creating log folder"
    mkdir -p "$LOG"

    echo "Creating SCRIPTS folder"
    mkdir -p "$SCRIPT"

    echo "Creating temporary DSL files path..."
    mkdir -p "$TEMPORARY_DIRECTORY_CLIENT"
    mkdir -p "$TEMPORARY_DIRECTORY_SERVER"


    local script="$SCRIPT/db-create.sh"
    local log="$LOG/db-create.log"
    echo "Creating the database create script: $script"

    echo "# Generated database create script for ${projectName}" > "$script"
    echo "echo \"Creating the database: ${dbName} at ${dbHost}:${dbPort}\"" >> "$script"
    echo "createdb -U postgres ${dbName} -O ${dbUser}" >> "$script"
    
    tryRunNoFail $script "The database probably already exists"
}

generateDbDropScript() {
    echo "Creating the database drop script: $SCRIPT/$DB_DROP"

    echo "# Generated database drop script for ${projectName}" > "$SCRIPT/$DB_DROP"
    echo "echo \"Dropping the database: ${dbName} at ${dbHost}:${dbPort}\"" >> "$SCRIPT/$DB_DROP"
    echo "export PGPASSFILE=$BASE/.pgpass" >> "$SCRIPT/$DB_DROP"
    echo "dropdb -U ${dbOwner} ${dbName}" >> "$SCRIPT/$DB_DROP"
}

function dbClean() {
    generateDbDropScript

    tryRunNoFail "$SCRIPT/$DB_DROP" "The database is probably already dropped"
}

function generateDslCompileScript() {
    echo "Creating DSL compilation script: $script"

    echo "# Generated DSL compilation script for ${projectName}" > "$SCRIPT/$DSL_COMPILE"    
    echo "# Revenj compilation" > "$SCRIPT/$DSL_COMPILE"    
    echo "$JAVA -jar \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -jar $TOOLS_DPCC  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -u=hperadin@gmail.com  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -p=ocdpassword  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -temp=$TEMPORARY_DIRECTORY_SERVER  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -dsl=$DSL_PATH \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -download \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -java=$JDK_BIN \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -settings=active-record,manual-json \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -namespace=ocd \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -db=\"${dbHost}:${dbPort}/${dbName}?user=${dbUser}&password=${dbPassword}\" \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -target=revenj \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -parse \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -migration \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -apply \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -log  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -no-prompt  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "" >> "$SCRIPT/$DSL_COMPILE"
    echo "# Java client compilation" >> "$SCRIPT/$DSL_COMPILE"    
    echo "$JAVA -jar \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -jar $TOOLS_DPCC  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -u=hperadin@gmail.com  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -p=ocdpassword  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -temp=$TEMPORARY_DIRECTORY_CLIENT  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -dsl=$DSL_PATH \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -download \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -java=$JDK_BIN \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -settings=active-record \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -namespace=ocd \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -db=\"${dbHost}:${dbPort}/${dbName}?user=${dbUser}&password=${dbPassword}\" \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -target=java_client \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -parse \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -migration \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -apply \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -log  \\" >> "$SCRIPT/$DSL_COMPILE"
    echo "   -no-prompt  \\" >> "$SCRIPT/$DSL_COMPILE"
}

function dsl() {
    title "Generating sources from DSL"

    generateDslCompileScript

    tryRun "$SCRIPT/$DSL_COMPILE"
}

generateDeployModelScript() {
    echo "Creating the deploy model script $script"

    echo "# Generated script for deploying the generated model for project ${projectName}" > "$SCRIPT/$DEPLOY_MODEL"
    echo "echo \"Deploying the generated model revenj dll\"" >> "$SCRIPT/$DEPLOY_MODEL"
    echo "mkdir -p \"$GENERATED_MODEL\" && mv GeneratedModel.dll \"$GENERATED_MODEL\"" >> "$SCRIPT/$DEPLOY_MODEL"
    echo "echo \"Deploying the generated sources:\" " >> "$SCRIPT/$DEPLOY_MODEL"
    echo "cp -R \"$TEMPORARY_DIRECTORY_CLIENT/Java/ocd\" \"$SRC_GEN_JAVA\"" >> "$SCRIPT/$DEPLOY_MODEL"
    echo "cp -R java_client/*.jar \"$PROJECT_LIB\"" >> "$SCRIPT/$DEPLOY_MODEL"
    echo "echo \"Copying the template revenj configuration:\" " >> "$SCRIPT/$DEPLOY_MODEL"
    echo "cp $REVENJ_CONFIG_TEMPLATE/Revenj.Http.exe.config.template $REVENJ_PATH/Revenj.Http.exe.config" >> "$SCRIPT/$DEPLOY_MODEL"
}

function deploy() {
    title "Deploying the generated model"
    
    generateDeployModelScript

    tryRun "$SCRIPT/$DEPLOY_MODEL"
    
    echo "Cleaning the compiler default lib dir"
    delIfExists "java_client"

    # TODO: cleanup Eclipse to use only the sources
    echo "Moving the generated model to the libs dir (we will be using only the sources, but eclipse needs it)"
    mv generated-model-java.jar lib/
}

function generateCompileGeneratedScript() {
    echo "Generating the java sources list file:"
    find "$SRC_GEN_JAVA" -iname "*.java" > "$TEMPORARY_DIRECTORY_CLIENT/compiler_list_generated.tmp"

    echo "# Generated script for compiling the generated sources " > "$SCRIPT/$COMPILE_GENERATED"
    echo "$JAVAC \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -verbose \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -deprecation \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -deprecation \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -encoding UTF-8 \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -Xlint \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -source 1.6 \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -target 1.6 \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -classpath $JDK_LIB/*:$PROJECT_LIB/*:$COMMON_TEST_LIB/* \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    -d $TARGET_MAIN \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "    @$TEMPORARY_DIRECTORY_CLIENT/compiler_list_generated.tmp \\" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "" >> "$SCRIPT/$COMPILE_GENERATED"
    echo "echo \"Copying resources...\" " >> "$SCRIPT/$COMPILE_GENERATED"
    echo "find $SRC_GEN_RES -exec cp \"{}\" $TARGET_MAIN \;" >> "$SCRIPT/$COMPILE_GENERATED"
}


function compileGenerated() {
    generateCompileGeneratedScript

    tryRun "$SCRIPT/$COMPILE_GENERATED"
}

function generateCompileTestScript() {

    echo "Generating the compiler sources lists..."
    find "$SRC_GEN_JAVA" -iname "*.java" > "$TEMPORARY_DIRECTORY_CLIENT/compiler_list_test.tmp"
    find "$SRC_TEST_JAVA" -iname "*.java" >> "$TEMPORARY_DIRECTORY_CLIENT/compiler_list_test.tmp"

    echo "Generating the script for compiling tests..."
    echo "# Generated script for compiling the test classes" > "$SCRIPT/$COMPILE_TEST"
    echo "$JAVAC \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -verbose \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -deprecation \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -deprecation \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -encoding UTF-8 \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -Xlint \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -source 1.6 \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -target 1.6 \\" >> "$SCRIPT/$COMPILE_TEST"
#    echo "    -bootclasspath $RT_JAR \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -classpath $JDK_LIB/*:$PROJECT_LIB/*:$COMMON_TEST_LIB/* \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    -d $TARGET_TEST \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "    @$TEMPORARY_DIRECTORY_CLIENT/compiler_list_test.tmp \\" >> "$SCRIPT/$COMPILE_TEST"
    echo "" >> "$SCRIPT/$COMPILE_TEST"
    echo "echo \"Copying test resources...\" " >> "$SCRIPT/$COMPILE_TEST"
    echo "find $SRC_TEST_RES -exec cp \"{}\" $TARGET_TEST \;" >> "$SCRIPT/$COMPILE_TEST"
}

function compileTest() {
     generateCompileTestScript

    tryRun "$SCRIPT/$COMPILE_TEST"
}

function generatePackageGeneratedScript(){
    echo "Generating the script for packaging generated files"
    echo "# Generated script for packaging the generated classes" > "$SCRIPT/$PACKAGE_GENERATED"
    echo "$JDK_JAR \\" >> "$SCRIPT/$PACKAGE_GENERATED"
    echo "    -cfv \\" >> "$SCRIPT/$PACKAGE_GENERATED"
    echo "     $TARGET/$NAME.jar \\" >> "$SCRIPT/$PACKAGE_GENERATED"
    echo "     -C $TARGET_MAIN/ ." >> "$SCRIPT/$PACKAGE_GENERATED"
}

function packageGenerated() {
    title "Packaging generated classes"

    generatePackageGeneratedScript

    tryRun "$SCRIPT/$PACKAGE_GENERATED"
}

function generatePackageTestScript(){
    echo "Generating the script for packaging tests"
    echo "# Generated script for packaging the test classes" > "$SCRIPT/$PACKAGE_TESTS"
    echo "$JDK_JAR \\" >> "$SCRIPT/$PACKAGE_TESTS"
    echo "    -cfv \\" >> "$SCRIPT/$PACKAGE_TESTS"
    echo "     $TARGET/$NAME-test.jar \\" >> "$SCRIPT/$PACKAGE_TESTS"
    echo "     -C $TARGET_TEST/ ." >> "$SCRIPT/$PACKAGE_TESTS"
}

function packageTest() {
    generatePackageTestScript

    tryRun "$SCRIPT/$PACKAGE_TESTS"
}

function generateStartRevenjScript(){
    echo "Generating the script for starting the Revenj instance for this project"
    echo "# Generated script for starting our Revenj instance" > "$SCRIPT/$START_REVENJ"    
    echo "echo \"Starting our instance of Revenj, on ${revenjHost}:${revenjPort}\"" >> "$SCRIPT/$START_REVENJ"
    echo "mono $REVENJ_EXE" >> "$SCRIPT/$START_REVENJ"
}

function generateRunTestsScript(){
    echo "Generating the script for running tests..."
    echo "# Generated script for running the OCD tests" > "$SCRIPT/$RUN_TESTS"
    echo "" >> "$SCRIPT/$RUN_TESTS"
    echo "$JAVA \\" >> "$SCRIPT/$RUN_TESTS"
    echo "    -classpath $JDK_LIB/*:$PROJECT_LIB/*:$COMMON_TEST_LIB/*:$TARGET/$NAME-test.jar:$TARGET/$NAME.jar \\" >> "$SCRIPT/$RUN_TESTS"
    echo "    org.junit.runner.JUnitCore \\" >> "$SCRIPT/$RUN_TESTS"
    echo "    com.dslplatform.ocd.test.TestEntryPoint" >> "$SCRIPT/$RUN_TESTS"    
    echo "" >> "$SCRIPT/$RUN_TESTS"
}

function generateKillRevenjScript() {
    echo "Generating the script for killing our Revenj instance"
    echo "# Generated script for killing our Revenj instance" > "$SCRIPT/$KILL_REVENJ"
    echo "ps aux | grep \"$REVENJ_EXE\" | grep -v grep | awk '{print \$2;}' | xargs kill -9" >> "$SCRIPT/$KILL_REVENJ"
}

function runTest() {   
    title "Running the tests ..."

    generateStartRevenjScript
    generateRunTestsScript
    generateKillRevenjScript

    tryRun "$SCRIPT/$START_REVENJ" &
    sleep 5
    tryRun "$SCRIPT/$RUN_TESTS"
    tryRunNoFail "$SCRIPT/$KILL_REVENJ"
}

if [ "$#" -eq 0 ]; then
# If there are no args, display the run options
    echo "$0" clean dsl "compile:generated" "package:generated" "compile:test" "package:test" "run:test"
else
# Otherwise proceed with work
    currentStep=0
    maxSteps=0

    for cmd in "$@"
    do
	case "$cmd" in
	    "setup")
		doSetup=1; addStep		
		;;
	    "clean")
		doClean=1; addStep
		;;
	    "database:clean") 
		doDbClean=1; addStep
		;;
	    "dsl") 
		doDsl=1; addStep
		;;
	    "dsl:clean") 
		doDbClean=1; addStep
		;;
	    "deploy") 
		doDeploy=1; addStep
		;;
	    "compile:generated") 
		doCompileGenerated=1; addStep
		;;
	    "package:generated") 
		doPackageGenerated=1; addStep
		;;
	    "compile:test") 
		doCompileTest=1; addStep
		;;
	    "package:test") 
		doPackageTest=1; addStep
		;;
	    "run:test") 
		doRunTest=1; addStep
		;;
	    "all")
		resetSteps
		doClean=1; addStep
		doSetup=1; addStep
		doDsl=1; addStep
		doCompileGenerated=1; addStep
		doPackageGenerated=1; addStep
		doCompileTest=1; addStep
		doPackageTest=1; addStep
		doRunTest=1; addStep
	    ;;
	    *) echo "Unknown command: $cmd"
		;;
	esac
    done    

    if [ -n "$doClean" ]; then clean; fi
    if [ -n "$doSetup" ]; then setup; fi
    if [ -n "$doDsl" ]; then 
	dsl; 
	deploy;
    fi

    if [ -n "$doCompileGenerated" ]; then compileGenerated; fi
    if [ -n "$doPackageGenerated" ]; then packageGenerated; fi
    if [ -n "$doCompileTest" ]; then compileTest; fi
    if [ -n "$doPackageTest" ]; then packageTest; fi
    if [ -n "$doRunTest" ]; then runTest; fi
    exit
fi