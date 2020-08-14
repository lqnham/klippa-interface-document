

# GetFieldSubtype

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List&lt;GetField&gt;**](GetField.md) | The subfields of maps or arrays with subtype map. |  [optional]
**nullable** | **Boolean** | Whether the value of the subtype is nullable in case of array or key_value. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the subfield in case of arrays or key_value. |  [optional]



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


