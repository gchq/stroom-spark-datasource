# ProcessorTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createTimeMs** | **Long** |  |  [optional]
**data** | **String** |  |  [optional]
**endTimeMs** | **Long** |  |  [optional]
**feedName** | **String** |  |  [optional]
**id** | **Long** |  |  [optional]
**metaId** | **Long** |  |  [optional]
**nodeName** | **String** |  |  [optional]
**processorFilter** | [**ProcessorFilter**](ProcessorFilter.md) |  |  [optional]
**startTimeMs** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**statusTimeMs** | **Long** |  |  [optional]
**version** | **Integer** |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNPROCESSED | &quot;UNPROCESSED&quot;
ASSIGNED | &quot;ASSIGNED&quot;
PROCESSING | &quot;PROCESSING&quot;
COMPLETE | &quot;COMPLETE&quot;
FAILED | &quot;FAILED&quot;
DELETED | &quot;DELETED&quot;
