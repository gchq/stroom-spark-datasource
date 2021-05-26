#!/bin/bash

## This library uses a Java client for Stroom's RESTFul API.
##
## Stroom used to provide a client library for this purpose.  However, this is no longer supported.
##
## As an alternative, a client is automatically using swagger codegen / openapi codegen.
##
## However, the generated model classes are not capable of supporting Stroom's API due limitations/bugs in handling
## of polymorphic interfaces, the model is "borrowed" from Stroom's codebase and recompiled here under a version of Java
## compatible with Spark.  At the time of writing, this is needed because Stroom itself is compiled with Java 15
## whereas Spark requires either Java 8 or Java 11.
##
## This is not a good approach, but an expedient workaround that should be revisited when any of the following occur:
##  * Spark runs of a version of Java that is compatible with Stroom itself,
##  * Stroom provides a standalone client library for its API that runs on a version of Java compatible with Spark, or
##  * Swagger/OpenAPI codegen works with polymorphic APIs.
##
export TEMP='build/temp'
mkdir -p ${TEMP}

export STROOM_VER='7.0-beta.116'
export ZIP="v${STROOM_VER}.zip"

wget https://github.com/gchq/stroom/archive/refs/tags/${ZIP} -O ${TEMP}/${ZIP}
unzip -q -d ${TEMP} -o ${TEMP}/${ZIP}

export STROOM_SRC="${TEMP}/stroom-${STROOM_VER}"

export OUTPUT_SRC='client/src/main/java/stroom'
mkdir -p ${OUTPUT_SRC}
cp -r "${STROOM_SRC}/stroom-query/stroom-query-api/src/main/java/stroom/datasource" ${OUTPUT_SRC}
cp -r "${STROOM_SRC}/stroom-query/stroom-query-api/src/main/java/stroom/query" ${OUTPUT_SRC}
cp -r "${STROOM_SRC}/stroom-docref/src/main/java/stroom/docref" ${OUTPUT_SRC}

#export ESCAPED_SRC=`echo ${STROOM_SRC} | sed 's/\\//\\\\\\//g'`
#echo Esc is ${ESCAPED_SRC}
##Take the shared classes, some especially Document types needed for API
#for SHARED_DIR in `find ${STROOM_SRC} -type d -name shared | grep -v test`
#do
#  export PARENT_DIR=`echo ${SHARED_DIR} | sed 's/\\/shared$//' | sed "s/${ESCAPED_SRC}//" | sed 's/.*\\/stroom\\///'`
#  export OUTPUT_DIR="${OUTPUT_SRC}/${PARENT_DIR}"
#  echo "Making " ${OUTPUT_DIR}
#  mkdir -p ${OUTPUT_DIR}
#  cp -r ${SHARED_DIR} ${OUTPUT_DIR}
#done
