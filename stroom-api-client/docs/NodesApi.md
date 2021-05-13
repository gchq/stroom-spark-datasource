# NodesApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchNodeInfo**](NodesApi.md#fetchNodeInfo) | **GET** /node/v1/info/{nodeName} | Gets detailed information about a node
[**findNodes**](NodesApi.md#findNodes) | **GET** /node/v1 | Lists nodes
[**listAllNodes**](NodesApi.md#listAllNodes) | **GET** /node/v1/all | Lists all nodes
[**listEnabledNodes**](NodesApi.md#listEnabledNodes) | **GET** /node/v1/enabled | Lists enabled nodes
[**pingNode**](NodesApi.md#pingNode) | **GET** /node/v1/ping/{nodeName} | Gets a ping time for a node
[**setNodeEnabled**](NodesApi.md#setNodeEnabled) | **PUT** /node/v1/enabled/{nodeName} | Sets whether a node is enabled
[**setNodePriority**](NodesApi.md#setNodePriority) | **PUT** /node/v1/priority/{nodeName} | Sets the priority of a node

<a name="fetchNodeInfo"></a>
# **fetchNodeInfo**
> ClusterNodeInfo fetchNodeInfo(nodeName)

Gets detailed information about a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodesApi apiInstance = new NodesApi();
String nodeName = "nodeName_example"; // String | 
try {
    ClusterNodeInfo result = apiInstance.fetchNodeInfo(nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#fetchNodeInfo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeName** | **String**|  |

### Return type

[**ClusterNodeInfo**](ClusterNodeInfo.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findNodes"></a>
# **findNodes**
> FetchNodeStatusResponse findNodes()

Lists nodes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodesApi apiInstance = new NodesApi();
try {
    FetchNodeStatusResponse result = apiInstance.findNodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#findNodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FetchNodeStatusResponse**](FetchNodeStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAllNodes"></a>
# **listAllNodes**
> List&lt;String&gt; listAllNodes()

Lists all nodes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodesApi apiInstance = new NodesApi();
try {
    List<String> result = apiInstance.listAllNodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#listAllNodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listEnabledNodes"></a>
# **listEnabledNodes**
> List&lt;String&gt; listEnabledNodes()

Lists enabled nodes

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodesApi apiInstance = new NodesApi();
try {
    List<String> result = apiInstance.listEnabledNodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#listEnabledNodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="pingNode"></a>
# **pingNode**
> Long pingNode(nodeName)

Gets a ping time for a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodesApi apiInstance = new NodesApi();
String nodeName = "nodeName_example"; // String | 
try {
    Long result = apiInstance.pingNode(nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#pingNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeName** | **String**|  |

### Return type

**Long**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setNodeEnabled"></a>
# **setNodeEnabled**
> Boolean setNodeEnabled(body, nodeName)

Sets whether a node is enabled

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodesApi apiInstance = new NodesApi();
Boolean body = true; // Boolean | enabled
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.setNodeEnabled(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#setNodeEnabled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Boolean**](Boolean.md)| enabled |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setNodePriority"></a>
# **setNodePriority**
> Boolean setNodePriority(body, nodeName)

Sets the priority of a node

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

NodesApi apiInstance = new NodesApi();
Integer body = 56; // Integer | nodeName
String nodeName = "nodeName_example"; // String | 
try {
    Boolean result = apiInstance.setNodePriority(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NodesApi#setNodePriority");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Integer**](Integer.md)| nodeName |
 **nodeName** | **String**|  |

### Return type

**Boolean**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

