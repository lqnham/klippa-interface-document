

# Receipt

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | The total amount, in cents |  [optional]
**amountChange** | **Long** | The change amount, in cents |  [optional]
**amountexvat** | **Long** | The total amount without vat, in cents |  [optional]
**barcodes** | [**List&lt;Barcode&gt;**](Barcode.md) | Barcodes that are found on the document |  [optional]
**currency** | **String** | The three-letter currency code, as defined in ISO 4217, e.g. &#x60;EUR&#x60; |  [optional]
**customerAddress** | **String** | The address line of the customer, as written on the document |  [optional]
**customerBankAccountNumber** | **String** | The IBAN number of the customer. |  [optional]
**customerBankAccountNumberBic** | **String** | The BIC associated with the IBAN number of the customer |  [optional]
**customerCity** | **String** |  |  [optional]
**customerCocNumber** | **String** | The chamber of commerce number of the customer |  [optional]
**customerCountry** | **String** | The name of the country, as written on the document |  [optional]
**customerEmail** | **String** |  |  [optional]
**customerHouseNumber** | **String** | The house number of the customer. It will only be set if the customer address could be split into a street name and house number |  [optional]
**customerMunicipality** | **String** |  |  [optional]
**customerName** | **String** | The name of the customer |  [optional]
**customerNumber** | **String** | A number used by the merchant to identify the customer |  [optional]
**customerPhone** | **String** |  |  [optional]
**customerProvince** | **String** |  |  [optional]
**customerReference** | **String** | A reference to this document, given by the customer |  [optional]
**customerStreetName** | **String** | The street name of the customer. It will only be set if the customer address could be split into a street name and house number |  [optional]
**customerVatNumber** | **String** | The VAT number of the customer. It contains the two-letter country code, followed by a country-specific implementation of the VAT number. |  [optional]
**customerWebsite** | **String** |  |  [optional]
**customerZipcode** | **String** | The zipcode of the customer. Dutch postcodes are formatted as 1234 AB |  [optional]
**date** | **String** | The purchase datetime as ISO string, E.g. &#x60;2019-07-01T16:46:00&#x60; |  [optional]
**documentSubject** | **String** | The subject of the document |  [optional]
**documentType** | [**DocumentTypeEnum**](#DocumentTypeEnum) |  |  [optional]
**hash** | **String** | Unique hash of the receipt. |  [optional]
**hashDuplicate** | **Boolean** | Whether we have seen the hash before for the current key. |  [optional]
**invoiceNumber** | **String** | The number of the invoice |  [optional]
**invoiceType** | [**InvoiceTypeEnum**](#InvoiceTypeEnum) |  |  [optional]
**lines** | [**List&lt;ReceiptLineItem&gt;**](ReceiptLineItem.md) |  |  [optional]
**matchedKeywords** | [**List&lt;MatchedKeyword&gt;**](MatchedKeyword.md) | If keywords have been given in the userdata, matched_keywords will contain the id&#39;s of the keywords that matched, and their number of occurrences. |  [optional]
**matchedLineitems** | [**List&lt;MatchedLineItemItem&gt;**](MatchedLineItemItem.md) | If keywords have been given for lineitems in the userdata, matched_lineitems will contain the id&#39;s of the keywords that matched, and the lineitems on which the matches were made. |  [optional]
**matchedPurchaseOrderId** | **String** | The id of the purchase order from the user data |  [optional]
**merchantAddress** | **String** | The address line of the merchant, as written on the document |  [optional]
**merchantBankAccountNumber** | **String** | The IBAN bank account number of the merchant. |  [optional]
**merchantBankAccountNumberBic** | **String** | The BIC associated with the IBAN bank account number of the merchant |  [optional]
**merchantBankDomesticAccountNumber** | **String** | The domestic bank account number of the merchant |  [optional]
**merchantBankDomesticBankCode** | **String** | The domestic bank code of the bank account of the merchant |  [optional]
**merchantChainLiabilityBankAccountNumber** | **String** | The IBAN bank account number of the merchant used for Chain Liability G-Account (Wet Ketenaansprakelijkheid G-rekening) |  [optional]
**merchantCity** | **String** |  |  [optional]
**merchantCocNumber** | **String** | The chamber of commerce number of the merchant |  [optional]
**merchantCountry** | **String** | The name of the country, as written on the document |  [optional]
**merchantCountryCode** | **String** | The name of the country as two-letter country code |  [optional]
**merchantEmail** | **String** |  |  [optional]
**merchantHouseNumber** | **String** | The house number of the merchant. It will only be set if the merchant address could be split into a street name and house number |  [optional]
**merchantId** | **String** | The identifier of the merchant. It is only present if the merchant is found using a relation that was provided in the user_data object, or was provided in a user_data_set. |  [optional]
**merchantMainActivityCode** | **String** | The main activity code of the merchant |  [optional]
**merchantMunicipality** | **String** |  |  [optional]
**merchantName** | **String** | The name of the merchant |  [optional]
**merchantPhone** | **String** |  |  [optional]
**merchantProvince** | **String** |  |  [optional]
**merchantStreetName** | **String** | The street name of the merchant. It will only be set if the merchant address could be split into a street name and house number |  [optional]
**merchantVatNumber** | **String** | The VAT number of the merchant. It contains the two-letter country code, followed by a country-specific implementation of the VAT number. |  [optional]
**merchantWebsite** | **String** |  |  [optional]
**merchantZipcode** | **String** | The zipcode of the merchant. Dutch postcodes are formatted as 1234 AB |  [optional]
**orderNumber** | **String** | The order number |  [optional]
**packageNumber** | **String** | Package number, usually found on packaging slips |  [optional]
**paymentAuthCode** | **String** | The transaction authorization code |  [optional]
**paymentCardAccountNumber** | **String** | The account number of the card that was used to complete the payment |  [optional]
**paymentCardBank** | **String** |  |  [optional]
**paymentCardIssuer** | **String** | Name of the party that issued the credit- or debit card |  [optional]
**paymentCardNumber** | **String** |  |  [optional]
**paymentDueDate** | **String** | Date on which the payment is due as ISO string, E.g. &#x60;2019-07-01T00:00:00&#x60; |  [optional]
**paymentSlipCode** | **String** | The full code of the payment slip |  [optional]
**paymentSlipCustomerNumber** | **String** | The customer number of the payment slip |  [optional]
**paymentSlipReferenceNumber** | **String** | The reference number of the payment slip |  [optional]
**paymentmethod** | [**PaymentmethodEnum**](#PaymentmethodEnum) |  |  [optional]
**purchasedate** | **String** | The purchase date as &#x60;yyyy-mm-dd&#x60; string, e.g. &#x60;2019-07-01&#x60; |  [optional]
**purchasetime** | **String** | The purchase time as hh:mm:ss string, e.g. &#x60;16:46:00&#x60; |  [optional]
**rawText** | **String** | Original plain text of receipt. |  [optional]
**receiptNumber** | **String** | The receipt ticket number |  [optional]
**server** | **String** |  |  [optional]
**shopNumber** | **String** | A number that identifies the store in which the payment was processed. Usually found on EFT receipts. |  [optional]
**tableGroup** | **String** |  |  [optional]
**tableNumber** | **String** |  |  [optional]
**terminalNumber** | **String** | A number that identifies the terminal on which the payment was processed. Usually found on EFT receipts. |  [optional]
**transactionNumber** | **String** | The transaction number provided by the payment processor. Usually found on EFT receipts. |  [optional]
**transactionReference** | **String** | A transaction reference provided by the merchant |  [optional]
**vatContext** | **String** | enum ,purchase_none,vat_relayed In case no vat was found, the vat context field may indicate a reason why no vat was found |  [optional]
**vatamount** | **Long** | The total VAT amount, in cents |  [optional]
**vatitems** | [**List&lt;ReceiptVAT&gt;**](ReceiptVAT.md) |  |  [optional]



## Enum: DocumentTypeEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
INVOICE | &quot;invoice&quot;
RECEIPT | &quot;receipt&quot;
BANK_TRANSACTION | &quot;bank_transaction&quot;
BANK_OVERVIEW | &quot;bank_overview&quot;
PARKING | &quot;parking&quot;
PETROL | &quot;petrol&quot;
TICKET | &quot;ticket&quot;
BOARDING_PASS | &quot;boarding_pass&quot;
OTHER | &quot;other&quot;



## Enum: InvoiceTypeEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
INVOICE | &quot;invoice&quot;
CREDIT_INVOICE | &quot;credit_invoice&quot;



## Enum: PaymentmethodEnum

Name | Value
---- | -----
EMPTY | &quot;&quot;
CASH | &quot;cash&quot;
CREDITCARD | &quot;creditcard&quot;
PIN | &quot;pin&quot;
BANK | &quot;bank&quot;


## Implemented Interfaces

* Serializable


