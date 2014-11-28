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
TEMPORARY_DIRECTORY="$BASE/tmp"
DSL_EMPTY="$TOOLS/dsl/empty.dsl"

# Compile and test dependencies
JDK_LIB="$TOOLS/${javaParent}/jdk/lib"
COMMON_TEST_LIB="$TOOLS/${javaParent}/lib/test"

PROJECT_LIB="$BASE/lib"

REVENJ_PATH="$BASE/revenj"
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
    local log=$2
    local msg=$3
    echo "Running the script: $script"
    bash "$script" 2>&1 | tee -a "$log"
    checkError "Error running the script $script check the log at $log !" "$msg"
}

function tryRunNoFail() {
    local script=$1
    local log=$2
    local msg=$3
    echo "Running the script: $script"
    bash "$script" 2>&1 | tee -a "$log"
    checkErrorNoExit "Error running the script $script, check the log at $log !" "$msg"
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
    delIfExists "$TEMPORARY_DIRECTORY"
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
    mkdir -p "$TEMPORARY_DIRECTORY"


    local script="$SCRIPT/db-create.sh"
    local log="$LOG/db-create.log"
    echo "Creating the database create script: $script"

    echo "# Generated database create script for ${projectName}" > "$script"
    echo "echo \"Creating the database: ${dbName} at ${dbHost}:${dbPort}\"" >> "$script"
    echo "createdb -U postgres ${dbName} -O ${dbUser}" >> "$script"
    
    tryRunNoFail $script $log "The database probably already exists"
}

function dbClean() {
    local script="$SCRIPT/db-drop.sh"
    local log="$LOG/db-drop.log"
    title "Creating the database drop script: $script"

    echo "# Generated database drop script for ${projectName}" > "$script"
    echo "echo \"Dropping the database: ${dbName} at ${dbHost}:${dbPort}\"" >> "$script"
    echo "export PGPASSFILE=$BASE/.pgpass" >> "$script"
    echo "dropdb -U ${dbOwner} ${dbName}" >> "$script"

    tryRunNoFail $script $log "The database is probably already dropped"
}

function dsl() {
    title "Generating sources from DSL"

    local script="$SCRIPT/dsl-compile.sh"
    local log="$LOG/dsl-compile.log"

    echo "Creating DSL compilation script: $script"

    echo "# Generated DSL compilation script for ${projectName}" > "$script"    
    echo "$JAVA -jar \\" >> "$script"
#TODO: see whats with this    echo "   -Ddsl-clc-api-properties  \\" >> "$script"
    echo "   -jar $TOOLS_DPCC  \\" >> "$script"
    echo "   -u=hperadin@gmail.com  \\" >> "$script"
    echo "   -p=ocdpassword  \\" >> "$script"
    echo "   -temp=$TEMPORARY_DIRECTORY  \\" >> "$script"
    echo "   -dsl=$DSL_PATH \\" >> "$script"
    echo "   -download \\" >> "$script"
    echo "   -java=$JDK_BIN \\" >> "$script"
    echo "   -settings=active-record \\" >> "$script"
    echo "   -namespace=ocd \\" >> "$script"
    echo "   -db=\"${dbHost}:${dbPort}/${dbName}?user=${dbUser}&password=${dbPassword}\" \\" >> "$script"
    echo "   -target=java_client,revenj \\" >> "$script"
#    echo "   -include-sources \\" >> "$script"
    echo "   -parse \\" >> "$script"
    echo "   -migration \\" >> "$script"
    echo "   -apply \\" >> "$script"
    echo "   -log  \\" >> "$script"
    echo "   -no-prompt  \\" >> "$script"

    tryRun $script $log
}

function deploy() {
    title "Deploying the generated model"

    local script="$SCRIPT/deploy-model.sh"
    local log="$LOG/deploy-model.log"       

    echo "Creating the deploy model script $script"

    echo "# Generated script for deploying the generated model for project ${projectName}" > "$script"
    echo "echo \"Deploying the generated model revenj dll\"" >> "$script"
    echo "mkdir -p \"$GENERATED_MODEL\" && mv GeneratedModel.dll \"$GENERATED_MODEL\"" >> "$script"
    echo "echo \"Deploying the generated sources:\" " >> "$script"
    echo "cp -R \"$TEMPORARY_DIRECTORY/Java/ocd\" \"$SRC_GEN_JAVA\"" >> "$script"
    echo "cp -R java_client/*.jar \"$PROJECT_LIB\"" >> "$script"
    echo "echo \"Copying the template revenj configuration:\" " >> "$script"
    echo "cp $REVENJ_CONFIG_TEMPLATE/Revenj.Http.exe.config.template $REVENJ_PATH/Revenj.Http.exe.config" >> "$script"

    tryRun $script $log
    
    echo "Cleaning the compiler default lib dir"
    delIfExists "java_client"

    # TODO: cleanup Eclipse to use only the sources
    echo "Moving the generated model to the libs dir (we will be using only the sources, but eclipse needs it)"
    mv generated-model-java.jar lib/
}

