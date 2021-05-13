# ExplorerServiceCreateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationFolderRef** | [**DocRef**](DocRef.md) |  |  [optional]
**docName** | **String** |  |  [optional]
**docType** | **String** |  |  [optional]
**permissionInheritance** | [**PermissionInheritanceEnum**](#PermissionInheritanceEnum) |  |  [optional]

<a name="PermissionInheritanceEnum"></a>
## Enum: PermissionInheritanceEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
SOURCE | &quot;SOURCE&quot;
DESTINATION | &quot;DESTINATION&quot;
COMBINED | &quot;COMBINED&quot;
