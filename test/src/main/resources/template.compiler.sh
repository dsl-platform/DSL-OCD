# The project base directory
BASE=$(pwd)

# The project name - the generated directory basename
NAME="basename $BASE"

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

# TODO: Binaries for compiling generated and test classes ?
BIN="$BASE/bin"
BIN_GEN="$BIN/generated"
BIN_TEST="$BIN/test"

# Where to bundle compiled classes (TODO: see if deprecated)
JAR="$BASE/jar"
JAR_GEN="$JAR/$NAME-generated.jar"
JAR_TEST="$JAR/$NAME-test.jar"

# The tools path
TOOLS="${toolsPath}"
JRE="$TOOLS/${javaParent}/jre"
JRE_BIN="$JRE/bin"
JAVA="$JRE/bin/java"
RT_JAR="$JRE/lib/rt.jar"
JDK="$TOOLS/${javaParent}/jdk"
JDK_BIN="$JDK/bin"
JAVAC="$JDK_BIN/javac"
JDK_JAR="$JDK/bin/jar"

# DSL platform compiler client
TOOLS_DPCC="$TOOLS/dcc-java-user/dsl-clc.jar"
# TODO: vidi kaj je ovo
TOOLS_DPCC_AP="api.properties"

# DSL source which we are to compile
DSL_PATH="${dslSource}"
DSL_EMPTY="$TOOLS/dsl/empty.dsl"

# Compile and test dependencies
LIB="$TOOLS/${javaParent}/lib"
LIB_COMPILE="$LIB/compile"
LIB_TEST="$LIB/test"

PROJECT_LIB="$BASE/lib"

REVENJ=${revenjPath}
GENERATED_MODEL=./model

function addStep() {
    maxSteps=$((maxSteps+1))
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
	exit
    fi
}

function checkErrorNoExit() {
    if [ "$?" -ne 0 ]; then
	echo "$1"
    fi
}

function clean() {
    title "Cleaning old resources ..."

    echo "Cleaning generated sources ..."
    delIfExists "$SRC_GEN_JAVA"
    echo "Cleaning generated resources ..."
    delIfExists "$SRC_GEN_RES"
    echo "Cleaning output class folder for generated sources ..."
    delIfExists "$BIN_GEN"
    echo "Cleaning output class folder for tests ..."
    delIfExists "$BIN_TEST"
    echo "Cleaning generated and test jars ..."
    delIfExists "$JAR_GEN/*.jar"
    delIfExists "$JAR_TEST/*.jar"
    echo "Cleaning scripts, params, and logs"
    rm -rf "$LOG/*"
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
    mkdir -p "$BIN_GEN"
    echo "Creating output class folder for generated tests"
    mkdir -p "$BIN_TEST"
    echo "Creating output folder for JARs: $JAR"
    mkdir -p "$JAR"

    echo "Creating log folder"
    mkdir -p "$LOG"

    # TODO: script

    local dbCreateScript="$LOG/db-create.sh"
    local dbCreateLog="$LOG/db-create.log"
    echo "Creating the database create script: $dbCreateScript"

    echo "# Generated database create script for ${projectName}" > "$dbCreateScript"
    echo "echo \"Creating the database: ${dbName} at ${dbHost}:${dbPort}\"" >> "$dbCreateScript"
    echo "createdb -U postgres ${dbName} -O ${dbUser}" >> "$dbCreateScript"
    
    echo "Running the database create script..."
    bash "$dbCreateScript" > "$dbCreateLog" 2>&1

    checkError "Error creating database."
}

function dbClean() {
    local dbDropScript="$LOG/db-drop.sh"
    local dbDropLog="$LOG/db-drop.log"
    title "Creating the database drop script: $dbDropScript"

    echo "# Generated database drop script for ${projectName}" > "$dbDropScript"
    echo "echo \"Dropping the database: ${dbName} at ${dbHost}:${dbPort}\"" >> "$dbDropScript"
    echo "export PGPASSFILE=$BASE/.pgpass" >> "$dbDropScript"
    echo "dropdb -U ${dbOwner} ${dbName}" >> "$dbDropScript"

    echo "Running the database drop script: $dbDropScript"
    bash "$dbDropScript" > "$dbDropLog" 2>&1

    checkErrorNoExit "Error dropping database, but continuing anyway"    
}

