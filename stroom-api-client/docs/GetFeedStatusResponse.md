# GetFeedStatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**stroomStatusCode** | [**StroomStatusCodeEnum**](#StroomStatusCodeEnum) |  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
RECEIVE | &quot;Receive&quot;
REJECT | &quot;Reject&quot;
DROP | &quot;Drop&quot;

<a name="StroomStatusCodeEnum"></a>
## Enum: StroomStatusCodeEnum
Name | Value
---- | -----
_200_0_OK | &quot;200 - 0 - OK&quot;
_406_100_FEED_MUST_BE_SPECIFIED | &quot;406 - 100 - Feed must be specified&quot;
_406_101_FEED_IS_NOT_DEFINED | &quot;406 - 101 - Feed is not defined&quot;
_406_110_FEED_IS_NOT_SET_TO_RECEIVE_DATA | &quot;406 - 110 - Feed is not set to receive data&quot;
_406_120_UNEXPECTED_DATA_TYPE | &quot;406 - 120 - Unexpected data type&quot;
_406_200_UNKNOWN_COMPRESSION | &quot;406 - 200 - Unknown compression&quot;
_401_300_CLIENT_CERTIFICATE_REQUIRED | &quot;401 - 300 - Client Certificate Required&quot;
_403_310_CLIENT_CERTIFICATE_NOT_AUTHORISED | &quot;403 - 310 - Client Certificate not authorised&quot;
_500_400_COMPRESSED_STREAM_INVALID | &quot;500 - 400 - Compressed stream invalid&quot;
_500_999_UNKNOWN_ERROR | &quot;500 - 999 - Unknown error&quot;
