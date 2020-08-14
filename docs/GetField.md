

# GetField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **String** | The key of the field in the output. |  [optional]
**nullable** | **Boolean** | Whether the value of the type is nullable. |  [optional]
**subType** | [**GetFieldSubtype**](GetFieldSubtype.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the field. |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
BOOL | &quot;bool&quot;
STRING | &quot;string&quot;
UINT | &quot;uint&quot;
INT | &quot;int&quot;
INT64 | &quot;int64&quot;
FLOAT | &quot;float&quot;
FLOAT64 | &quot;float64&quot;
ARRAY | &quot;array&quot;
MAP | &quot;map&quot;
KEY_VALUE | &quot;key_value&quot;
ANY | &quot;any&quot;


## Implemented Interfaces

* Serializable