function dsl() {
    title "Generating sources from DSL"

    local dslCompileScript="$LOG/dsl-compile.sh"
    local dslCompileLog="$LOG/dsl-compile.log"

    echo "Creating DSL compilation script: $dslCompileScript"

    echo "# Generated DSL compilation script for ${projectName}" > "$dslCompileScript"    
    echo "$JAVA -jar \\" >> "$dslCompileScript"
#TODO: see what's with this    echo "   -Ddsl-clc-api-properties  \\" >> "$dslCompileScript"
    echo "   -jar $TOOLS_DPCC  \\" >> "$dslCompileScript"
    echo "   -u=hperadin@gmail.com  \\" >> "$dslCompileScript"
    echo "   -p=ocdpassword  \\" >> "$dslCompileScript"
    echo "   -temp=$SRC_GEN_JAVA  \\" >> "$dslCompileScript"
    echo "   -dsl=$DSL_PATH \\" >> "$dslCompileScript"
    echo "   -download \\" >> "$dslCompileScript"
    echo "   -java=$JDK_BIN \\" >> "$dslCompileScript"
    echo "   -settings=active-record \\" >> "$dslCompileScript"
    echo "   -namespace=ocd \\" >> "$dslCompileScript"
    echo "   -db=\"${dbHost}:${dbPort}/${dbName}?user=${dbUser}&password=${dbPassword}\" \\" >> "$dslCompileScript"
    echo "   -target=java_client,revenj \\" >> "$dslCompileScript"
    echo "   -include-sources \\" >> "$dslCompileScript"
    echo "   -parse \\" >> "$dslCompileScript"
    echo "   -migration \\" >> "$dslCompileScript"
    echo "   -apply \\" >> "$dslCompileScript"
    echo "   -log  \\" >> "$dslCompileScript"

    echo "Running the DSL compilation script: $dslCompileScript"    
    bash "$dslCompileScript" > "$dslCompileLog" 2>&1
    
    checkError "Error compiling DSLs, stopping..."
}

function deploy() {
    title "Deploying the generated model"

    local script="$LOG/deploy-model.sh"
    local log="$LOG/deploy-model.log"       

    echo "Creating the deploy model script $script"

    echo "# Generated script for deploying the generated model for project ${projectName}" > "$script"
    echo "mkdir -p \"$GENERATED_MODEL\" && mv GeneratedModel.dll \"$GENERATED_MODEL\"" >> "$script"
    echo "mkdir -p \"$PROJECT_LIB\" && mv generated-model-java.jar \"$PROJECT_LIB\"" >> "$script"

    echo "Running the deploy model script:"
    bash "$script" > "$log" 2>&1
    checkError "Error running the deploy model script!"
    
}

function compileGenerated() {
    title "Compiling generated sources"
}

function packageGenerated() {
    title "Packaging generated classes"
}

function compileTest() {
    title "Compiling tests"
}

function packageTest() {
    title "Packaging test classes"
    
}

function runTest() {
    title "Starting our instance of Revenj, on ${revenjHost}:${revenjPort}"
    mono "$REVENJ_PATH/Revenj.Http.exe" &
    local monoPid=$!

    echo "Running tests"
# TODO: tests

    echo "Killing the Revenj instance"
    kill -9 "$monoPid"    
}

if [ "$#" -eq 0 ]; then
# If there are no args, display the run options
    echo "$0" clean dsl deploy "database:clean" "compile:generated" "package:generated" "compile:test" "package:test" "run:test"
else
# Otherwise proceed with work
    currentStep=0
    maxSteps=0

    doSetup=1
    addStep
    doDbClean=1
    addStep
    for cmd in "$@"
    do
	case "$cmd" in
	    "clean") 
		doClean=1
		addStep
		;;
	    "database:clean") 
		doDbClean=1
		addStep
		;;
	    "dsl") 
		doDsl=1		
		addStep
		;;
	    "dsl:clean") 
		doDbClean=1
		addStep
		;;
	    "deploy") 
		doDeploy=1 
		addStep
		;;
	    "compile:generated") 
		doCompileGenerated=1
		addStep
		;;
	    "package:generated") 
		doPackageGenerated=1
		addStep
		;;
	    "compile:test") 
		doCompileTest=1
		addStep
		;;
	    "package:test") 
		doPackageTest=1
		addStep
		;;
	    "run:test") 
		doRunTest=1
		addStep
		;;
	    *) echo "Unknown command: $cmd"
		;;
	esac
    done    

    if [ -n "$doClean" ]; then clean; fi
    if [ -n "$doDbClean" ]; then dbClean; fi
    if [ -n "$doSetup" ]; then setup; fi
    if [ -n "$doDsl" ]; then dsl; fi
    if [ -n "$doDeploy" ]; then deploy; fi
    if [ -n "$doCompileGenerated" ]; then compileGenerated; fi
    if [ -n "$doPackageGenerated" ]; then packageGenerated; fi
    if [ -n "$doCompileTest" ]; then compileTest; fi
    if [ -n "$doPackageTest" ]; then packageTest; fi
    if [ -n "$doRunTest" ]; then runTest; fi
fi
