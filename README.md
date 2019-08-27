# stroom-spark-datasource
This creates a single jar file that can be loaded into Spark.
On a single node it is possible to run the command
`
pyspark --jars target/stroom-datasource-1.0-SNAPSHOT.jar,lib/stroom-query-api-v2.1-beta.21.jar,lib/jersey-media-json-jackson-2.25.1.jar,lib/jersey-entity-filtering-2.25.1.jar,lib/jackson-jaxrs-json-provider-2.8.6.jar,lib/jackson-annotations-2.8.6.jar,lib/jackson-core-2.8.6.jar,lib/jackson-jaxrs-base-2.8.6.jar
`

Then from within pyspark shell, try
```
df = spark.read.format('stroom.spark.datasource.StroomDataSource').load(token='mybiglongauthenticationtokenstringgoesinhere',host='localhost:8080',protocol='http',search_url='api/stroom-index/v2/search',destroy_url='api/stroom-index/v2/destroy')

df.filter((df['User'] == 'user1') | (df['User'] == 'user2') | (df['User'] == 'user3')).groupBy(df['Operation']).count().show()

```
