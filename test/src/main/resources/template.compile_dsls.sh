#!/bin/sh

# Configs:
CURRENT_DIR=$(pwd)

CLIENT_PATH="$CURRENT_DIR/client/"
CLIENT_LIB_PATH="$CURRENT_DIR/client/java/lib/"
SERVER_PATH="$CURRENT_DIR/server/"
COMMONS_PATH="$CURRENT_DIR/commons/"
TOOLS_PATH="${toolsPath}"
GENERATED_PATH="$CURRENT_DIR/src/generated"

DSL_COMMAND_LINE_CLIENT="$TOOLS_PATH/dcc-java-user/dsl-clc.jar"
REVENJ_PATH="./revenj"
MODEL_PATH="./model"
DSL_PROPS="$COMMONS_PATH/config/dsl.props"
DSL_INI_PATH="$GENERATED_PATH/resources/dsl-project.ini"

echo "Compiling the client and server code..."
java -jar "$DSL_COMMAND_LINE_CLIENT" \
  -u=hperadin@gmail.com \
  -p=ocdpassword \
  -dsl="$CLIENT_PATH/dsl" \
  -download \
  -java=/usr/bin \
  -settings=active-record \
  -include-sources \
  -namespace=ocd \
  -db="${dbHost}:${dbPort}/${dbName}?user=${dbUser}&password=${dbPassword}" \
  -parse \
  -target=java_client,revenj \
  -migration \
  -apply \
  -log

echo "Moving the generated models to target dirs"
mkdir -p "$MODEL_PATH" && mv GeneratedModel.dll "$MODEL_PATH"
mkdir -p "$CLIENT_LIB_PATH"
mv generated-model-java.jar "$CLIENT_LIB_PATH"
if [ -e "$REVENJ_PATH/Revenj.Http.exe.config.template" ]; then
    mv "$REVENJ_PATH/Revenj.Http.exe.config.template" "$REVENJ_PATH/Revenj.Http.exe.config"
fi
