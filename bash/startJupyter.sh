#!/bin/bash

export STROOM_SPARK_DATASOURCE_VERSION='v2.0-alpha.1'

mkdir -p ../tmp/lib

export JAR="stroom-spark-datasource-${STROOM_SPARK_DATASOURCE_VERSION}-all.jar"

cd ../notebooks

source ../bash/useNotebookWithPyspark.sh

echo $PYSPARK_DRIVER_PYTHON $PYSPARK_DRIVER_PYTHON_OPTS

SPARK_VERSION=2.4.8

pyspark --jars ../build/libs/${JAR}

