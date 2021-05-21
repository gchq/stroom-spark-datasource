# stroom-spark-datasource

[![Build Status](https://travis-ci.org/gchq/stroom-spark-datasource.svg?branch=master)](https://travis-ci.org/gchq/stroom-spark-datasource)

## Overview

This project provides an Apache Spark DataSource for Stroom.

Using this library it is possible to search Stroom indexes from Apache Spark, both via the DSL and via Spark SQL.

This DataSource is compatible with Apache Spark v2.4.3, but it might also work without modification on similar versions
of Apache Spark.

## Building

The project is built with gradle.

Running command `gradle build` will compile the software and build the library jar file.

However, in order to simplify deployment, it is possible to run the command `gradle build fatJar` in order to create a
single jar file that contains the library itself plus all its dependencies.     

Key facts:
* Output Directory: `build/libs`
* Library: `stroom-spark-datasource-VERSION.jar`
* Fat Jar: `stroom-spark-datasource-VERSION-all.jar`

## Getting Started

The simple demonstrations of this capability that are contained within this repository all rely on there being
a Stroom running on `localhost`, into which the standard Stroom content and sample data has been loaded by running the
command `gradle setupSampleData` from the directory containing your git clone of the `stroom` git repository. 

These demonstrations are designed to show the datasource operating in its simplest configuration, for clarity.
For this reason, security has been disabled within Stroom, by setting the property `authenticationRequired : false` within
`local.yml`.
A real deployment would require a user account to be created within Stroom and for it to be assigned an authentication
token, that is then passed in when instantiating the Datasource.

Install Apache Spark on `localhost`.  Spark currently requires Java 8, therefore this must be available and `$JAVA_HOME`
set to point at the Java 8 JDK.

On such a single spark node, the python CLI can be started from a Java 8 shell using 
the command 
```
pyspark --jars `pwd`/build/libs/stroom-spark-datasource-VERSION-all.jar
``` 
 **- remember to replace VERSION with the version of the library that you are actually using!**

Then from within pyspark shell, try

```python
from pyspark.sql.types import *

basicSchema = StructType([StructField("streamId", StringType(), True, \
    metadata={"get": "StreamId"}),\
    StructField("eventId", StringType(), True,\
    metadata={"get": "EventId"})])

basicDf = spark.read.format('stroom.spark.datasource.StroomDataSource').\
    load(token='eyJhbGciOiJSUzI1NiIsImtpZCI6IjhhM2I1OGNhLTk2ZTctNGFhNC05ZjA3LTQ0MDBhYWVkMTQ3MSJ9.eyJleHAiOjE2NDEzMTYyODMsInN1YiI6ImFkbWluIiwiaXNzIjoic3Ryb29tIiwiYXVkIjoiTlhDbXJyTGpQR2VBMVN4NWNEZkF6OUV2ODdXaTNucHRUbzZSdzVmTC5jbGllbnQtaWQuYXBwcy5zdHJvb20taWRwIn0.mU7gfhvbNFVzQ5RX86zcnvS6XZeNpYDZRJ5Zx2rPOuZsha15kJjMKw0PEH2T1Ucs2JEuhrj5P0Vu7pi_i7CtWSLNsmjZYrYL-udugijhEN9dxjuze5lnuOxb1LENrNoPaRvHpBiFyO3yIYO4Y9UcRdcAj-9Yt8zgqLP208KOU36n3dl0ErKXAKFyUbuu--1sDCnpSq4fxCMWfUhgENIkhUm6EnI8s510QdDxIeK95nHcM0H_I7cV0YXfpL4HgnsCCPJUJkYT1x71FQGuACi9Ba0JKdVF8PwdH4k4ryoK_b3ObFSueGpq2fBcFy385r6lDLUu91MODoY7yh9gagK-gw', \
    host='localhost:8080', \
    protocol='http',uri='api/stroom-index/v2', \
    index='3e72379d-403f-4757-88d5-bfae4d724b55', \
    pipeline='2ac7b541-293d-4d9e-bb8d-f081dd631c7c', \
    schema=basicSchema)

basicDf.groupBy(basicDf['streamId']).count().sort(['count'], ascending=False).show()
```

When using a JSON Search extraction pipeline within Stroom, it is possible to work with the JSON directly in Spark.
```python
from pyspark.sql.functions import from_json, col

json_schema = spark.read.json(basicDf.rdd.map(lambda row: row.json)).schema
json_schema

structuredDf = basicDf.withColumn('evt', from_json(col('json'), json_schema))

wideDf=structuredDf.withColumn ('timestamp', col('evt.EventTime.TimeCreated')).\
    withColumn ('user', col('evt.EventSource.User.Id')).\
    withColumn('operation', col('evt.EventDetail.TypeId'))

wideDf.show()

wideDf.filter((wideDf['User'] == 'user1') | (wideDf['User'] == 'user2') | 
    (wideDf['User'] == 'user3')).groupBy(wideDf['Operation']).count().show()
```

If you are running a version of Stroom that supports `XPathOutputFilter`, XPaths can be used to access data directly.

```python
from pyspark.sql.types import *

xpathSchema = StructType([StructField("user", StringType(), True, \
    metadata={"get": "EventSource/User/Id"}),\
    StructField("operation", StringType(), True,\
    metadata={"get": "EventDetail/TypeId"})])

df = spark.read.format('stroom.spark.datasource.StroomDataSource').\
    load(token='not required',host='localhost:8080', \
    protocol='http', \
    uri='api/stroom-index/v2', \
    index='57a35b9a-083c-4a93-a813-fc3ddfe1ff44', \
    pipeline='26ed1000-255e-4182-b69b-00266be891ee', \
    schema=xpathSchema)

df.filter((df['user'] == 'user1') | (df['user'] == 'user2') | (df['user'] == 'user3')).\
    groupBy(df['operation']).count().show()

```


