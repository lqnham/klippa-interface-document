# SubKeyApi

All URIs are relative to *https://custom-ocr.klippa.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSubKey**](SubKeyApi.md#createSubKey) | **POST** /subKey | Create a sub key.
[**deleteSubKey**](SubKeyApi.md#deleteSubKey) | **DELETE** /subKey/{SubKeyID} | Delete the sub key.
[**getSubKey**](SubKeyApi.md#getSubKey) | **GET** /subKey/{SubKeyID} | Get the sub key.
[**subKeyList**](SubKeyApi.md#subKeyList) | **GET** /subKey | Get a list of sub keys.
[**subKeyStatistics**](SubKeyApi.md#subKeyStatistics) | **GET** /subKey/{SubKeyID}/statistics | Get API usage statistics for the sub key.
[**updateSubKey**](SubKeyApi.md#updateSubKey) | **PATCH** /subKey/{SubKeyID} | Update the sub key.


<a name="createSubKey"></a>
# **createSubKey**
> CreateSubKeyBody createSubKey(body)

Create a sub key.

The sub key API is not available for every API key, we have to enable this for you.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.SubKeyApi;

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

    SubKeyApi apiInstance = new SubKeyApi(defaultClient);
    SubKeyForm body = new SubKeyForm(); // SubKeyForm | 
    try {
      CreateSubKeyBody result = apiInstance.createSubKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubKeyApi#createSubKey");
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
 **body** | [**SubKeyForm**](SubKeyForm.md)|  | [optional]

### Return type

[**CreateSubKeyBody**](CreateSubKeyBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the new key. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="deleteSubKey"></a>
# **deleteSubKey**
> DeleteSubKeyBody deleteSubKey(subKeyID)

Delete the sub key.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.SubKeyApi;

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

    SubKeyApi apiInstance = new SubKeyApi(defaultClient);
    String subKeyID = "subKeyID_example"; // String | The ID of the sub key.
    try {
      DeleteSubKeyBody result = apiInstance.deleteSubKey(subKeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubKeyApi#deleteSubKey");
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
 **subKeyID** | **String**| The ID of the sub key. |

### Return type

[**DeleteSubKeyBody**](DeleteSubKeyBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response about the deleted sub key. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getSubKey"></a>
# **getSubKey**
> GetSubKeyBody getSubKey(subKeyID)

Get the sub key.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.SubKeyApi;

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

    SubKeyApi apiInstance = new SubKeyApi(defaultClient);
    String subKeyID = "subKeyID_example"; // String | The ID of the sub key.
    try {
      GetSubKeyBody result = apiInstance.getSubKey(subKeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubKeyApi#getSubKey");
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
 **subKeyID** | **String**| The ID of the sub key. |

### Return type

[**GetSubKeyBody**](GetSubKeyBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the sub key. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="subKeyList"></a>
# **subKeyList**
> SubKeyListBody subKeyList(perPage, page, sortOrder, sortField)

Get a list of sub keys.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.SubKeyApi;

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

    SubKeyApi apiInstance = new SubKeyApi(defaultClient);
    Long perPage = 10lL; // Long | The amount of results per page.
    Long page = 1lL; // Long | The page to load.
    String sortOrder = "ASC"; // String | The order to sort.
    String sortField = "CreatedAt"; // String | The field to sort on.
    try {
      SubKeyListBody result = apiInstance.subKeyList(perPage, page, sortOrder, sortField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubKeyApi#subKeyList");
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
 **sortField** | **String**| The field to sort on. | [optional] [default to CreatedAt] [enum: CreatedAt, UpdatedAt, ID]

### Return type

[**SubKeyListBody**](SubKeyListBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with sub key details. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="subKeyStatistics"></a>
# **subKeyStatistics**
> SubKeyStatisticsBody subKeyStatistics(subKeyID, dateMin, dateMax, granularity)

Get API usage statistics for the sub key.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.SubKeyApi;

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

    SubKeyApi apiInstance = new SubKeyApi(defaultClient);
    String subKeyID = "subKeyID_example"; // String | The ID of the sub key.
    OffsetDateTime dateMin = new OffsetDateTime(); // OffsetDateTime | The minimum date of the receipts.
    OffsetDateTime dateMax = new OffsetDateTime(); // OffsetDateTime | The maximum date of the receipts.
    String granularity = "day"; // String | The granularity of the stat.
    try {
      SubKeyStatisticsBody result = apiInstance.subKeyStatistics(subKeyID, dateMin, dateMax, granularity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubKeyApi#subKeyStatistics");
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
 **subKeyID** | **String**| The ID of the sub key. |
 **dateMin** | **OffsetDateTime**| The minimum date of the receipts. | [optional]
 **dateMax** | **OffsetDateTime**| The maximum date of the receipts. | [optional]
 **granularity** | **String**| The granularity of the stat. | [optional] [default to day] [enum: year, month, day, hour]

### Return type

[**SubKeyStatisticsBody**](SubKeyStatisticsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with statistics of the credit usage for a sub key. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="updateSubKey"></a>
# **updateSubKey**
> UpdateSubKeyBody updateSubKey(subKeyID)

Update the sub key.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.SubKeyApi;

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

    SubKeyApi apiInstance = new SubKeyApi(defaultClient);
    String subKeyID = "subKeyID_example"; // String | The ID of the sub key.
    try {
      UpdateSubKeyBody result = apiInstance.updateSubKey(subKeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SubKeyApi#updateSubKey");
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
 **subKeyID** | **String**| The ID of the sub key. |

### Return type

[**UpdateSubKeyBody**](UpdateSubKeyBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the updated sub key. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

