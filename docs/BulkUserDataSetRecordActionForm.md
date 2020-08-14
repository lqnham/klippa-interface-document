

# BulkUserDataSetRecordActionForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The action to perform. | 
**externalID** | **String** | The ID on the external user record this data set belongs to. | 
**lastSyncDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last sync date to keep track when you last updated this set record. We advice to make this date equal to the last update date on the external side. Must be in RFC3339 format. |  [optional]
**values** | [**List&lt;UserDataSetRecordValueForm&gt;**](UserDataSetRecordValueForm.md) | The values that belong to this record. The available values differ per set type. |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
CREATE | &quot;create&quot;
UPDATE | &quot;update&quot;
UPSERT | &quot;upsert&quot;
DELETE | &quot;delete&quot;


## Implemented Interfaces

* Serializable


