

# SubKeyForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the sub key | 
**publicKeys** | **Boolean** | Whether the sub key can use public keys. Note that the parent key must also be able to do this. |  [optional]
**status** | **Boolean** | The status of the sub key. |  [optional]
**templates** | **List&lt;String&gt;** | A list of template keys that the key can use. Note that the parent key must have access to it. |  [optional]
**userDataSets** | **Boolean** | Whether the sub key can use user data sets. Note that the parent key must also be able to do this. |  [optional]


## Implemented Interfaces

* Serializable


