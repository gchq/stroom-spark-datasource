# StatisticStoreDoc

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | [**StatisticsDataSourceData**](StatisticsDataSourceData.md) |  |  [optional]
**createTime** | **Long** |  |  [optional]
**createTimeMs** | **Long** |  |  [optional]
**createUser** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**precision** | **Long** |  |  [optional]
**rollUpType** | [**RollUpTypeEnum**](#RollUpTypeEnum) |  |  [optional]
**statisticType** | [**StatisticTypeEnum**](#StatisticTypeEnum) |  |  [optional]
**type** | **String** |  |  [optional]
**updateTime** | **Long** |  |  [optional]
**updateTimeMs** | **Long** |  |  [optional]
**updateUser** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]
**version** | **String** |  |  [optional]

<a name="RollUpTypeEnum"></a>
## Enum: RollUpTypeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
ALL | &quot;ALL&quot;
CUSTOM | &quot;CUSTOM&quot;

<a name="StatisticTypeEnum"></a>
## Enum: StatisticTypeEnum
Name | Value
---- | -----
COUNT | &quot;COUNT&quot;
VALUE | &quot;VALUE&quot;
