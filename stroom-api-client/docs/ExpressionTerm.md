# ExpressionTerm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**condition** | [**ConditionEnum**](#ConditionEnum) | The condition of the predicate term | 
**docRef** | [**DocRef**](DocRef.md) |  |  [optional]
**field** | **String** | The name of the field that is being evaluated in this predicate term | 
**value** | **String** | The value that the field value is being evaluated against. Not required if a dictionary is supplied |  [optional]

<a name="ConditionEnum"></a>
## Enum: ConditionEnum
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
