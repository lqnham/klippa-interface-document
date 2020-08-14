# PublicKeyApi

All URIs are relative to *https://custom-ocr.klippa.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPublicKey**](PublicKeyApi.md#createPublicKey) | **POST** /publicKey | Create a public key.
[**publicKeyInfo**](PublicKeyApi.md#publicKeyInfo) | **GET** /publicKey | Get information about the public key.
[**publicKeyInfoByID**](PublicKeyApi.md#publicKeyInfoByID) | **GET** /publicKey/{PublicKeyID} | Get information about the public key by a public key ID.
[**publicKeyStatistics**](PublicKeyApi.md#publicKeyStatistics) | **GET** /publicKey/{PublicKeyID}/statistics | Get API usage statistics for the public key.


<a name="createPublicKey"></a>
# **createPublicKey**
> CreatePublicKeyBody createPublicKey(body)

Create a public key.

The public key API is not available for every API key, we have to enable this for you.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.PublicKeyApi;

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

    PublicKeyApi apiInstance = new PublicKeyApi(defaultClient);
    CreatePublicKeyForm body = new CreatePublicKeyForm(); // CreatePublicKeyForm | 
    try {
      CreatePublicKeyBody result = apiInstance.createPublicKey(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicKeyApi#createPublicKey");
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
 **body** | [**CreatePublicKeyForm**](CreatePublicKeyForm.md)|  | [optional]

### Return type

[**CreatePublicKeyBody**](CreatePublicKeyBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with the new public key. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="publicKeyInfo"></a>
# **publicKeyInfo**
> GetPublicKeyInfoBody publicKeyInfo()

Get information about the public key.

This call can only be made with public key authentication.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.PublicKeyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://custom-ocr.klippa.com/api/v1");
    
    // Configure API key authorization: APIPublicKeyHeader
    ApiKeyAuth APIPublicKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIPublicKeyHeader");
    APIPublicKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIPublicKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIPublicKeyQueryParam
    ApiKeyAuth APIPublicKeyQueryParam = (ApiKeyAuth) defaultClient.getAuthentication("APIPublicKeyQueryParam");
    APIPublicKeyQueryParam.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIPublicKeyQueryParam.setApiKeyPrefix("Token");

    PublicKeyApi apiInstance = new PublicKeyApi(defaultClient);
    try {
      GetPublicKeyInfoBody result = apiInstance.publicKeyInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicKeyApi#publicKeyInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPublicKeyInfoBody**](GetPublicKeyInfoBody.md)

### Authorization

[APIPublicKeyHeader](../README.md#APIPublicKeyHeader), [APIPublicKeyQueryParam](../README.md#APIPublicKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with public key details. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="publicKeyInfoByID"></a>
# **publicKeyInfoByID**
> GetPublicKeyInfoBody publicKeyInfoByID(publicKeyID)

Get information about the public key by a public key ID.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.PublicKeyApi;

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

    PublicKeyApi apiInstance = new PublicKeyApi(defaultClient);
    String publicKeyID = "publicKeyID_example"; // String | The ID of the public key.
    try {
      GetPublicKeyInfoBody result = apiInstance.publicKeyInfoByID(publicKeyID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicKeyApi#publicKeyInfoByID");
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
 **publicKeyID** | **String**| The ID of the public key. |

### Return type

[**GetPublicKeyInfoBody**](GetPublicKeyInfoBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with public key details. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="publicKeyStatistics"></a>
# **publicKeyStatistics**
> PublicKeyStatisticsBody publicKeyStatistics(publicKeyID, dateMin, dateMax, granularity)

Get API usage statistics for the public key.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.PublicKeyApi;

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

    PublicKeyApi apiInstance = new PublicKeyApi(defaultClient);
    String publicKeyID = "publicKeyID_example"; // String | The ID of the public key.
    OffsetDateTime dateMin = new OffsetDateTime(); // OffsetDateTime | The minimum date of the receipts.
    OffsetDateTime dateMax = new OffsetDateTime(); // OffsetDateTime | The maximum date of the receipts.
    String granularity = "day"; // String | The granularity of the stat.
    try {
      PublicKeyStatisticsBody result = apiInstance.publicKeyStatistics(publicKeyID, dateMin, dateMax, granularity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PublicKeyApi#publicKeyStatistics");
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
 **publicKeyID** | **String**| The ID of the public key. |
 **dateMin** | **OffsetDateTime**| The minimum date of the receipts. | [optional]
 **dateMax** | **OffsetDateTime**| The maximum date of the receipts. | [optional]
 **granularity** | **String**| The granularity of the stat. | [optional] [default to day] [enum: year, month, day, hour]

### Return type

[**PublicKeyStatisticsBody**](PublicKeyStatisticsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with statistics of the credit usage for a public key. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

