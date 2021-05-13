# SearchRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateTimeLocale** | **String** | The locale to use when formatting date values in the search results. The value is the string form of a java.time.ZoneId | 
**incremental** | **Boolean** | If true the response will contain all results found so far, typically no results on the first request. Future requests for the same query key may return more results. Intended for use on longer running searches to allow partial result sets to be returned as soon as they are available rather than waiting for the full result set. | 
**key** | [**QueryKey**](QueryKey.md) |  | 
**query** | [**Query**](Query.md) |  | 
**resultRequests** | [**List&lt;ResultRequest&gt;**](ResultRequest.md) |  | 
**timeout** | **Long** | Set the maximum time (in ms) for the server to wait for a complete result set. The timeout applies to both incremental and non incremental queries, though the behaviour is slightly different. The timeout will make the server wait for which ever comes first out of the query completing or the timeout period being reached. If no value is supplied then for an incremental query a default value of 0 will be used (i.e. returning immediately) and for a non-incremental query the server&#x27;s default timeout period will be used. For an incremental query, if the query has not completed by the end of the timeout period, it will return the currently know results with complete&#x3D;false, however for a non-incremental query it will return no results, complete&#x3D;false and details of the timeout in the error field |  [optional]
