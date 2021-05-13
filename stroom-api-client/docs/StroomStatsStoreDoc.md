# StroomStatsStoreDoc

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**config** | [**StroomStatsStoreEntityData**](StroomStatsStoreEntityData.md) |  |  [optional]
**createTime** | **Long** |  |  [optional]
**createTimeMs** | **Long** |  |  [optional]
**createUser** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**enabled** | **Boolean** |  |  [optional]
**name** | **String** |  |  [optional]
**precision** | [**PrecisionEnum**](#PrecisionEnum) |  |  [optional]
**rollUpType** | [**RollUpTypeEnum**](#RollUpTypeEnum) |  |  [optional]
**statisticType** | [**StatisticTypeEnum**](#StatisticTypeEnum) |  |  [optional]
**type** | **String** |  |  [optional]
**updateTime** | **Long** |  |  [optional]
**updateTimeMs** | **Long** |  |  [optional]
**updateUser** | **String** |  |  [optional]
**uuid** | **String** |  |  [optional]
**version** | **String** |  |  [optional]

<a name="PrecisionEnum"></a>
## Enum: PrecisionEnum
Name | Value
---- | -----
SECOND | &quot;SECOND&quot;
MINUTE | &quot;MINUTE&quot;
HOUR | &quot;HOUR&quot;
DAY | &quot;DAY&quot;
FOREVER | &quot;FOREVER&quot;

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
