# ReferenceDataApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReferenceStoreEntries**](ReferenceDataApi.md#getReferenceStoreEntries) | **GET** /refData/v1/entries | List entries from the reference data store on the node called.
[**lookupReferenceData**](ReferenceDataApi.md#lookupReferenceData) | **POST** /refData/v1/lookup | Perform a reference data lookup using the supplied lookup request.
[**purgeReferenceData**](ReferenceDataApi.md#purgeReferenceData) | **DELETE** /refData/v1/purge/{purgeAge} | Explicitly delete all entries that are older than purgeAge.

<a name="getReferenceStoreEntries"></a>
# **getReferenceStoreEntries**
> List&lt;RefStoreEntry&gt; getReferenceStoreEntries(limit)

List entries from the reference data store on the node called.

This is primarily intended  for small scale debugging in non-production environments. If no limit is set a default limit is applied else the results will be limited to limit entries.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ReferenceDataApi apiInstance = new ReferenceDataApi();
Integer limit = 56; // Integer | 
try {
    List<RefStoreEntry> result = apiInstance.getReferenceStoreEntries(limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#getReferenceStoreEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]

### Return type

[**List&lt;RefStoreEntry&gt;**](RefStoreEntry.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="lookupReferenceData"></a>
# **lookupReferenceData**
> String lookupReferenceData(body)

Perform a reference data lookup using the supplied lookup request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ReferenceDataApi apiInstance = new ReferenceDataApi();
RefDataLookupRequest body = new RefDataLookupRequest(); // RefDataLookupRequest | 
try {
    String result = apiInstance.lookupReferenceData(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#lookupReferenceData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RefDataLookupRequest**](RefDataLookupRequest.md)|  |

### Return type

**String**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purgeReferenceData"></a>
# **purgeReferenceData**
> Boolean purgeReferenceData(purgeAge)

Explicitly delete all entries that are older than purgeAge.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ReferenceDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ReferenceDataApi apiInstance = new ReferenceDataApi();
String purgeAge = "purgeAge_example"; // String | 
try {
    Boolean result = apiInstance.purgeReferenceData(purgeAge);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReferenceDataApi#purgeReferenceData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **purgeAge** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

