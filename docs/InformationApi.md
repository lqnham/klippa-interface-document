# InformationApi

All URIs are relative to *https://custom-ocr.klippa.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**credits**](InformationApi.md#credits) | **GET** /credits | List available credits.
[**getAPIIndex**](InformationApi.md#getAPIIndex) | **GET** / | Information about the API.
[**getFields**](InformationApi.md#getFields) | **GET** /fields | List of available fields.
[**getFieldsByTemplate**](InformationApi.md#getFieldsByTemplate) | **GET** /fields/{Template} | List of available fields for a specific template.
[**getTemplates**](InformationApi.md#getTemplates) | **GET** /templates | List of available templates.
[**listStatisticsInput**](InformationApi.md#listStatisticsInput) | **GET** /statistics | Get API usage statistics.


<a name="credits"></a>
# **credits**
> GetCreditsBody credits()

List available credits.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.InformationApi;

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

    InformationApi apiInstance = new InformationApi(defaultClient);
    try {
      GetCreditsBody result = apiInstance.credits();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#credits");
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

[**GetCreditsBody**](GetCreditsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with available credits. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getAPIIndex"></a>
# **getAPIIndex**
> APIIndexBody getAPIIndex()

Information about the API.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.InformationApi;

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

    InformationApi apiInstance = new InformationApi(defaultClient);
    try {
      APIIndexBody result = apiInstance.getAPIIndex();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getAPIIndex");
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

[**APIIndexBody**](APIIndexBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Information about the API. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getFields"></a>
# **getFields**
> GetFieldsBody getFields()

List of available fields.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.InformationApi;

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

    InformationApi apiInstance = new InformationApi(defaultClient);
    try {
      GetFieldsBody result = apiInstance.getFields();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getFields");
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

[**GetFieldsBody**](GetFieldsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with available fields. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getFieldsByTemplate"></a>
# **getFieldsByTemplate**
> GetFieldsBody getFieldsByTemplate(template)

List of available fields for a specific template.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.InformationApi;

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

    InformationApi apiInstance = new InformationApi(defaultClient);
    String template = "template_example"; // String | The key of the template.
    try {
      GetFieldsBody result = apiInstance.getFieldsByTemplate(template);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getFieldsByTemplate");
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
 **template** | **String**| The key of the template. |

### Return type

[**GetFieldsBody**](GetFieldsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with available fields. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="getTemplates"></a>
# **getTemplates**
> GetTemplatesBody getTemplates()

List of available templates.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.InformationApi;

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

    InformationApi apiInstance = new InformationApi(defaultClient);
    try {
      GetTemplatesBody result = apiInstance.getTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#getTemplates");
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

[**GetTemplatesBody**](GetTemplatesBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with available templates. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="listStatisticsInput"></a>
# **listStatisticsInput**
> GetStatisticsBody listStatisticsInput(dateMin, dateMax, granularity, publicKeyId, publicKeyExternalId, includeSubKeys)

Get API usage statistics.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.InformationApi;

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

    InformationApi apiInstance = new InformationApi(defaultClient);
    OffsetDateTime dateMin = new OffsetDateTime(); // OffsetDateTime | The minimum date of the receipts.
    OffsetDateTime dateMax = new OffsetDateTime(); // OffsetDateTime | The maximum date of the receipts.
    String granularity = "day"; // String | The granularity of the stat.
    Integer publicKeyId = 56; // Integer | The id of the public key.
    String publicKeyExternalId = "publicKeyExternalId_example"; // String | The external identifier of the public key.
    String includeSubKeys = "1"; // String | Whether to include sub keys in the stats.
    try {
      GetStatisticsBody result = apiInstance.listStatisticsInput(dateMin, dateMax, granularity, publicKeyId, publicKeyExternalId, includeSubKeys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InformationApi#listStatisticsInput");
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
 **dateMin** | **OffsetDateTime**| The minimum date of the receipts. | [optional]
 **dateMax** | **OffsetDateTime**| The maximum date of the receipts. | [optional]
 **granularity** | **String**| The granularity of the stat. | [optional] [default to day] [enum: year, month, day, hour]
 **publicKeyId** | **Integer**| The id of the public key. | [optional]
 **publicKeyExternalId** | **String**| The external identifier of the public key. | [optional]
 **includeSubKeys** | **String**| Whether to include sub keys in the stats. | [optional] [default to 1] [enum: 1, 0]

### Return type

[**GetStatisticsBody**](GetStatisticsBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response with statistics of the API usage. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

