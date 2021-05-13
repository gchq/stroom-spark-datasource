# AnnotationsApi

All URIs are relative to *https://raw.githubusercontent.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnnotationEntry**](AnnotationsApi.md#createAnnotationEntry) | **POST** /annotation/v1 | Gets an annotation
[**getAnnotationComments**](AnnotationsApi.md#getAnnotationComments) | **GET** /annotation/v1/comment | Gets a list of predefined comments
[**getAnnotationDStatus**](AnnotationsApi.md#getAnnotationDStatus) | **GET** /annotation/v1/status | Gets a list of allowed statuses
[**getAnnotationDetail**](AnnotationsApi.md#getAnnotationDetail) | **GET** /annotation/v1 | Gets an annotation
[**getAnnotationLinkedEvents**](AnnotationsApi.md#getAnnotationLinkedEvents) | **GET** /annotation/v1/linkedEvents | Gets a list of events linked to this annotation
[**linkAnnotationEvents**](AnnotationsApi.md#linkAnnotationEvents) | **POST** /annotation/v1/link | Links an annotation to an event
[**setAnnotationAssignedTo**](AnnotationsApi.md#setAnnotationAssignedTo) | **POST** /annotation/v1/setAssignedTo | Bulk action to set the assignment for several annotations
[**setAnnotationStatus**](AnnotationsApi.md#setAnnotationStatus) | **POST** /annotation/v1/setStatus | Bulk action to set the status for several annotations
[**unlinkAnnotationEvents**](AnnotationsApi.md#unlinkAnnotationEvents) | **POST** /annotation/v1/unlink | Unlinks an annotation from an event

<a name="createAnnotationEntry"></a>
# **createAnnotationEntry**
> AnnotationDetail createAnnotationEntry(body)

Gets an annotation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
CreateEntryRequest body = new CreateEntryRequest(); // CreateEntryRequest | request
try {
    AnnotationDetail result = apiInstance.createAnnotationEntry(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#createAnnotationEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateEntryRequest**](CreateEntryRequest.md)| request |

### Return type

[**AnnotationDetail**](AnnotationDetail.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAnnotationComments"></a>
# **getAnnotationComments**
> List&lt;String&gt; getAnnotationComments(filter)

Gets a list of predefined comments

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
String filter = "filter_example"; // String | 
try {
    List<String> result = apiInstance.getAnnotationComments(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#getAnnotationComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnnotationDStatus"></a>
# **getAnnotationDStatus**
> List&lt;String&gt; getAnnotationDStatus(filter)

Gets a list of allowed statuses

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
String filter = "filter_example"; // String | 
try {
    List<String> result = apiInstance.getAnnotationDStatus(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#getAnnotationDStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**|  | [optional]

### Return type

**List&lt;String&gt;**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnnotationDetail"></a>
# **getAnnotationDetail**
> AnnotationDetail getAnnotationDetail(annotationId)

Gets an annotation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
Long annotationId = 789L; // Long | 
try {
    AnnotationDetail result = apiInstance.getAnnotationDetail(annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#getAnnotationDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotationId** | **Long**|  | [optional]

### Return type

[**AnnotationDetail**](AnnotationDetail.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAnnotationLinkedEvents"></a>
# **getAnnotationLinkedEvents**
> List&lt;EventId&gt; getAnnotationLinkedEvents(annotationId)

Gets a list of events linked to this annotation

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
Long annotationId = 789L; // Long | 
try {
    List<EventId> result = apiInstance.getAnnotationLinkedEvents(annotationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#getAnnotationLinkedEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **annotationId** | **Long**|  | [optional]

### Return type

[**List&lt;EventId&gt;**](EventId.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="linkAnnotationEvents"></a>
# **linkAnnotationEvents**
> List&lt;EventId&gt; linkAnnotationEvents(body)

Links an annotation to an event

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
EventLink body = new EventLink(); // EventLink | eventLink
try {
    List<EventId> result = apiInstance.linkAnnotationEvents(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#linkAnnotationEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventLink**](EventLink.md)| eventLink |

### Return type

[**List&lt;EventId&gt;**](EventId.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setAnnotationAssignedTo"></a>
# **setAnnotationAssignedTo**
> Integer setAnnotationAssignedTo(body)

Bulk action to set the assignment for several annotations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
SetAssignedToRequest body = new SetAssignedToRequest(); // SetAssignedToRequest | request
try {
    Integer result = apiInstance.setAnnotationAssignedTo(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#setAnnotationAssignedTo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetAssignedToRequest**](SetAssignedToRequest.md)| request |

### Return type

**Integer**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="setAnnotationStatus"></a>
# **setAnnotationStatus**
> Integer setAnnotationStatus(body)

Bulk action to set the status for several annotations

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
SetStatusRequest body = new SetStatusRequest(); // SetStatusRequest | request
try {
    Integer result = apiInstance.setAnnotationStatus(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#setAnnotationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SetStatusRequest**](SetStatusRequest.md)| request |

### Return type

**Integer**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unlinkAnnotationEvents"></a>
# **unlinkAnnotationEvents**
> List&lt;EventId&gt; unlinkAnnotationEvents(body)

Unlinks an annotation from an event

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: ApiKeyAuth
ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
ApiKeyAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//ApiKeyAuth.setApiKeyPrefix("Token");

AnnotationsApi apiInstance = new AnnotationsApi();
EventLink body = new EventLink(); // EventLink | eventLink
try {
    List<EventId> result = apiInstance.unlinkAnnotationEvents(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#unlinkAnnotationEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EventLink**](EventLink.md)| eventLink |

### Return type

[**List&lt;EventId&gt;**](EventId.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

