# ProcessorTaskSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Long** |  |  [optional]
**feed** | **String** |  |  [optional]
**pipeline** | [**DocRef**](DocRef.md) |  |  [optional]
**priority** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]

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
