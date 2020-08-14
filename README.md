# openapi-java-client

Klippa Custom OCR API
- API version: v0-15-43 - 217cfc26184c8a32170e3f3bc03726612d85b718
  - Build date: 2020-08-11T13:49:40.300Z[GMT]

# Introduction
The Klippa Custom OCR Webservice API is a REST webservice for custom OCR implementations by Klippa.

The service replies are JSON only.

The service base URL is https://custom-ocr.klippa.com/api/v1.
The service base URL for the test environment is https://test.custom-ocr.klippa.com/api/v1, we test experimental templates and features there. It also hosts the demo interface.

# Authentication
## APIKeyHeader
The API requires the following header to be set:

Header | Description |
--- |--- |
  X-Auth-Key  |  The auth key provided by Klippa. |

The Key is provided per customer by Klippa.

## APIKeyQueryParam
The key can also be provided in the request query as ```?X-Auth-Key=key```

## APIPublicKeyHeader
The Public API requires the following header to be set:

Header | Description |
--- |--- |
  X-Auth-Public-Key  |  The public auth key provided by Klippa. |

## APIPublicKeyQueryParam
The key can also be provided in the request query as ```?X-Auth-Public-Key=public-key```


# Calling the API from public applications
If you want to call the API from a public application, like a mobile app, you should **NOT** embed your API key in the app, this key could be extracted and abused.

