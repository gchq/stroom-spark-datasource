# ContentApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmContentImport**](ContentApi.md#confirmContentImport) | **POST** /content/v1/confirmImport | Get import confirmation state
[**exportContent**](ContentApi.md#exportContent) | **POST** /content/v1/export | Export content
[**fetchContentDependencies**](ContentApi.md#fetchContentDependencies) | **POST** /content/v1/fetchDependencies | Fetch content dependencies
[**importContent**](ContentApi.md#importContent) | **POST** /content/v1/import | Import content

<a name="confirmContentImport"></a>
# **confirmContentImport**
> List&lt;ImportState&gt; confirmContentImport(body)

Get import confirmation state

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
ResourceKey body = new ResourceKey(); // ResourceKey | resourceKey
try {
    List<ImportState> result = apiInstance.confirmContentImport(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#confirmContentImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ResourceKey**](ResourceKey.md)| resourceKey |

### Return type

[**List&lt;ImportState&gt;**](ImportState.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="exportContent"></a>
# **exportContent**
> ResourceGeneration exportContent(body)

Export content

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
DocRefs body = new DocRefs(); // DocRefs | docRefs
try {
    ResourceGeneration result = apiInstance.exportContent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#exportContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRefs**](DocRefs.md)| docRefs |

### Return type

[**ResourceGeneration**](ResourceGeneration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchContentDependencies"></a>
# **fetchContentDependencies**
> ResultPageDependency fetchContentDependencies(body)

Fetch content dependencies

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
DependencyCriteria body = new DependencyCriteria(); // DependencyCriteria | criteria
try {
    ResultPageDependency result = apiInstance.fetchContentDependencies(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#fetchContentDependencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DependencyCriteria**](DependencyCriteria.md)| criteria |

### Return type

[**ResultPageDependency**](ResultPageDependency.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importContent"></a>
# **importContent**
> ResourceKey importContent(body)

Import content

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ContentApi apiInstance = new ContentApi();
ImportConfigRequest body = new ImportConfigRequest(); // ImportConfigRequest | request
try {
    ResourceKey result = apiInstance.importContent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#importContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImportConfigRequest**](ImportConfigRequest.md)| request |

### Return type

[**ResourceKey**](ResourceKey.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

