# UserDataSetsApi

All URIs are relative to *https://custom-ocr.klippa.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkUserDataSetRecord**](UserDataSetsApi.md#bulkUserDataSetRecord) | **POST** /userDataSet/{ID}/records/bulk | Bulk create/update/delete user data set record.
[**createUserDataSet**](UserDataSetsApi.md#createUserDataSet) | **POST** /userDataSet | Create a new user data set.
[**createUserDataSetRecord**](UserDataSetsApi.md#createUserDataSetRecord) | **POST** /userDataSet/{ID}/records | Create a new user data set record.
[**deleteUserDataSet**](UserDataSetsApi.md#deleteUserDataSet) | **DELETE** /userDataSet/{ID} | Delete user data set.
[**deleteUserDataSetRecord**](UserDataSetsApi.md#deleteUserDataSetRecord) | **DELETE** /userDataSet/{ID}/records/{RecordID} | Delete user data set record.
[**getUserDataSet**](UserDataSetsApi.md#getUserDataSet) | **GET** /userDataSet/{ID} | Get user data set.
[**getUserDataSetRecord**](UserDataSetsApi.md#getUserDataSetRecord) | **GET** /userDataSet/{ID}/records/{RecordID} | Get user data set record.
[**getUserDataSetRecords**](UserDataSetsApi.md#getUserDataSetRecords) | **GET** /userDataSet/{ID}/records | List user data set records.
[**getUserDataSets**](UserDataSetsApi.md#getUserDataSets) | **GET** /userDataSet | List user data sets.
[**updateUserDataSet**](UserDataSetsApi.md#updateUserDataSet) | **PATCH** /userDataSet/{ID} | Update user data set.
[**updateUserDataSetRecord**](UserDataSetsApi.md#updateUserDataSetRecord) | **PATCH** /userDataSet/{ID}/records/{RecordID} | Update user data set record.


<a name="bulkUserDataSetRecord"></a>
# **bulkUserDataSetRecord**
> BulkUserDataSetRecordBody bulkUserDataSetRecord(ID, body)

Bulk create/update/delete user data set record.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    BulkUserDataSetRecordForm body = new BulkUserDataSetRecordForm(); // BulkUserDataSetRecordForm | 
    try {
      BulkUserDataSetRecordBody result = apiInstance.bulkUserDataSetRecord(ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#bulkUserDataSetRecord");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |
 **body** | [**BulkUserDataSetRecordForm**](BulkUserDataSetRecordForm.md)|  | [optional]

### Return type

[**BulkUserDataSetRecordBody**](BulkUserDataSetRecordBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data set. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="createUserDataSet"></a>
# **createUserDataSet**
> CreateUserDataSetResponseBody createUserDataSet(body)

Create a new user data set.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    CreateUserDataSetForm body = new CreateUserDataSetForm(); // CreateUserDataSetForm | 
    try {
      CreateUserDataSetResponseBody result = apiInstance.createUserDataSet(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#createUserDataSet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateUserDataSetForm**](CreateUserDataSetForm.md)|  | [optional]

### Return type

[**CreateUserDataSetResponseBody**](CreateUserDataSetResponseBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data set. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="createUserDataSetRecord"></a>
# **createUserDataSetRecord**
> CreateUserDataSetRecordResponseBody createUserDataSetRecord(ID, body)

Create a new user data set record.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    CreateUserDataSetRecordForm body = new CreateUserDataSetRecordForm(); // CreateUserDataSetRecordForm | 
    try {
      CreateUserDataSetRecordResponseBody result = apiInstance.createUserDataSetRecord(ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#createUserDataSetRecord");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |
 **body** | [**CreateUserDataSetRecordForm**](CreateUserDataSetRecordForm.md)|  | [optional]

### Return type

[**CreateUserDataSetRecordResponseBody**](CreateUserDataSetRecordResponseBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data record. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="deleteUserDataSet"></a>
# **deleteUserDataSet**
> DeleteUserDataSetBody deleteUserDataSet(ID)

Delete user data set.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    try {
      DeleteUserDataSetBody result = apiInstance.deleteUserDataSet(ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#deleteUserDataSet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |

### Return type

[**DeleteUserDataSetBody**](DeleteUserDataSetBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with an empty body. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="deleteUserDataSetRecord"></a>
# **deleteUserDataSetRecord**
> DeleteUserDataSetRecordBody deleteUserDataSetRecord(ID, recordID)

Delete user data set record.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    Integer recordID = 56; // Integer | The ID of the user data set record. To use the external ID, prefix the ID with E.
    try {
      DeleteUserDataSetRecordBody result = apiInstance.deleteUserDataSetRecord(ID, recordID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#deleteUserDataSetRecord");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |
 **recordID** | **Integer**| The ID of the user data set record. To use the external ID, prefix the ID with E. |

### Return type

[**DeleteUserDataSetRecordBody**](DeleteUserDataSetRecordBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with an empty body. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getUserDataSet"></a>
# **getUserDataSet**
> GetUserDataSetBody getUserDataSet(ID)

Get user data set.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    try {
      GetUserDataSetBody result = apiInstance.getUserDataSet(ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#getUserDataSet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |

### Return type

[**GetUserDataSetBody**](GetUserDataSetBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data set. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getUserDataSetRecord"></a>
# **getUserDataSetRecord**
> GetUserDataSetRecordBody getUserDataSetRecord(ID, recordID)

Get user data set record.

Note: we do not output the values of the record for privacy reasons.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    Integer recordID = 56; // Integer | The ID of the user data set record. To use the external ID, prefix the ID with E.
    try {
      GetUserDataSetRecordBody result = apiInstance.getUserDataSetRecord(ID, recordID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#getUserDataSetRecord");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |
 **recordID** | **Integer**| The ID of the user data set record. To use the external ID, prefix the ID with E. |

### Return type

[**GetUserDataSetRecordBody**](GetUserDataSetRecordBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data set. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getUserDataSetRecords"></a>
# **getUserDataSetRecords**
> GetUserDataSetRecordsBody getUserDataSetRecords(ID, perPage, page, sortOrder, sortField, type, externalId, filter)

List user data set records.

Note: we do not output the values of the record for privacy reasons.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    Long perPage = 10lL; // Long | The amount of results per page.
    Long page = 1lL; // Long | The page to load.
    String sortOrder = "ASC"; // String | The order to sort.
    String sortField = "CreatedAt"; // String | The field to sort on.
    String type = "type_example"; // String | The types to filter on. Separated by a comma. When no types are given, all types are returned.
    String externalId = "externalId_example"; // String | The external IDs to filter on. Separated by a comma. When no external IDs are given, items of all external ids are returned.
    String filter = "filter_example"; // String | A filter to use for the list. This query can be used multiple times.  Format is:  CreatedAt:{value}:{operator}  UpdatedAt:{value}:{operator}  ID:{value}:{operator}  ExternalID:{value}:{operator}  LastSyncDate:{value}:{operator}  {operator} is one of:  EQ (Equal)  NEQ (Not equal)  GT (Greater than)  GTE (Greater than or equal)  LT (Lower than)  LTE (Lower than or equal)  LIKE  NULL (value can be empty)  NOTNULL (value can be empty)
    try {
      GetUserDataSetRecordsBody result = apiInstance.getUserDataSetRecords(ID, perPage, page, sortOrder, sortField, type, externalId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#getUserDataSetRecords");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |
 **perPage** | **Long**| The amount of results per page. | [optional] [default to 10l]
 **page** | **Long**| The page to load. | [optional] [default to 1l]
 **sortOrder** | **String**| The order to sort. | [optional] [default to ASC] [enum: DESC, ASC]
 **sortField** | **String**| The field to sort on. | [optional] [default to CreatedAt] [enum: CreatedAt, UpdatedAt, ID, ExternalID, LastSyncDate]
 **type** | **String**| The types to filter on. Separated by a comma. When no types are given, all types are returned. | [optional]
 **externalId** | **String**| The external IDs to filter on. Separated by a comma. When no external IDs are given, items of all external ids are returned. | [optional]
 **filter** | **String**| A filter to use for the list. This query can be used multiple times.  Format is:  CreatedAt:{value}:{operator}  UpdatedAt:{value}:{operator}  ID:{value}:{operator}  ExternalID:{value}:{operator}  LastSyncDate:{value}:{operator}  {operator} is one of:  EQ (Equal)  NEQ (Not equal)  GT (Greater than)  GTE (Greater than or equal)  LT (Lower than)  LTE (Lower than or equal)  LIKE  NULL (value can be empty)  NOTNULL (value can be empty) | [optional]

### Return type

[**GetUserDataSetRecordsBody**](GetUserDataSetRecordsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data sets. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getUserDataSets"></a>
# **getUserDataSets**
> GetUserDataSetsBody getUserDataSets(perPage, page, sortOrder, sortField, type, externalId, filter)

List user data sets.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Long perPage = 10lL; // Long | The amount of results per page.
    Long page = 1lL; // Long | The page to load.
    String sortOrder = "ASC"; // String | The order to sort.
    String sortField = "CreatedAt"; // String | The field to sort on.
    String type = "type_example"; // String | The types to filter on. Separated by a comma. When no types are given, all types are returned.
    String externalId = "externalId_example"; // String | The external IDs to filter on. Separated by a comma. When no external IDs are given, items of all external ids are returned.
    String filter = "filter_example"; // String | A filter to use for the list. This query can be used multiple times.  Format is:  CreatedAt:{value}:{operator}  UpdatedAt:{value}:{operator}  ID:{value}:{operator}  Type:{value}:{operator}  ExternalID:{value}:{operator}  LastSyncDate:{value}:{operator}  {operator} is one of:  EQ (Equal)  NEQ (Not equal)  GT (Greater than)  GTE (Greater than or equal)  LT (Lower than)  LTE (Lower than or equal)  LIKE  NULL (value can be empty)  NOTNULL (value can be empty)
    try {
      GetUserDataSetsBody result = apiInstance.getUserDataSets(perPage, page, sortOrder, sortField, type, externalId, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#getUserDataSets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **perPage** | **Long**| The amount of results per page. | [optional] [default to 10l]
 **page** | **Long**| The page to load. | [optional] [default to 1l]
 **sortOrder** | **String**| The order to sort. | [optional] [default to ASC] [enum: DESC, ASC]
 **sortField** | **String**| The field to sort on. | [optional] [default to CreatedAt] [enum: CreatedAt, UpdatedAt, ID, Type, ExternalID, LastSyncDate]
 **type** | **String**| The types to filter on. Separated by a comma. When no types are given, all types are returned. | [optional]
 **externalId** | **String**| The external IDs to filter on. Separated by a comma. When no external IDs are given, items of all external ids are returned. | [optional]
 **filter** | **String**| A filter to use for the list. This query can be used multiple times.  Format is:  CreatedAt:{value}:{operator}  UpdatedAt:{value}:{operator}  ID:{value}:{operator}  Type:{value}:{operator}  ExternalID:{value}:{operator}  LastSyncDate:{value}:{operator}  {operator} is one of:  EQ (Equal)  NEQ (Not equal)  GT (Greater than)  GTE (Greater than or equal)  LT (Lower than)  LTE (Lower than or equal)  LIKE  NULL (value can be empty)  NOTNULL (value can be empty) | [optional]

### Return type

[**GetUserDataSetsBody**](GetUserDataSetsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data sets. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="updateUserDataSet"></a>
# **updateUserDataSet**
> UpdateUserDataSetBody updateUserDataSet(ID, body)

Update user data set.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    UpdateUserDataSetForm body = new UpdateUserDataSetForm(); // UpdateUserDataSetForm | 
    try {
      UpdateUserDataSetBody result = apiInstance.updateUserDataSet(ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#updateUserDataSet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |
 **body** | [**UpdateUserDataSetForm**](UpdateUserDataSetForm.md)|  | [optional]

### Return type

[**UpdateUserDataSetBody**](UpdateUserDataSetBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data set. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="updateUserDataSetRecord"></a>
# **updateUserDataSetRecord**
> UpdateUserDataSetRecordBody updateUserDataSetRecord(ID, recordID, body)

Update user data set record.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.UserDataSetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQueryParam
    ApiKeyAuth APIKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQueryParam");
    APIKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQueryParam.setApiKeyPrefix("Token");

    UserDataSetsApi apiInstance = new UserDataSetsApi(defaultClient);
    Integer ID = 56; // Integer | The ID of the user data set. To use the external ID, prefix the ID with E-{type}-.
    Integer recordID = 56; // Integer | The ID of the user data set record. To use the external ID, prefix the ID with E.
    UpdateUserDataSetRecordForm body = new UpdateUserDataSetRecordForm(); // UpdateUserDataSetRecordForm | 
    try {
      UpdateUserDataSetRecordBody result = apiInstance.updateUserDataSetRecord(ID, recordID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserDataSetsApi#updateUserDataSetRecord");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ID** | **Integer**| The ID of the user data set. To use the external ID, prefix the ID with E-{type}-. |
 **recordID** | **Integer**| The ID of the user data set record. To use the external ID, prefix the ID with E. |
 **body** | [**UpdateUserDataSetRecordForm**](UpdateUserDataSetRecordForm.md)|  | [optional]

### Return type

[**UpdateUserDataSetRecordBody**](UpdateUserDataSetRecordBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the user data set record. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

