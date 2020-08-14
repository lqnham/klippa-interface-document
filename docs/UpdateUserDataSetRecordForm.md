

# UpdateUserDataSetRecordForm

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastSyncDate** | [**OffsetDateTime**](OffsetDateTime.md) | The last sync date to keep track when you last updated this set record. We advice to make this date equal to the last update date on the external side. Must be in RFC3339 format. |  [optional]
**values** | [**List&lt;UserDataSetRecordValueForm&gt;**](UserDataSetRecordValueForm.md) | The values that belong to this record. The available values differ per set type. |  [optional]


## Implemented Interfaces

* Serializable


