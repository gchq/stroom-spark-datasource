# Stroom API Java Client
This subproject contains a limited Java client for Stroom's RESTFul API.

## Background
Stroom used to provide a client library for this purpose.  However, this is no longer supported.
As an alternative, a client is automatically using swagger codegen / openapi codegen.

However, the generated model classes are not capable of supporting Stroom's API due limitations/bugs in handling
of polymorphic interfaces, for this reason the model is "borrowed" from Stroom's codebase
although it is recompiled here under a version of Java compatible with Spark.  
At the time of writing, this is needed because Stroom itself is compiled with Java 15
whereas Spark requires either Java 8 or Java 11.

This is not a good approach, but an expedient workaround that should be revisited when any of the following occur:
  * Spark runs on a version of Java that is compatible with Stroom itself,
  * Stroom provides a standalone client library for its API that runs on a version of Java compatible with Spark,
  * Swagger/OpenAPI codegen works with polymorphic APIs.
  
## Functionality
The client is limited to those Stroom services that are consumed by the Stroom Spark Datasource, namely:
* StroomIndex
* DataSource
* Searchable

The client provides only limited error handling.  This is an intrinsic limitation of clients generated via these
utilities that has been noted elsewhere.

## Building
The generated client is stored in git, so there is normally no need to regenerate unless the API changes or to
change the implementation in some way.
 
To do this, the script `generate_stroom_api_client.sh` should be run from the repo root.
 