# ParsingApi

All URIs are relative to *https://custom-ocr.klippa.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parseDocument**](ParsingApi.md#parseDocument) | **POST** /parseDocument | Template Financial (default): Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.
[**parseDocumentEUPassport**](ParsingApi.md#parseDocumentEUPassport) | **POST** /parseDocument/eu-passport | Template EU Passport: Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.
[**parseDocumentIdentityDocument**](ParsingApi.md#parseDocumentIdentityDocument) | **POST** /parseDocument/identity_document | Template Identity Document: Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.
[**parseStructuredPDF**](ParsingApi.md#parseStructuredPDF) | **POST** /parseStructuredPDF | Parse a structured PDF file.
[**parseText**](ParsingApi.md#parseText) | **POST** /parseText | Parse plain text.


<a name="parseDocument"></a>
# **parseDocument**
> ReceiptBody parseDocument(document, url, template, pdfTextExtraction, userData, userDataSetExternalId)

Template Financial (default): Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.

Body is the raw document file in the &#x60;&#x60;&#x60;document&#x60;&#x60;&#x60; field. You can also give a URL in the &#x60;&#x60;&#x60;url&#x60;&#x60;&#x60; field to let the API download the file. Note: you need to either pass a document or a URL. The service accepts image (jpg/png/gif/heic/heif) and PDF files.  The template (when available) has to be given in the &#x60;&#x60;&#x60;template&#x60;&#x60;&#x60; value or in the query argument &#x60;&#x60;&#x60;template&#x60;&#x60;&#x60;. The query overwrites the form value.  The output is not the same for every template.  Note: ***this request is in multipart/form-data***.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.ParsingApi;

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

    ParsingApi apiInstance = new ParsingApi(defaultClient);
    File document = new File("/path/to/file"); // File | The document to scan as a multipart/form-data file. You can add this key multiple times to scan multiple parts of a document at once. If you are calling this method using JSON, the document field allows you to send an base64 string or an array of base64 strings for multiple files. Every file is seen as 1 scan.
    String url = "url_example"; // String | The document to scan as a file available at this URL. The request should be completed within 30 seconds. You can add this key multiple times to scan multiple parts of a document at once. Every url is seen as 1 scan.
    String template = "template_example"; // String | The template to use for parsing. Empty for default parsing.
    String pdfTextExtraction = "fast"; // String | PDF Text extraction. Use full when you want the best quality scan, use fast when you want fast scan results. Fast will try to extract the text from the PDF. Full will actually scan the full PDF, which is slower.
    String userData = "userData_example"; // String | Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data.
    String userDataSetExternalId = "userDataSetExternalId_example"; // String | The external ID of the user data set.
    try {
      ReceiptBody result = apiInstance.parseDocument(document, url, template, pdfTextExtraction, userData, userDataSetExternalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParsingApi#parseDocument");
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
 **document** | **File**| The document to scan as a multipart/form-data file. You can add this key multiple times to scan multiple parts of a document at once. If you are calling this method using JSON, the document field allows you to send an base64 string or an array of base64 strings for multiple files. Every file is seen as 1 scan. | [optional]
 **url** | **String**| The document to scan as a file available at this URL. The request should be completed within 30 seconds. You can add this key multiple times to scan multiple parts of a document at once. Every url is seen as 1 scan. | [optional]
 **template** | **String**| The template to use for parsing. Empty for default parsing. | [optional]
 **pdfTextExtraction** | **String**| PDF Text extraction. Use full when you want the best quality scan, use fast when you want fast scan results. Fast will try to extract the text from the PDF. Full will actually scan the full PDF, which is slower. | [optional] [default to fast] [enum: fast, full]
 **userData** | **String**| Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data. | [optional]
 **userDataSetExternalId** | **String**| The external ID of the user data set. | [optional]

### Return type

[**ReceiptBody**](ReceiptBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam), [APIPublicKeyHeader](../README.md#APIPublicKeyHeader), [APIPublicKeyQueryParam](../README.md#APIPublicKeyQueryParam)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The parsed document with the default template. |  -  |
**400** | The serializable Error with extra data structure.  Used for any common for form validation errors. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="parseDocumentEUPassport"></a>
# **parseDocumentEUPassport**
> EuropeanPassportBody parseDocumentEUPassport(document, url, template, pdfTextExtraction, userData, userDataSetExternalId)

Template EU Passport: Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.

Body is the raw document file in the &#x60;&#x60;&#x60;document&#x60;&#x60;&#x60; field. You can also give a URL in the &#x60;&#x60;&#x60;url&#x60;&#x60;&#x60; field to let the API download the file. Note: you need to either pass a document or a URL. The service accepts image (jpg/png/gif/heic/heif) and PDF files.  The template (when available) has to be given in the &#x60;&#x60;&#x60;template&#x60;&#x60;&#x60; value or in the query argument &#x60;&#x60;&#x60;template&#x60;&#x60;&#x60;. The query overwrites the form value.  The output is not the same for every template.  Note: ***this request is in multipart/form-data***.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.ParsingApi;

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

    ParsingApi apiInstance = new ParsingApi(defaultClient);
    File document = new File("/path/to/file"); // File | The passport document to scan as a multipart/form-data file. You can add this key multiple times to scan multiple parts of a passport document at once. If you are calling this method using JSON, the document field allows you to send an base64 string or an array of base64 strings for multiple files. Every file is seen as 1 scan.
    String url = "url_example"; // String | The passport document to scan as a file available at this URL. The request should be completed within 30 seconds. You can add this key multiple times to scan multiple parts of a passport document at once. Every url is seen as 1 scan.
    String template = "\"eu-passport\""; // String | The template to use for parsing. Empty for default parsing.
    String pdfTextExtraction = "fast"; // String | PDF Text extraction. Use full when you want the best quality scan, use fast when you want fast scan results. Fast will try to extract the text from the PDF. Full will actually scan the full PDF, which is slower. Speed difference: full: ~5s, fast: ~2.5. When a PDF does not contain text, e.g., scans of documents and pictures, we will automatically use full for that request. This value is ignored for non-PDF requests.
    String userData = "userData_example"; // String | Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data.
    String userDataSetExternalId = "userDataSetExternalId_example"; // String | The external ID of the user data set.
    try {
      EuropeanPassportBody result = apiInstance.parseDocumentEUPassport(document, url, template, pdfTextExtraction, userData, userDataSetExternalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParsingApi#parseDocumentEUPassport");
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
 **document** | **File**| The passport document to scan as a multipart/form-data file. You can add this key multiple times to scan multiple parts of a passport document at once. If you are calling this method using JSON, the document field allows you to send an base64 string or an array of base64 strings for multiple files. Every file is seen as 1 scan. | [optional]
 **url** | **String**| The passport document to scan as a file available at this URL. The request should be completed within 30 seconds. You can add this key multiple times to scan multiple parts of a passport document at once. Every url is seen as 1 scan. | [optional]
 **template** | **String**| The template to use for parsing. Empty for default parsing. | [optional] [default to &quot;eu-passport&quot;]
 **pdfTextExtraction** | **String**| PDF Text extraction. Use full when you want the best quality scan, use fast when you want fast scan results. Fast will try to extract the text from the PDF. Full will actually scan the full PDF, which is slower. Speed difference: full: ~5s, fast: ~2.5. When a PDF does not contain text, e.g., scans of documents and pictures, we will automatically use full for that request. This value is ignored for non-PDF requests. | [optional] [default to fast] [enum: fast, full]
 **userData** | **String**| Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data. | [optional]
 **userDataSetExternalId** | **String**| The external ID of the user data set. | [optional]

### Return type

[**EuropeanPassportBody**](EuropeanPassportBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam), [APIPublicKeyHeader](../README.md#APIPublicKeyHeader), [APIPublicKeyQueryParam](../README.md#APIPublicKeyQueryParam)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The parsed document with the eu-passport template. |  -  |
**400** | The serializable Error with extra data structure.  Used for any common for form validation errors. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="parseDocumentIdentityDocument"></a>
# **parseDocumentIdentityDocument**
> IdentityDocumentBody parseDocumentIdentityDocument(document, url, template, pdfTextExtraction, userData, userDataSetExternalId)

Template Identity Document: Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.

Body is the raw document file in the &#x60;&#x60;&#x60;document&#x60;&#x60;&#x60; field. You can also give a URL in the &#x60;&#x60;&#x60;url&#x60;&#x60;&#x60; field to let the API download the file. Note: you need to either pass a document or a URL. The service accepts image (jpg/png/gif/heic/heif) and PDF files.  The template (when available) has to be given in the &#x60;&#x60;&#x60;template&#x60;&#x60;&#x60; value or in the query argument &#x60;&#x60;&#x60;template&#x60;&#x60;&#x60;. The query overwrites the form value.  The output is not the same for every template.  Note: ***this request is in multipart/form-data***.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.ParsingApi;

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

    ParsingApi apiInstance = new ParsingApi(defaultClient);
    File document = new File("/path/to/file"); // File | The identity document to scan as a multipart/form-data file. You can add this key multiple times to scan multiple parts of a identity document at once. If you are calling this method using JSON, the document field allows you to send an base64 string or an array of base64 strings for multiple files. Every file is seen as 1 scan.
    String url = "url_example"; // String | The identity document to scan as a file available at this URL. The request should be completed within 30 seconds. You can add this key multiple times to scan multiple parts of a identity document at once. Every url is seen as 1 scan.
    String template = "\"identity_document\""; // String | The template to use for parsing. Empty for default parsing.
    String pdfTextExtraction = "fast"; // String | PDF Text extraction. Use full when you want the best quality scan, use fast when you want fast scan results. Fast will try to extract the text from the PDF. Full will actually scan the full PDF, which is slower. Speed difference: full: ~5s, fast: ~2.5. When a PDF does not contain text, e.g., scans of documents and pictures, we will automatically use full for that request. This value is ignored for non-PDF requests.
    String userData = "userData_example"; // String | Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data.
    String userDataSetExternalId = "userDataSetExternalId_example"; // String | The external ID of the user data set.
    try {
      IdentityDocumentBody result = apiInstance.parseDocumentIdentityDocument(document, url, template, pdfTextExtraction, userData, userDataSetExternalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParsingApi#parseDocumentIdentityDocument");
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
 **document** | **File**| The identity document to scan as a multipart/form-data file. You can add this key multiple times to scan multiple parts of a identity document at once. If you are calling this method using JSON, the document field allows you to send an base64 string or an array of base64 strings for multiple files. Every file is seen as 1 scan. | [optional]
 **url** | **String**| The identity document to scan as a file available at this URL. The request should be completed within 30 seconds. You can add this key multiple times to scan multiple parts of a identity document at once. Every url is seen as 1 scan. | [optional]
 **template** | **String**| The template to use for parsing. Empty for default parsing. | [optional] [default to &quot;identity_document&quot;]
 **pdfTextExtraction** | **String**| PDF Text extraction. Use full when you want the best quality scan, use fast when you want fast scan results. Fast will try to extract the text from the PDF. Full will actually scan the full PDF, which is slower. Speed difference: full: ~5s, fast: ~2.5. When a PDF does not contain text, e.g., scans of documents and pictures, we will automatically use full for that request. This value is ignored for non-PDF requests. | [optional] [default to fast] [enum: fast, full]
 **userData** | **String**| Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data. | [optional]
 **userDataSetExternalId** | **String**| The external ID of the user data set. | [optional]

### Return type

[**IdentityDocumentBody**](IdentityDocumentBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam), [APIPublicKeyHeader](../README.md#APIPublicKeyHeader), [APIPublicKeyQueryParam](../README.md#APIPublicKeyQueryParam)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The parsed document with the identity_document template. |  -  |
**400** | The serializable Error with extra data structure.  Used for any common for form validation errors. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="parseStructuredPDF"></a>
# **parseStructuredPDF**
> ReceiptBody parseStructuredPDF(document, template, userData)

Parse a structured PDF file.

Only use this when you are sure your PDF is plain text and not an image of a document.  Results in quicker / better parses in cases where the PDF only consists of plain text.  Body is the raw document file in the document field.  The template (when available) has to be given in the template value.  The output is not the same for every template.  Note: ***this request is in multipart/form-data***.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.ParsingApi;

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

    ParsingApi apiInstance = new ParsingApi(defaultClient);
    File document = new File("/path/to/file"); // File | The passport document to scan as a multipart/form-data file.
    String template = "template_example"; // String | The template to use for parsing. Empty for default parsing.
    String userData = "userData_example"; // String | Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data.
    try {
      ReceiptBody result = apiInstance.parseStructuredPDF(document, template, userData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParsingApi#parseStructuredPDF");
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
 **document** | **File**| The passport document to scan as a multipart/form-data file. |
 **template** | **String**| The template to use for parsing. Empty for default parsing. | [optional]
 **userData** | **String**| Extra metadata in JSON format to give to the parser. Only works with templates that are configured to accept user data. | [optional]

### Return type

[**ReceiptBody**](ReceiptBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The parsed PDF. |  -  |
**400** | The serializable Error with extra data structure.  Used for any common for form validation errors. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

<a name="parseText"></a>
# **parseText**
> ReceiptBody parseText(body)

Parse plain text.

The template (when available) has to be given in the template property.  The output is not the same for every template.

### Example
```java
// Import classes:
import com.klippa.ocrapi.ApiClient;
import com.klippa.ocrapi.ApiException;
import com.klippa.ocrapi.Configuration;
import com.klippa.ocrapi.auth.*;
import com.klippa.ocrapi.models.*;
import com.klippa.ocrapi.api.ParsingApi;

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

    ParsingApi apiInstance = new ParsingApi(defaultClient);
    TextUploadForm body = new TextUploadForm(); // TextUploadForm | 
    try {
      ReceiptBody result = apiInstance.parseText(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ParsingApi#parseText");
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
 **body** | [**TextUploadForm**](TextUploadForm.md)|  | [optional]

### Return type

[**ReceiptBody**](ReceiptBody.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQueryParam](../README.md#APIKeyQueryParam)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The parsed text. |  -  |
**400** | The serializable Error with extra data structure.  Used for any common for form validation errors. |  -  |
**500** | The serializable Error structure.  Used for any common errors. |  -  |

