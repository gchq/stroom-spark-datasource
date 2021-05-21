#!/bin/bash

## Script to create a usable Java client library


export OUTPUT_DIR="client/src/main/java"

rm -r ${OUTPUT_DIR}

# Get the stroom source code from github
. ./copy_stroom_src.sh

# Download and run the code generator
export TEMP='build/temp'
mkdir -p ${TEMP}
  #wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.25/swagger-codegen-cli-3.0.25.jar -O ${TEMP}/swagger-codegen-cli.jar
wget https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/5.1.1/openapi-generator-cli-5.1.1.jar -O ${TEMP}/openapi-generator-cli.jar

export SWAGGER_URL='https://raw.githubusercontent.com/gchq/stroom/7.0/stroom-app/src/main/resources/ui/noauth/swagger/stroom.json'
  #export SWAGGER_URL='http://localhost/stroom/noauth/swagger/stroom.json'

export CLIENT_DIR="${TEMP}/stroom-api-client"

  #java -jar ${TEMP}/swagger-codegen-cli.jar generate -i $SWAGGER_URL -l java -o ${CLIENT_DIR} --additional-properties=library=jersey2
  #java -jar ${TEMP}/openapi-generator-cli.jar generate -i $SWAGGER_URL --minimal-update -g java -o ${CLIENT_DIR} --library=resttemplate --additional-properties=library=jersey2
java -jar ${TEMP}/openapi-generator-cli.jar generate -i $SWAGGER_URL --minimal-update -g java -o ${CLIENT_DIR} --library=jersey2 --additional-properties=library=jersey2

export SOURCE_ROOT="src/main/java"
export OUTPUT_ROOT="${OUTPUT_DIR}/org/openapitools/client"
export INPUT_ROOT="${CLIENT_DIR}/src/main/java/org/openapitools/client"

mkdir -p ${OUTPUT_ROOT}
cp ${INPUT_ROOT}/* ${OUTPUT_ROOT} 2> /dev/null
cp -r "${INPUT_ROOT}/auth" ${OUTPUT_ROOT} 2> /dev/null
mkdir -p ${OUTPUT_ROOT}/api

#for FILE_CLASH in `find "${SOURCE_ROOT}/stroom/" -name \*.java | xargs -n 1 basename`
#do
#  rm ${INPUT_ROOT}/model/${FILE_CLASH} 2> /dev/null
#done

export INPUT_MODEL_DIR="${INPUT_ROOT}/model"
export OUTPUT_MODEL_DIR="${OUTPUT_ROOT}/model"

mkdir -p ${OUTPUT_MODEL_DIR}
#printf "package org.openapitools.client.model;\n\nclass Dummy {\n}\n" > ${OUTPUT_MODEL_DIR}/Dummy.java

mkdir -p ${INPUT_MODEL_DIR}
export SUPPORTED_MODEL_FILES="Welcome.java"
for FILE in ${SUPPORTED_MODEL_FILES}
do
  cat ${INPUT_MODEL_DIR}/${FILE} | grep -v "io.swagger.annotations" | grep -v "\@ApiModel" > "${OUTPUT_MODEL_DIR}/${FILE}"
done

export INPUT_API_DIR="${INPUT_ROOT}/api"

export SUPPORTED_API_FILES="DataSourcesApi.java  SearchableApi.java  StroomIndexQueriesApi.java WelcomeApi.java"

for FILE in ${SUPPORTED_API_FILES}
do
  cat ${INPUT_API_DIR}/$FILE |  grep -v 'import org.openapitools.client.model' | \
  sed 's/package org.openapitools.client.api;/package org.openapitools.client.api;\n\nimport stroom.datasource.api.v2.*;\nimport stroom.docref.*;\nimport stroom.query.api.v2.*;\n\nimport org.openapitools.client.model.*;\n\n/' \
  > "${OUTPUT_ROOT}/api/${FILE}"
done

rm -r ${TEMP}