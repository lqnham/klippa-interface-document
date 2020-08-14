

# ReceiptLineItemItem

A single lineitem. The amounts are in cents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Long** | The total amount of this lineitem, in cents. |  [optional]
**amountEach** | **Long** | The amount per product of this lineitem, in cents. If quantity is 1, this amount is equal to the &#39;amount&#39; field. |  [optional]
**amountExVat** | **Long** | THe total amount of this lineitem in cents, excluding VAT. |  [optional]
**description** | **String** | An additional description of the lineitem |  [optional]
**quantity** | **Double** | The quantity of the products of the lineitem. |  [optional]
**sku** | **String** |  |  [optional]
**title** | **String** | The title of the lineitem |  [optional]
**vatAmount** | **Long** | The VAT amount, in cents |  [optional]
**vatCode** | **String** |  |  [optional]
**vatPercentage** | **Long** | The VAT percentage of this lineitem, in hundreds. For example, a percentage of \&quot;21%\&quot; is represented as 2100. |  [optional]


## Implemented Interfaces

* Serializable


