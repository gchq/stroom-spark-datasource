# GlobalConfigApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConfigProperty**](GlobalConfigApi.md#createConfigProperty) | **POST** /config/v1 | Create a configuration property
[**fetchUiConfig**](GlobalConfigApi.md#fetchUiConfig) | **GET** /config/v1/noauth/fetchUiConfig | Fetch the UI configuration
[**getConfigPropertyByName**](GlobalConfigApi.md#getConfigPropertyByName) | **GET** /config/v1/properties/{propertyName} | Fetch a property by its name, e.g. &#x27;stroom.path.home&#x27;
[**getConfigYamlValueByNodeAndName**](GlobalConfigApi.md#getConfigYamlValueByNodeAndName) | **GET** /config/v1/clusterProperties/{propertyName}/yamlOverrideValue/{nodeName} | Get the property value from the YAML configuration in the specified node.
[**listConfigProperties**](GlobalConfigApi.md#listConfigProperties) | **POST** /config/v1/properties | List all properties matching the criteria on the current node.
[**listConfigPropertiesByNode**](GlobalConfigApi.md#listConfigPropertiesByNode) | **POST** /config/v1/nodeProperties/{nodeName} | List all properties matching the criteria on the requested node.
[**updateConfigProperty**](GlobalConfigApi.md#updateConfigProperty) | **PUT** /config/v1/clusterProperties/{propertyName} | Update a configuration property

<a name="createConfigProperty"></a>
# **createConfigProperty**
> ConfigProperty createConfigProperty(body)

Create a configuration property

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

GlobalConfigApi apiInstance = new GlobalConfigApi();
ConfigProperty body = new ConfigProperty(); // ConfigProperty | configProperty
try {
    ConfigProperty result = apiInstance.createConfigProperty(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigApi#createConfigProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigProperty**](ConfigProperty.md)| configProperty |

### Return type

[**ConfigProperty**](ConfigProperty.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchUiConfig"></a>
# **fetchUiConfig**
> UiConfig fetchUiConfig()

Fetch the UI configuration

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

GlobalConfigApi apiInstance = new GlobalConfigApi();
try {
    UiConfig result = apiInstance.fetchUiConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigApi#fetchUiConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UiConfig**](UiConfig.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConfigPropertyByName"></a>
# **getConfigPropertyByName**
> ConfigProperty getConfigPropertyByName(propertyName)

Fetch a property by its name, e.g. &#x27;stroom.path.home&#x27;

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

GlobalConfigApi apiInstance = new GlobalConfigApi();
String propertyName = "propertyName_example"; // String | 
try {
    ConfigProperty result = apiInstance.getConfigPropertyByName(propertyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigApi#getConfigPropertyByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyName** | **String**|  |

### Return type

[**ConfigProperty**](ConfigProperty.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConfigYamlValueByNodeAndName"></a>
# **getConfigYamlValueByNodeAndName**
> OverrideValueString getConfigYamlValueByNodeAndName(propertyName, nodeName)

Get the property value from the YAML configuration in the specified node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

GlobalConfigApi apiInstance = new GlobalConfigApi();
String propertyName = "propertyName_example"; // String | 
String nodeName = "nodeName_example"; // String | 
try {
    OverrideValueString result = apiInstance.getConfigYamlValueByNodeAndName(propertyName, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigApi#getConfigYamlValueByNodeAndName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **propertyName** | **String**|  |
 **nodeName** | **String**|  |

### Return type

[**OverrideValueString**](OverrideValueString.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listConfigProperties"></a>
# **listConfigProperties**
> ListConfigResponse listConfigProperties(body)

List all properties matching the criteria on the current node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

GlobalConfigApi apiInstance = new GlobalConfigApi();
GlobalConfigCriteria body = new GlobalConfigCriteria(); // GlobalConfigCriteria | criteria
try {
    ListConfigResponse result = apiInstance.listConfigProperties(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigApi#listConfigProperties");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GlobalConfigCriteria**](GlobalConfigCriteria.md)| criteria |

### Return type

[**ListConfigResponse**](ListConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listConfigPropertiesByNode"></a>
# **listConfigPropertiesByNode**
> ListConfigResponse listConfigPropertiesByNode(body, nodeName)

List all properties matching the criteria on the requested node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

GlobalConfigApi apiInstance = new GlobalConfigApi();
GlobalConfigCriteria body = new GlobalConfigCriteria(); // GlobalConfigCriteria | criteria
String nodeName = "nodeName_example"; // String | 
try {
    ListConfigResponse result = apiInstance.listConfigPropertiesByNode(body, nodeName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigApi#listConfigPropertiesByNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GlobalConfigCriteria**](GlobalConfigCriteria.md)| criteria |
 **nodeName** | **String**|  |

### Return type

[**ListConfigResponse**](ListConfigResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConfigProperty"></a>
# **updateConfigProperty**
> ConfigProperty updateConfigProperty(body, propertyName)

Update a configuration property

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.GlobalConfigApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

GlobalConfigApi apiInstance = new GlobalConfigApi();
ConfigProperty body = new ConfigProperty(); // ConfigProperty | configProperty
String propertyName = "propertyName_example"; // String | 
try {
    ConfigProperty result = apiInstance.updateConfigProperty(body, propertyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GlobalConfigApi#updateConfigProperty");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigProperty**](ConfigProperty.md)| configProperty |
 **propertyName** | **String**|  |

### Return type

[**ConfigProperty**](ConfigProperty.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

