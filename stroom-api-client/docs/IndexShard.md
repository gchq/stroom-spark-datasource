# IndexShard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitDocumentCount** | **Integer** |  |  [optional]
**commitDurationMs** | **Long** |  |  [optional]
**commitMs** | **Long** |  |  [optional]
**documentCount** | **Integer** |  |  [optional]
**fileSize** | **Long** |  |  [optional]
**id** | **Long** |  |  [optional]
**indexUuid** | **String** |  |  [optional]
**indexVersion** | **String** |  |  [optional]
**nodeName** | **String** |  |  [optional]
**partition** | **String** |  |  [optional]
**partitionFromTime** | **Long** |  |  [optional]
**partitionToTime** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**volume** | [**IndexVolume**](IndexVolume.md) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CLOSED | &quot;CLOSED&quot;
OPEN | &quot;OPEN&quot;
CLOSING | &quot;CLOSING&quot;
OPENING | &quot;OPENING&quot;
NEW | &quot;NEW&quot;
DELETED | &quot;DELETED&quot;
CORRUPT | &quot;CORRUPT&quot;
