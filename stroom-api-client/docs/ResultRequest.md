# ResultRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**componentId** | **String** | The ID of the component that will receive the results corresponding to this ResultRequest | 
**fetch** | [**FetchEnum**](#FetchEnum) |  |  [optional]
**mappings** | [**List&lt;TableSettings&gt;**](TableSettings.md) |  | 
**openGroups** | **List&lt;String&gt;** | TODO | 
**requestedRange** | [**OffsetRange**](OffsetRange.md) |  | 
**resultStyle** | [**ResultStyleEnum**](#ResultStyleEnum) | The style of results required. FLAT will provide a FlatResult object, while TABLE will provide a TableResult object | 

<a name="FetchEnum"></a>
## Enum: FetchEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
CHANGES | &quot;CHANGES&quot;
ALL | &quot;ALL&quot;

<a name="ResultStyleEnum"></a>
## Enum: ResultStyleEnum
Name | Value
---- | -----
FLAT | &quot;FLAT&quot;
TABLE | &quot;TABLE&quot;
