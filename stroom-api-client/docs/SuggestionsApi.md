# SuggestionsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchSuggestions**](SuggestionsApi.md#fetchSuggestions) | **POST** /suggest/v1 | Fetch some suggestions

<a name="fetchSuggestions"></a>
# **fetchSuggestions**
> List&lt;String&gt; fetchSuggestions(body)

Fetch some suggestions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SuggestionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

SuggestionsApi apiInstance = new SuggestionsApi();
FetchSuggestionsRequest body = new FetchSuggestionsRequest(); // FetchSuggestionsRequest | request
try {
    List<String> result = apiInstance.fetchSuggestions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SuggestionsApi#fetchSuggestions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FetchSuggestionsRequest**](FetchSuggestionsRequest.md)| request |

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

