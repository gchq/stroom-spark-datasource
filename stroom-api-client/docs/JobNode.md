# JobNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createTimeMs** | **Long** |  |  [optional]
**createUser** | **String** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**id** | **Integer** |  |  [optional]
**job** | [**Job**](Job.md) |  |  [optional]
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]
**nodeName** | **String** |  |  [optional]
**schedule** | **String** |  |  [optional]
**taskLimit** | **Integer** |  |  [optional]
**updateTimeMs** | **Long** |  |  [optional]
**updateUser** | **String** |  |  [optional]
**version** | **Integer** |  |  [optional]

<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
CRON | &quot;CRON&quot;
FREQUENCY | &quot;FREQUENCY&quot;
DISTRIBUTED | &quot;DISTRIBUTED&quot;
