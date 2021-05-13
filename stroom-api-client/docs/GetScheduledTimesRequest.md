# GetScheduledTimesRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobType** | [**JobTypeEnum**](#JobTypeEnum) |  |  [optional]
**lastExecutedTime** | **Long** |  |  [optional]
**schedule** | **String** |  |  [optional]
**scheduleReferenceTime** | **Long** |  |  [optional]

<a name="JobTypeEnum"></a>
## Enum: JobTypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;UNKNOWN&quot;
CRON | &quot;CRON&quot;
FREQUENCY | &quot;FREQUENCY&quot;
DISTRIBUTED | &quot;DISTRIBUTED&quot;
