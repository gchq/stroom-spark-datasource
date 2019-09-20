# stroom-spark-datasource
This creates a single jar file that can be loaded into Spark.
On a single node it is possible to run the command
`
pyspark --jars target/stroom-datasource-1.0-SNAPSHOT.jar,lib/stroom-query-api-v2.1-beta.21.jar,lib/jersey-media-json-jackson-2.25.1.jar,lib/jersey-entity-filtering-2.25.1.jar,lib/jackson-jaxrs-json-provider-2.8.6.jar,lib/jackson-annotations-2.8.6.jar,lib/jackson-core-2.8.6.jar,lib/jackson-jaxrs-base-2.8.6.jar
`

Then from within pyspark shell, try
```
from pyspark.sql.types import *
mystruct = StructType([StructField("User", StringType(), True, metadata={"xpath": "EventSource/User/Id"}), StructField("Operation", StringType(), True, metadata={"xpath": "EventDetail/TypeId"})])

df = spark.read.format('stroom.spark.datasource.StroomDataSource').load(token='not required',host='localhost:8080',protocol='http',search_url='api/stroom-index/v2/search',destroy_url='api/stroom-index/v2/destroy',index='57a35b9a-083c-4a93-a813-fc3ddfe1ff44',pipeline='bb25824e-6369-464a-81e1-876ffe3b95a0', schema=mystruct)

df.filter((df['User'] == 'user1') | (df['User'] == 'user2') | (df['User'] == 'user3')).groupBy(df['Operation']).count().show()

```

Without defining a schema, certain basic operations are possible using a built in (default schema)
```
basicDf = spark.read.format('stroom.spark.datasource.StroomDataSource').load(token='not required',host='localhost:8080',protocol='http',search_url='api/stroom-index/v2/search',destroy_url='api/stroom-index/v2/destroy',index='57a35b9a-083c-4a93-a813-fc3ddfe1ff44',pipeline='bb25824e-6369-464a-81e1-876ffe3b95a0')

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


