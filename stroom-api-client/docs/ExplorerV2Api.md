# ExplorerV2Api

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyExplorerItems**](ExplorerV2Api.md#copyExplorerItems) | **POST** /explorer/v2/copy | Copy explorer items
[**createExplorerItem**](ExplorerV2Api.md#createExplorerItem) | **POST** /explorer/v2/create | Create explorer item
[**deleteExplorerItems**](ExplorerV2Api.md#deleteExplorerItems) | **DELETE** /explorer/v2/delete | Delete explorer items
[**fetchExplorerDocRefs**](ExplorerV2Api.md#fetchExplorerDocRefs) | **POST** /explorer/v2/fetchDocRefs | Fetch document references
[**fetchExplorerDocumentTypes**](ExplorerV2Api.md#fetchExplorerDocumentTypes) | **GET** /explorer/v2/fetchDocumentTypes | Fetch document types
[**fetchExplorerItemInfo**](ExplorerV2Api.md#fetchExplorerItemInfo) | **POST** /explorer/v2/info | Get document info
[**fetchExplorerNodes**](ExplorerV2Api.md#fetchExplorerNodes) | **POST** /explorer/v2/fetchExplorerNodes | Fetch explorer nodes
[**fetchExplorerPermissions**](ExplorerV2Api.md#fetchExplorerPermissions) | **POST** /explorer/v2/fetchExplorerPermissions | Fetch permissions for explorer items
[**moveExplorerItems**](ExplorerV2Api.md#moveExplorerItems) | **PUT** /explorer/v2/move | Move explorer items
[**renameExplorerItems**](ExplorerV2Api.md#renameExplorerItems) | **PUT** /explorer/v2/rename | Rename explorer items

<a name="copyExplorerItems"></a>
# **copyExplorerItems**
> BulkActionResult copyExplorerItems(body)

Copy explorer items

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
ExplorerServiceCopyRequest body = new ExplorerServiceCopyRequest(); // ExplorerServiceCopyRequest | request
try {
    BulkActionResult result = apiInstance.copyExplorerItems(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#copyExplorerItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExplorerServiceCopyRequest**](ExplorerServiceCopyRequest.md)| request |

### Return type

[**BulkActionResult**](BulkActionResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createExplorerItem"></a>
# **createExplorerItem**
> DocRef createExplorerItem(body)

Create explorer item

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
ExplorerServiceCreateRequest body = new ExplorerServiceCreateRequest(); // ExplorerServiceCreateRequest | request
try {
    DocRef result = apiInstance.createExplorerItem(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#createExplorerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExplorerServiceCreateRequest**](ExplorerServiceCreateRequest.md)| request |

### Return type

[**DocRef**](DocRef.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteExplorerItems"></a>
# **deleteExplorerItems**
> BulkActionResult deleteExplorerItems(body)

Delete explorer items

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
ExplorerServiceDeleteRequest body = new ExplorerServiceDeleteRequest(); // ExplorerServiceDeleteRequest | request
try {
    BulkActionResult result = apiInstance.deleteExplorerItems(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#deleteExplorerItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExplorerServiceDeleteRequest**](ExplorerServiceDeleteRequest.md)| request |

### Return type

[**BulkActionResult**](BulkActionResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchExplorerDocRefs"></a>
# **fetchExplorerDocRefs**
> List&lt;DocRef&gt; fetchExplorerDocRefs(body)

Fetch document references

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
List<DocRef> body = Arrays.asList(new DocRef()); // List<DocRef> | docRefs
try {
    List<DocRef> result = apiInstance.fetchExplorerDocRefs(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#fetchExplorerDocRefs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;DocRef&gt;**](DocRef.md)| docRefs |

### Return type

[**List&lt;DocRef&gt;**](DocRef.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchExplorerDocumentTypes"></a>
# **fetchExplorerDocumentTypes**
> DocumentTypes fetchExplorerDocumentTypes()

Fetch document types

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
try {
    DocumentTypes result = apiInstance.fetchExplorerDocumentTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#fetchExplorerDocumentTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DocumentTypes**](DocumentTypes.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchExplorerItemInfo"></a>
# **fetchExplorerItemInfo**
> DocRefInfo fetchExplorerItemInfo(body)

Get document info

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
DocRef body = new DocRef(); // DocRef | docRef
try {
    DocRefInfo result = apiInstance.fetchExplorerItemInfo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#fetchExplorerItemInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DocRef**](DocRef.md)| docRef |

### Return type

[**DocRefInfo**](DocRefInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchExplorerNodes"></a>
# **fetchExplorerNodes**
> FetchExplorerNodeResult fetchExplorerNodes(body)

Fetch explorer nodes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
FindExplorerNodeCriteria body = new FindExplorerNodeCriteria(); // FindExplorerNodeCriteria | request
try {
    FetchExplorerNodeResult result = apiInstance.fetchExplorerNodes(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#fetchExplorerNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FindExplorerNodeCriteria**](FindExplorerNodeCriteria.md)| request |

### Return type

[**FetchExplorerNodeResult**](FetchExplorerNodeResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchExplorerPermissions"></a>
# **fetchExplorerPermissions**
> List&lt;ExplorerNodePermissions&gt; fetchExplorerPermissions(body)

Fetch permissions for explorer items

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
List<ExplorerNode> body = Arrays.asList(new ExplorerNode()); // List<ExplorerNode> | explorerNodes
try {
    List<ExplorerNodePermissions> result = apiInstance.fetchExplorerPermissions(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#fetchExplorerPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;ExplorerNode&gt;**](ExplorerNode.md)| explorerNodes |

### Return type

[**List&lt;ExplorerNodePermissions&gt;**](ExplorerNodePermissions.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveExplorerItems"></a>
# **moveExplorerItems**
> BulkActionResult moveExplorerItems(body)

Move explorer items

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
ExplorerServiceMoveRequest body = new ExplorerServiceMoveRequest(); // ExplorerServiceMoveRequest | request
try {
    BulkActionResult result = apiInstance.moveExplorerItems(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#moveExplorerItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExplorerServiceMoveRequest**](ExplorerServiceMoveRequest.md)| request |

### Return type

[**BulkActionResult**](BulkActionResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="renameExplorerItems"></a>
# **renameExplorerItems**
> DocRef renameExplorerItems(body)

Rename explorer items

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExplorerV2Api;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

ExplorerV2Api apiInstance = new ExplorerV2Api();
ExplorerServiceRenameRequest body = new ExplorerServiceRenameRequest(); // ExplorerServiceRenameRequest | request
try {
    DocRef result = apiInstance.renameExplorerItems(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExplorerV2Api#renameExplorerItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ExplorerServiceRenameRequest**](ExplorerServiceRenameRequest.md)| request |

### Return type

[**DocRef**](DocRef.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

