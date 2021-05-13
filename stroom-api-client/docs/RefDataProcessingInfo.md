# RefDataProcessingInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**createTimeEpochMs** | **Long** |  |  [optional]
**effectiveTimeEpochMs** | **Long** |  |  [optional]
**lastAccessedTimeEpochMs** | **Long** |  |  [optional]
**processingState** | [**ProcessingStateEnum**](#ProcessingStateEnum) |  |  [optional]

<a name="ProcessingStateEnum"></a>
## Enum: ProcessingStateEnum
Name | Value
---- | -----
LOAD_IN_PROGRESS | &quot;LOAD_IN_PROGRESS&quot;
PURGE_IN_PROGRESS | &quot;PURGE_IN_PROGRESS&quot;
COMPLETE | &quot;COMPLETE&quot;
