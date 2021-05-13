# PipelineStepRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childStreamType** | **String** |  |  [optional]
**code** | **Map&lt;String, String&gt;** |  |  [optional]
**criteria** | [**FindMetaCriteria**](FindMetaCriteria.md) |  |  [optional]
**pipeline** | [**DocRef**](DocRef.md) |  |  [optional]
**stepFilterMap** | [**Map&lt;String, SteppingFilterSettings&gt;**](SteppingFilterSettings.md) |  |  [optional]
**stepLocation** | [**StepLocation**](StepLocation.md) |  |  [optional]
**stepSize** | **Integer** |  |  [optional]
**stepType** | [**StepTypeEnum**](#StepTypeEnum) |  |  [optional]

<a name="StepTypeEnum"></a>
## Enum: StepTypeEnum
Name | Value
---- | -----
FIRST | &quot;FIRST&quot;
FORWARD | &quot;FORWARD&quot;
BACKWARD | &quot;BACKWARD&quot;
LAST | &quot;LAST&quot;
REFRESH | &quot;REFRESH&quot;
