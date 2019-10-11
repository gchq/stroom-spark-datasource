# stroom-spark-datasource

[![Build Status](https://travis-ci.org/gchq/stroom-spark-datasource.svg?branch=master)](https://travis-ci.org/gchq/stroom-spark-datasource)

##Overview

This project provides an Apache Spark DataSource for Stroom.

Using this library it is possible to search Stroom indexes from Apache Spark, both via the DSL and via Spark SQL.

This DataSource is compatible with Apache Spark v2.4.3, but it might also work without modification on similar versions
of Apache Spark.

##Building

The project is built with gradle.

Running command `gradle build` will compile the software and build the library jar file.

However, in order to simplify deployment, it is possible to run the command `gradle build fatJar` in order to create a
single jar file that contains the library itself plus all its dependencies.     

Key facts:
* Output Directory: `build/libs`
* Library: `stroom-spark-datasource-VERSION.jar`
* Fat Jar: `stroom-spark-datasource-VERSION-all.jar`

##Getting Started

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
```
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
#Not Working
Without defining a schema, certain basic operations are possible using a built in (default schema)
```
basicDf = spark.read.format('stroom.spark.datasource.StroomDataSource').\
    load(token='not required',host='localhost:8080',protocol='http',search_url='api/stroom-index/v2/search',destroy_url='api/stroom-index/v2/destroy',index='57a35b9a-083c-4a93-a813-fc3ddfe1ff44',pipeline='bb25824e-6369-464a-81e1-876ffe3b95a0')

basicDf.groupBy(basicDf['StreamId']).count().sort(['count'], ascending=False).show()
```

When working with JSON, it is possible to work with the JSON directly in Spark, rather than by specifying XPaths.
```
from pyspark.sql.functions import from_json, col

json_schema = spark.read.json(basicDf.rdd.map(lambda row: row.Event)).schema
json_schema

structuredDf = basicDf.withColumn('evt', from_json(col('Event'), json_schema))

wideDf=structuredDf.withColumn ('timestamp', col('evt.Event.EventTime.TimeCreated')).withColumn ('user', col('evt.Event.EventSource.User.Id')).withColumn('operation', col('evt.Event.EventDetail.TypeId'))

wideDf.show()

wideDf.filter((wideDf['User'] == 'user1') | (wideDf['User'] == 'user2') | (wideDf['User'] == 'user3')).groupBy(wideDf['Operation']).count().show()
```


