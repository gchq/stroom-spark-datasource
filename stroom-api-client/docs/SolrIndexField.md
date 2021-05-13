# SolrIndexField

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultValue** | **String** |  |  [optional]
**docValues** | **Boolean** |  |  [optional]
**fieldName** | **String** |  |  [optional]
**fieldType** | **String** |  |  [optional]
**fieldUse** | [**FieldUseEnum**](#FieldUseEnum) |  |  [optional]
**indexed** | **Boolean** |  |  [optional]
**multiValued** | **Boolean** |  |  [optional]
**omitNorms** | **Boolean** |  |  [optional]
**omitPositions** | **Boolean** |  |  [optional]
**omitTermFreqAndPositions** | **Boolean** |  |  [optional]
**required** | **Boolean** |  |  [optional]
**sortMissingFirst** | **Boolean** |  |  [optional]
**sortMissingLast** | **Boolean** |  |  [optional]
**stored** | **Boolean** |  |  [optional]
**supportedConditions** | [**List&lt;SupportedConditionsEnum&gt;**](#List&lt;SupportedConditionsEnum&gt;) |  |  [optional]
**termOffsets** | **Boolean** |  |  [optional]
**termPayloads** | **Boolean** |  |  [optional]
**termPositions** | **Boolean** |  |  [optional]
**termVectors** | **Boolean** |  |  [optional]
**uninvertible** | **Boolean** |  |  [optional]

<a name="FieldUseEnum"></a>
## Enum: FieldUseEnum
Name | Value
---- | -----
ID | &quot;ID&quot;
BOOLEAN_FIELD | &quot;BOOLEAN_FIELD&quot;
INTEGER_FIELD | &quot;INTEGER_FIELD&quot;
LONG_FIELD | &quot;LONG_FIELD&quot;
FLOAT_FIELD | &quot;FLOAT_FIELD&quot;
DOUBLE_FIELD | &quot;DOUBLE_FIELD&quot;
DATE_FIELD | &quot;DATE_FIELD&quot;
FIELD | &quot;FIELD&quot;
NUMERIC_FIELD | &quot;NUMERIC_FIELD&quot;

<a name="List<SupportedConditionsEnum>"></a>
## Enum: List&lt;SupportedConditionsEnum&gt;
Name | Value
---- | -----
CONTAINS | &quot;CONTAINS&quot;
EQUALS | &quot;EQUALS&quot;
GREATER_THAN | &quot;GREATER_THAN&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;GREATER_THAN_OR_EQUAL_TO&quot;
LESS_THAN | &quot;LESS_THAN&quot;
LESS_THAN_OR_EQUAL_TO | &quot;LESS_THAN_OR_EQUAL_TO&quot;
BETWEEN | &quot;BETWEEN&quot;
IN | &quot;IN&quot;
IN_DICTIONARY | &quot;IN_DICTIONARY&quot;
IN_FOLDER | &quot;IN_FOLDER&quot;
IS_DOC_REF | &quot;IS_DOC_REF&quot;
IS_NULL | &quot;IS_NULL&quot;
IS_NOT_NULL | &quot;IS_NOT_NULL&quot;
