# ExplorerServiceCopyRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationFolderRef** | [**DocRef**](DocRef.md) |  |  [optional]
**docRefs** | [**List&lt;DocRef&gt;**](DocRef.md) |  |  [optional]
**permissionInheritance** | [**PermissionInheritanceEnum**](#PermissionInheritanceEnum) |  |  [optional]

<a name="PermissionInheritanceEnum"></a>
## Enum: PermissionInheritanceEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
SOURCE | &quot;SOURCE&quot;
DESTINATION | &quot;DESTINATION&quot;
COMBINED | &quot;COMBINED&quot;
