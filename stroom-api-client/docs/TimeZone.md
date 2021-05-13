# TimeZone

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the time zone, conforming to java.time.ZoneId |  [optional]
**offsetHours** | **Integer** | The number of hours this timezone is offset from UTC |  [optional]
**offsetMinutes** | **Integer** | The number of minutes this timezone is offset from UTC |  [optional]
**use** | [**UseEnum**](#UseEnum) | How the time zone will be specified, e.g. from provided client &#x27;Local&#x27; time, &#x27;UTC&#x27;, a recognised timezone &#x27;Id&#x27; or an &#x27;Offset&#x27; from UTC in hours and minutes. | 

<a name="UseEnum"></a>
## Enum: UseEnum
Name | Value
---- | -----
LOCAL | &quot;Local&quot;
UTC | &quot;UTC&quot;
ID | &quot;Id&quot;
OFFSET | &quot;Offset&quot;
