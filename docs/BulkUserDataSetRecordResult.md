

# BulkUserDataSetRecordResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The action that was performed. |  [optional]
**externalID** | **String** | The ID on the external user record this data set belongs to. |  [optional]
**failureCode** | **Long** | The code when Result is failure. 1: internal error 2: item exists (when doing a create) 3: item does not exist (when doing update or delete) |  [optional]
**failureMessage** | **String** | The message when Result is failure. |  [optional]
**item** | [**UserDataSetRecord**](UserDataSetRecord.md) |  |  [optional]
**result** | [**ResultEnum**](#ResultEnum) | The result of the action. |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
CREATE | &quot;create&quot;
UPDATE | &quot;update&quot;
UPSERT | &quot;upsert&quot;
DELETE | &quot;delete&quot;



## Enum: ResultEnum

Name | Value
---- | -----
CREATED | &quot;created&quot;
UPDATED | &quot;updated&quot;
DELETED | &quot;deleted&quot;
NO_CHANGE | &quot;no-change&quot;
FAILURE | &quot;failure&quot;


## Implemented Interfaces

* Serializable


