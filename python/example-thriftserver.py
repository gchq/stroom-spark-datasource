from pyspark.sql import SparkSession
from py4j.java_gateway import java_import
import time
from pyspark.sql.types import *
from pyspark.sql.functions import from_json, col

spark = SparkSession.builder \
    .appName("Example Spark Thrift Server") \
    .config("spark.sql.hive.thriftServer.singleSession", "True") \
    .config("hive.server2.thrift.port", "10001") \
    .config('spark.jars.packages', 'stroom:stroom-spark-datasource:v1.0-alpha.1') \
    .config("javax.jdo.option.ConnectionURL", \
            "jdbc:derby:;databaseName=metastore_db2;create=true") \
    .enableHiveSupport() \
    .getOrCreate()

sc = spark.sparkContext

basicDf = spark.read.format('stroom.spark.datasource.StroomDataSource').load(
    token='not required',host='localhost:8080',protocol='http',
    uri='api/stroom-index/v2',
    index='57a35b9a-083c-4a93-a813-fc3ddfe1ff44',pipeline='13143179-b494-4146-ac4b-9a6010cada89')

json_schema = spark.read.json(basicDf.rdd.map(lambda row: row.json)).schema

df = basicDf.withColumn('evt', from_json(col('json'), json_schema)). \
    withColumn ('timestamp', col('evt.EventTime.TimeCreated')). \
    withColumn ('user', col('evt.EventSource.User.Id')). \
    withColumn('operation', col('evt.EventDetail.TypeId')). \
    withColumn ('type', col('evt.EventSource.Generator')). \
    select (['timestamp','user','operation','type'])

df.createOrReplaceTempView("stroom")



java_import(sc._gateway.jvm, "")
#Start Spark Thrift Server using the jvm and passing the SparkSession
sc._gateway.jvm.org.apache.spark.sql.hive.thriftserver \
    .HiveThriftServer2.startWithContext(spark._jwrapped)

#If submitted to spark as a job, it is necessary for it to never complete
#while True:
#    time.sleep(5)

# Is now possible to connect and the "stroom" table in Hive using JDBC.
#
# This can be tested with beeline
#
# ./beeline   -u jdbc:hive2://localhost:10001   -n usr -p pass   -e 'SHOW TABLES;'
#
#