function compileGenerated() {
    title "Compiling generated sources"
    local script="$SCRIPT/compile-generated.sh"
    local log="$LOG/compile-generated.log"

#    echo "Generating the java sources list file:"
    find "$SRC_GEN_JAVA" -iname "*.java" > "$TEMPORARY_DIRECTORY/compiler_list_generated.tmp"

    echo "# Generated script for compiling the generated sources " > "$script"
    echo "$JAVAC \\" >> "$script"
    echo "    -verbose \\" >> "$script"
    echo "    -deprecation \\" >> "$script"
    echo "    -deprecation \\" >> "$script"
    echo "    -encoding UTF-8 \\" >> "$script"
    echo "    -Xlint \\" >> "$script"
    echo "    -source 1.6 \\" >> "$script"
    echo "    -target 1.6 \\" >> "$script"
#    echo "    -bootclasspath $RT_JAR \\" >> "$script"
    echo "    -classpath $JDK_LIB/*:$PROJECT_LIB/*:$COMMON_TEST_LIB/* \\" >> "$script"
    echo "    -d $TARGET_MAIN \\" >> "$script"
    echo "    @$TEMPORARY_DIRECTORY/compiler_list_generated.tmp \\" >> "$script"
    echo "" >> "$script"
    echo "echo \"Copying resources...\" " >> "$script"
    echo "find $SRC_GEN_RES -exec cp \"{}\" $TARGET_MAIN \;" >> "$script"

    tryRun $script $log
}

function compileTest() {
    title "Compiling tests"
    local script="$SCRIPT/compile-test.sh"
    local log="$LOG/compile-test.log"

    find "$SRC_GEN_JAVA" -iname "*.java" > "$TEMPORARY_DIRECTORY/compiler_list_test.tmp"
    find "$SRC_TEST_JAVA" -iname "*.java" >> "$TEMPORARY_DIRECTORY/compiler_list_test.tmp"

    echo "# Generated script for compiling the test classes" > "$script"

    echo "$JAVAC \\" >> "$script"
    echo "    -verbose \\" >> "$script"
    echo "    -deprecation \\" >> "$script"
    echo "    -deprecation \\" >> "$script"
    echo "    -encoding UTF-8 \\" >> "$script"
    echo "    -Xlint \\" >> "$script"
    echo "    -source 1.6 \\" >> "$script"
    echo "    -target 1.6 \\" >> "$script"
#    echo "    -bootclasspath $RT_JAR \\" >> "$script"
    echo "    -classpath $JDK_LIB/*:$PROJECT_LIB/*:$COMMON_TEST_LIB/* \\" >> "$script"
    echo "    -d $TARGET_TEST \\" >> "$script"
    echo "    @$TEMPORARY_DIRECTORY/compiler_list_test.tmp \\" >> "$script"
    echo "" >> "$script"
    echo "echo \"Copying test resources...\" " >> "$script"
    echo "find $SRC_TEST_RES -exec cp \"{}\" $TARGET_TEST \;" >> "$script"

    tryRun $script $log
}

function packageGenerated() {
    title "Packaging generated classes"
    local script="$SCRIPT/package-generated.sh"
    local log="$LOG/package-generated.log"

    echo "# Generated script for packaging the generated classes" > "$script"
    echo "$JDK_JAR \\" >> "$script"
    echo "    -cfv \\" >> "$script"
    echo "     $TARGET/$NAME.jar \\" >> "$script"
    echo "     -C $TARGET_MAIN/ ." >> "$script"

    tryRun $script $log
}

function packageTest() {
    title "Packaging test classes"    
    local script="$SCRIPT/package-tests.sh"
    local log="$LOG/package-tests.log"

    echo "# Generated script for packaging the generated classes" > "$script"
    echo "$JDK_JAR \\" >> "$script"
    echo "    -cfv \\" >> "$script"
    echo "     $TARGET/$NAME-test.jar \\" >> "$script"
    echo "     -C $TARGET_TEST/ ." >> "$script"

    tryRun $script $log
}

function runTest() {   
    title "Running the tests ..."

    local testScript="$SCRIPT/run-test.sh"
    local startRevenj="$SCRIPT/start-revenj.sh"
    local killRevenj="$SCRIPT/kill-revenj.sh"
    local log="$LOG/run-test.log"

    echo "# Generated script for starting our Revenj instance" > "$startRevenj"    
    echo "echo \"Starting our instance of Revenj, on ${revenjHost}:${revenjPort}\"" >> "$startRevenj"
    echo "mono $REVENJ_PATH/Revenj.Http.exe &" >> "$startRevenj"
    echo 'monoPid=$!' >> "$startRevenj"
    echo "echo \$monoPid >> $REVENJ_PID_FILE" >> "$startRevenj"
    echo "sleep 2" >> "$startRevenj"

    echo "# Generated script for killing our Revenj instance" > "$killRevenj"    
    echo "[[ -e \"$REVENJ_PID_FILE\" ]] && echo \"Killing the Revenj instance: \" && cat $REVENJ_PID_FILE | xargs kill -9 && rm $REVENJ_PID_FILE" >> "$killRevenj"

    echo "# Generated script for running the OCD tests" > "$testScript"
    echo "" >> "$testScript"
    echo "$JAVA \\" >> "$testScript"
    echo "    -classpath $JDK_LIB/*:$PROJECT_LIB/*:$COMMON_TEST_LIB/*:$TARGET/$NAME-test.jar:$TARGET/$NAME.jar \\" >> "$testScript"
    echo "    org.junit.runner.JUnitCore \\" >> "$testScript"
    echo "    com.dslplatform.ocd.test.TestEntryPoint" >> "$testScript"    
    echo "" >> "$testScript"

    tryRun $startRevenj $log
    tryRun $testScript $log
    tryRunNoFail $killRevenj $log
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
fi