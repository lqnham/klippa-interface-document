

# CreateUserDataSetForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**externalID** | **String** | The ID on the external user this data set belongs to. | 
**lastSyncDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last sync date to keep track when you last updated this set. We advice to make this date equal to the last update date on the external side. Must be in RFC3339 format. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the data set. | 



## Enum: TypeEnum

Name | Value
---- | -----
RELATION | &quot;relation&quot;
TRANSACTION | &quot;transaction&quot;
PRODUCT | &quot;product&quot;
BUILDING | &quot;building&quot;
PURCHASE_ORDER | &quot;purchase_order&quot;


## Implemented Interfaces

* Serializable