The way to do this is using our API to [generate a public key](#operation/createPublicKey) from your backend, and send that public key to your application. That way only users that are authenticated are allowed to call the API.
That way you can also better monitor which users are using the API and prevent abuse. You can also configure the public key to be valid for a certain time and give a maximum amount of scans.

The public key API is not available for every API key, we have to enable this for you.

We also have a [complete scanner SDK for Android and iOS](https://www.klippa.com/en/ocr/ocr-sdk/) available that has this API integrated.

The Public API requires the following header to be set:

Header | Description |
--- |--- |
  X-Auth-Public-Key  |  The public auth key provided by Klippa. |

The key can also be provided in the request query as ```?X-Auth-Public-Key=public-key```


# API Client libraries

Language | Client |
--- |--- |
  Go  |   [go.tar.gz](/docs/static/clients/go.tar.gz) |
  Java  |   [java.tar.gz](/docs/static/clients/java.tar.gz) |
  PHP  |   [php.tar.gz](/docs/static/clients/php.tar.gz) |
  Python  |   [python.tar.gz](/docs/static/clients/python.tar.gz) |
  Typescript (Axios)  |   [typescript.tar.gz](/docs/static/clients/typescript.tar.gz) |
  Swift 4  |   [swift4.tar.gz](/docs/static/clients/swift4.tar.gz) |
  Swift 5  |   [swift5.tar.gz](/docs/static/clients/swift5.tar.gz) |


# Error codes
## Authentication errors

Code | Name |
--- |--- |
  100001  |   ErrorCodeAuthMissingKey |
  100002  |   ErrorCodeAuthInvalidKey |
  100003  |   ErrorCodeAuthError |
  100004  |   ErrorCodeAuthNoCreditsLeft |
  100005  |   ErrorCodeAuthInvalidPublicKey |
  100006  |   ErrorCodeAuthPublicKeyNoScansLeft |
  100007  |   ErrorCodeAuthPublicKeyExpired |


## PDF Parser errors

Code | Name |
--- |--- |
  200001  |   ErrorCodePDFParserDocumentError |
  200002  |   Obsolete |
  200003  |   Obsolete |
  200004  |   ErrorCodePDFParserNoAccessToTemplate |
  200005  |   ErrorCodePDFParserConvertError |
  200006  |   ErrorCodePDFParserParseError |


## Document Parser errors

Code | Name |
--- |--- |
  300001  |   ErrorCodeDocumentParserDocumentError |
  300002  |   Obsolete |
  300003  |   Obsolete |
  300004  |   ErrorCodeDocumentParserNoAccessToTemplate |
  300005  |   ErrorCodeDocumentParserConvertError |
  300006  |   ErrorCodeDocumentParserParseError |
  300007  |   ErrorCodeDocumentParserTooBigFileError |


## Public Key errors

Code | Name |
--- |--- |
  400001  |   ErrorCodePublicKeyNotAllowed |
  400002  |   ErrorCodePublicKeyCreationFailed |
  400003  |   ErrorCodePublicKeyInvalidScanLimit |
  400004  |   ErrorCodePublicKeyInvalidValidTime |
  400005  |   ErrorCodePublicKeyLoadError |
  400006  |   ErrorCodePublicKeyNotFoundError |

# Userdata

The user_data field allows for sending additional data into the parser and can be used to enable extra features, improve the recognition of certain fields and improve the processing speed. The user_data must be given as a JSON-encoded string. All fields are optional, a documents may be submitted without this field.

The following fields are accepted in the user_data object:

Key | Value type  | Description |
--|--|--|
`client`| `Relation` object | A relation object containing information about the client that submits the document. It should contain information either the merchant of the customer of the invoice. This is indicated by the `transaction_type` key. If the `transaction_type` is set to `purchase`, the client is considered to be the customer. If the `transaction_type` is set to `sale`, the client is considered to be the merchant.
`transaction_type`  | string  | The transaction type of the document for the client. If the invoices contains a sale that the client made, this field can be set to `sale`. If the invoice contains a purchase that the client made, this field can be set to `purchase`.|
`relations`  | array of `Relation` objects  | An optional list of relations which have previously been used by the client. The list does not have to be complete, the OCR may suggest merchants and customers which are not in this list. |
`transactions`  | array of `Transaction` objects  | An optional list of open transactions for the client. We use this list to validate and improve our OCR detections. |
`purchase_orders`  | array of `PurchaseOrder` objects  | An optional list of purchase orders. It's identifier will be present in the output if the purchase order was found on the document |
`locale`| `Locale` object | If the language or originating country of the document is known, these values may be set.


## Relation object

The relation object may contain the following fields. All fields are optional and may be omitted if a field is not available. This user data can also be managed by [User Data Sets](#tag/UserDataSets) when allowed for your key.

Key | Value type  | Description |
--|--|--|
id|string|The ID of the relation in your own system, we will return this id in the `merchant_id` field if there is a match. In the User Data Set this is the ExternalID.
name|string|The company name of the client
street_name|string|The street name of the client address
street_number|string|The street number of the client address
zipcode|string|The zipcode of the client address
city|string|The city of the client address
country|string|The country of the client address. It must be provided as a 2-letter country code as specified by ISO 3166-1. For example `FR` for France and `NL` for The Netherlands
vat_number|string|The vat number, formatted according to the EU VAT directive. It must start with the country code prefix, such as `FR` or `NL`
coc_number|string|A chamber of commerce number. E.g. the Dutch KVK number, or the French SIRET/SIREN number
phone|string|The phone number of the client. International calling codes, such as `+33` may be provided but are not required
website|string|The full URL to the website
email|string|The email address
bank_account_number|string|The IBAN number


## Transaction object

The transaction object may contain the following fields. All fields are optional and may be omitted if a field is not available. This user data can also be managed by [User Data Sets](#tag/UserDataSets) when allowed for your key.

Key | Value type  | Description |
--|--|--|
identifier|string|The identifier of the transaction as given by the bank
date|string|The date of the transaction, in the format 2019-06-24 11:16:33
currency|string|The currency of the transaction, eg. EUR
amount|float|The amount of the transaction, eg 23.56
description|string|The description of the transaction as given by the bank
iban|string|The IBAN number that made the transaction
name|string|The name of the bank account

## PurchaseOrder object

The PurchaseOrder object may contain the following fields. The `date` and `amount` fields are optional. If given, the purchase order will only be searched for on the document if those fields match the document date and document total amount, respectively.

Key | Value type  | Description |
--|--|--|
identifier|string|The identifier of the purchase order
purchase_order_number|string|The purchase order number which should be searched for on the document, e.g 'PO-12345'
date|string|The expected document date, in the format 2019-06-24 11:16:33
amount|float|The expected total amount on the document, eg 23.56


## Locale object
In case the language and/or originating country of the document are known, these may be set in the locale object. The locale object may contain the following fields. Both fields are optional.

Key | Value type  | Description |
--|--|--|
language|string|A 2-letter language code according to ISO 3166-1.
country|string|A 2-letter country code according to ISO 639.

## Keyword and lineitem matching
Keyword rules can be use to find strings in the text of the document using either a list of keywords or a regex.

Multiple rules may be given, each rule will provide a separate object in the output. All keywords and regexes are treated case-insensitive.

For example, by passing the following `keywords_rules` object, the regex will match all \"new product\" strings which are followed by a number. The matches are provided in the output in an object with \"id\" set to \"products\".
The \"coupon\" rule can be used to count the number of occurrences of a list of words:

```
{
\"keyword_rules\": [
{
\"id\": \"products\",
\"regex\": \"(new product [0-9]+)\"
},
{
\"id\": \"coupon\",
\"keywords\": [
\"coupon\"
]
}
]
}
```

If for example the keywords of \"products\" are matched 3 times in the text of the document, and the keywords of \"coupons\" 2 times, the output will be:
```
{
\"matched_keywords\": [
{
\"id\": \"products\",
\"count\": 3
\"matches\": [\"new product 6\", \"new product 1\", \"new product 14\"]
},
{
\"id\": \"coupons\",
\"count\": 2
\"matches\": [\"COUPON\", \"coupon\"]
}
]
}
```

### Lineitem matching
Similar to keyword rules, lineitems rules can be used to list products which contain a certain keyword.
```
{
\"lineitem_rules\": [
{
\"id\": \"fruit\",
\"regex\": \"apple|banana\"
},
{
\"id\": \"vegetables\",
\"keywords\": [
\"carrots\",
\"broccoli\"
]
}
]
}
```
For example, if some of the lineitems on the document contain a word that is in the \"vegetables\" keyword list, they
are of the present in the output under the \"vegetables\" key:
```
{
\"matched_lineitems\": [
{
\"id\": \"vegetables\",
\"lineitems\": [
{
\"title\": \"1kg carrots\",
\"amount\": 164,
\"amount_each\": 82,
\"quantity\": 2
},
{
\"title\": \"Set of 2 broccoli\",
\"amount\": 164,
\"amount_each\": 592,
\"quantity\": 4
}
]
}
]
}
```

## Userdata Example
```
{
\"client\": {
\"name\": \"\",
\"street_name\": \"\",
\"street_number\": \"\",
\"zipcode\": \"\",
\"city\": \"\",
\"country\": \"\",
\"vat_number\": \"\",
\"coc_number\": \"\",
\"phone\": \"\",
\"website\": \"\",
\"email\": \"\",
\"bank_account_number\": \"\"
},
\"transaction_type\": \"\",
\"relations\": [
{
\"name\": \"\",
\"street_name\": \"\",
\"street_number\": \"\",
\"zipcode\": \"\",
\"city\": \"\",
\"country\": \"\",
\"vat_number\": \"\",
\"coc_number\": \"\",
\"phone\": \"\",
\"website\": \"\",
\"email\": \"\",
\"bank_account_number\": \"\"
},
{
\"name\": \"\",
\"street_name\": \"\",
\"street_number\": \"\",
\"zipcode\": \"\",
\"city\": \"\",
\"country\": \"\",
\"vat_number\": \"\",
\"coc_number\": \"\",
\"phone\": \"\",
\"website\": \"\",
\"email\": \"\",
\"bank_account_number\": \"\"
}
],
\"locale\": {
\"language\": \"\",
\"country\": \"\"
}
}
```

  For more information, please visit [https://www.klippa.com](https://www.klippa.com)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>v0-15-43 - 217cfc26184c8a32170e3f3bc03726612d85b718</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:v0-15-43 - 217cfc26184c8a32170e3f3bc03726612d85b718"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-v0-15-43 - 217cfc26184c8a32170e3f3bc03726612d85b718.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://custom-ocr.klippa.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*InformationApi* | [**credits**](docs/InformationApi.md#credits) | **GET** /credits | List available credits.
*InformationApi* | [**getAPIIndex**](docs/InformationApi.md#getAPIIndex) | **GET** / | Information about the API.
*InformationApi* | [**getFields**](docs/InformationApi.md#getFields) | **GET** /fields | List of available fields.
*InformationApi* | [**getFieldsByTemplate**](docs/InformationApi.md#getFieldsByTemplate) | **GET** /fields/{Template} | List of available fields for a specific template.
*InformationApi* | [**getTemplates**](docs/InformationApi.md#getTemplates) | **GET** /templates | List of available templates.
*InformationApi* | [**listStatisticsInput**](docs/InformationApi.md#listStatisticsInput) | **GET** /statistics | Get API usage statistics.
*ParsingApi* | [**parseDocument**](docs/ParsingApi.md#parseDocument) | **POST** /parseDocument | Template Financial (default): Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.
*ParsingApi* | [**parseDocumentEUPassport**](docs/ParsingApi.md#parseDocumentEUPassport) | **POST** /parseDocument/eu-passport | Template EU Passport: Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.
*ParsingApi* | [**parseDocumentIdentityDocument**](docs/ParsingApi.md#parseDocumentIdentityDocument) | **POST** /parseDocument/identity_document | Template Identity Document: Parse GIF, PNG, JPG, HEIC/HEIF or PDF file.
*ParsingApi* | [**parseStructuredPDF**](docs/ParsingApi.md#parseStructuredPDF) | **POST** /parseStructuredPDF | Parse a structured PDF file.
*ParsingApi* | [**parseText**](docs/ParsingApi.md#parseText) | **POST** /parseText | Parse plain text.
*PublicKeyApi* | [**createPublicKey**](docs/PublicKeyApi.md#createPublicKey) | **POST** /publicKey | Create a public key.
*PublicKeyApi* | [**publicKeyInfo**](docs/PublicKeyApi.md#publicKeyInfo) | **GET** /publicKey | Get information about the public key.
*PublicKeyApi* | [**publicKeyInfoByID**](docs/PublicKeyApi.md#publicKeyInfoByID) | **GET** /publicKey/{PublicKeyID} | Get information about the public key by a public key ID.
*PublicKeyApi* | [**publicKeyStatistics**](docs/PublicKeyApi.md#publicKeyStatistics) | **GET** /publicKey/{PublicKeyID}/statistics | Get API usage statistics for the public key.
*SubKeyApi* | [**createSubKey**](docs/SubKeyApi.md#createSubKey) | **POST** /subKey | Create a sub key.
*SubKeyApi* | [**deleteSubKey**](docs/SubKeyApi.md#deleteSubKey) | **DELETE** /subKey/{SubKeyID} | Delete the sub key.
*SubKeyApi* | [**getSubKey**](docs/SubKeyApi.md#getSubKey) | **GET** /subKey/{SubKeyID} | Get the sub key.
*SubKeyApi* | [**subKeyList**](docs/SubKeyApi.md#subKeyList) | **GET** /subKey | Get a list of sub keys.
*SubKeyApi* | [**subKeyStatistics**](docs/SubKeyApi.md#subKeyStatistics) | **GET** /subKey/{SubKeyID}/statistics | Get API usage statistics for the sub key.
*SubKeyApi* | [**updateSubKey**](docs/SubKeyApi.md#updateSubKey) | **PATCH** /subKey/{SubKeyID} | Update the sub key.
*UserDataSetsApi* | [**bulkUserDataSetRecord**](docs/UserDataSetsApi.md#bulkUserDataSetRecord) | **POST** /userDataSet/{ID}/records/bulk | Bulk create/update/delete user data set record.
*UserDataSetsApi* | [**createUserDataSet**](docs/UserDataSetsApi.md#createUserDataSet) | **POST** /userDataSet | Create a new user data set.
*UserDataSetsApi* | [**createUserDataSetRecord**](docs/UserDataSetsApi.md#createUserDataSetRecord) | **POST** /userDataSet/{ID}/records | Create a new user data set record.
*UserDataSetsApi* | [**deleteUserDataSet**](docs/UserDataSetsApi.md#deleteUserDataSet) | **DELETE** /userDataSet/{ID} | Delete user data set.
*UserDataSetsApi* | [**deleteUserDataSetRecord**](docs/UserDataSetsApi.md#deleteUserDataSetRecord) | **DELETE** /userDataSet/{ID}/records/{RecordID} | Delete user data set record.
*UserDataSetsApi* | [**getUserDataSet**](docs/UserDataSetsApi.md#getUserDataSet) | **GET** /userDataSet/{ID} | Get user data set.
*UserDataSetsApi* | [**getUserDataSetRecord**](docs/UserDataSetsApi.md#getUserDataSetRecord) | **GET** /userDataSet/{ID}/records/{RecordID} | Get user data set record.
*UserDataSetsApi* | [**getUserDataSetRecords**](docs/UserDataSetsApi.md#getUserDataSetRecords) | **GET** /userDataSet/{ID}/records | List user data set records.
*UserDataSetsApi* | [**getUserDataSets**](docs/UserDataSetsApi.md#getUserDataSets) | **GET** /userDataSet | List user data sets.
*UserDataSetsApi* | [**updateUserDataSet**](docs/UserDataSetsApi.md#updateUserDataSet) | **PATCH** /userDataSet/{ID} | Update user data set.
*UserDataSetsApi* | [**updateUserDataSetRecord**](docs/UserDataSetsApi.md#updateUserDataSetRecord) | **PATCH** /userDataSet/{ID}/records/{RecordID} | Update user data set record.


## Documentation for Models

 - [APIIndex](docs/APIIndex.md)
 - [APIIndexBody](docs/APIIndexBody.md)
 - [Barcode](docs/Barcode.md)
 - [BulkUserDataSetRecordActionForm](docs/BulkUserDataSetRecordActionForm.md)
 - [BulkUserDataSetRecordBody](docs/BulkUserDataSetRecordBody.md)
 - [BulkUserDataSetRecordForm](docs/BulkUserDataSetRecordForm.md)
 - [BulkUserDataSetRecordResult](docs/BulkUserDataSetRecordResult.md)
 - [CreatePublicKey](docs/CreatePublicKey.md)
 - [CreatePublicKeyBody](docs/CreatePublicKeyBody.md)
 - [CreatePublicKeyForm](docs/CreatePublicKeyForm.md)
 - [CreateSubKeyBody](docs/CreateSubKeyBody.md)
 - [CreateUserDataSetForm](docs/CreateUserDataSetForm.md)
 - [CreateUserDataSetRecordForm](docs/CreateUserDataSetRecordForm.md)
 - [CreateUserDataSetRecordResponseBody](docs/CreateUserDataSetRecordResponseBody.md)
 - [CreateUserDataSetResponseBody](docs/CreateUserDataSetResponseBody.md)
 - [DeleteSubKeyBody](docs/DeleteSubKeyBody.md)
 - [DeleteUserDataSetBody](docs/DeleteUserDataSetBody.md)
 - [DeleteUserDataSetRecordBody](docs/DeleteUserDataSetRecordBody.md)
 - [DeletedObjectData](docs/DeletedObjectData.md)
 - [Error](docs/Error.md)
 - [EuropeanPassport](docs/EuropeanPassport.md)
 - [EuropeanPassportBody](docs/EuropeanPassportBody.md)
 - [FullIdentityDocument](docs/FullIdentityDocument.md)
 - [GetCredits](docs/GetCredits.md)
 - [GetCreditsBody](docs/GetCreditsBody.md)
 - [GetField](docs/GetField.md)
 - [GetFieldSubtype](docs/GetFieldSubtype.md)
 - [GetFields](docs/GetFields.md)
 - [GetFieldsBody](docs/GetFieldsBody.md)
 - [GetPublicKeyInfo](docs/GetPublicKeyInfo.md)
 - [GetPublicKeyInfoBody](docs/GetPublicKeyInfoBody.md)
 - [GetStatisticsBody](docs/GetStatisticsBody.md)
 - [GetSubKeyBody](docs/GetSubKeyBody.md)
 - [GetTemplates](docs/GetTemplates.md)
 - [GetTemplatesBody](docs/GetTemplatesBody.md)
 - [GetUserDataSetBody](docs/GetUserDataSetBody.md)
 - [GetUserDataSetRecordBody](docs/GetUserDataSetRecordBody.md)
 - [GetUserDataSetRecords](docs/GetUserDataSetRecords.md)
 - [GetUserDataSetRecordsBody](docs/GetUserDataSetRecordsBody.md)
 - [GetUserDataSets](docs/GetUserDataSets.md)
 - [GetUserDataSetsBody](docs/GetUserDataSetsBody.md)
 - [IdentityDocument](docs/IdentityDocument.md)
 - [IdentityDocumentBody](docs/IdentityDocumentBody.md)
 - [IdentityDocumentValue](docs/IdentityDocumentValue.md)
 - [Key](docs/Key.md)
 - [MatchedKeyword](docs/MatchedKeyword.md)
 - [MatchedLineItemItem](docs/MatchedLineItemItem.md)
 - [PublicKeyStatisticsBody](docs/PublicKeyStatisticsBody.md)
 - [Receipt](docs/Receipt.md)
 - [ReceiptBody](docs/ReceiptBody.md)
 - [ReceiptLineItem](docs/ReceiptLineItem.md)
 - [ReceiptLineItemItem](docs/ReceiptLineItemItem.md)
 - [ReceiptVAT](docs/ReceiptVAT.md)
 - [RespTemplate](docs/RespTemplate.md)
 - [StatRow](docs/StatRow.md)
 - [SubKeyForm](docs/SubKeyForm.md)
 - [SubKeyListBody](docs/SubKeyListBody.md)
 - [SubKeyStatisticsBody](docs/SubKeyStatisticsBody.md)
 - [SubKeys](docs/SubKeys.md)
 - [Template](docs/Template.md)
 - [TextUploadForm](docs/TextUploadForm.md)
 - [UpdateSubKeyBody](docs/UpdateSubKeyBody.md)
 - [UpdateUserDataSetBody](docs/UpdateUserDataSetBody.md)
 - [UpdateUserDataSetForm](docs/UpdateUserDataSetForm.md)
 - [UpdateUserDataSetRecordBody](docs/UpdateUserDataSetRecordBody.md)
 - [UpdateUserDataSetRecordForm](docs/UpdateUserDataSetRecordForm.md)
 - [UserDataSet](docs/UserDataSet.md)
 - [UserDataSetRecord](docs/UserDataSetRecord.md)
 - [UserDataSetRecordValueForm](docs/UserDataSetRecordValueForm.md)
 - [ValidationError](docs/ValidationError.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### APIKeyHeader

- **Type**: API key
- **API key parameter name**: X-Auth-Key
- **Location**: HTTP header

### APIKeyQueryParam

- **Type**: API key
- **API key parameter name**: X-Auth-Key
- **Location**: URL query string

### APIPublicKeyHeader

- **Type**: API key
- **API key parameter name**: X-Auth-Public-Key
- **Location**: HTTP header

### APIPublicKeyQueryParam

- **Type**: API key
- **API key parameter name**: X-Auth-Public-Key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

jeroen@klippa.com

