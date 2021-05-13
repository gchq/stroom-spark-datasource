# IndexDoc

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createTime** | **Long** |  |  [optional]
**createTimeMs** | **Long** |  |  [optional]
**createUser** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**fields** | [**List&lt;IndexField&gt;**](IndexField.md) |  |  [optional]
**maxDocsPerShard** | **Integer** |  |  [optional]
**name** | **String** |  |  [optional]
**partitionBy** | [**PartitionByEnum**](#PartitionByEnum) |  |  [optional]
**partitionSize** | **Integer** |  |  [optional]
**retentionDayAge** | **Integer** |  |  [optional]
**shardsPerPartition** | **Integer** |  |  [optional]
**type** | **String** |  |  [optional]
**updateTime** | **Long** |  |  [optional]
**updateTimeMs** | **Long** |  |  [optional]
**updateUser** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]
**version** | **String** |  |  [optional]
**volumeGroupName** | **String** |  |  [optional]

<a name="PartitionByEnum"></a>
## Enum: PartitionByEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
YEAR | &quot;YEAR&quot;
