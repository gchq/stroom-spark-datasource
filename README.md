# stroom-spark-datasource
This creates a single jar file that can be loaded into Spark.
On a single node it is possible to run the command
`
pyspark --jars ./target/stroom-datasource-1.0-SNAPSHOT.jar
`

Then from within pyspark shell, use
```
df = spark.read.format('stroom.spark.datasource.StroomDataSource').load()
df.show()
```
