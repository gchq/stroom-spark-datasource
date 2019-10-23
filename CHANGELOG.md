# Change Log
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/) 
and this project adheres to [Semantic Versioning](http://semver.org/).

## Unreleased

### Added

### Changed

### Removed

## [v1.0-alpha.4_stroom-v6.x] - 2019-10-23

### Changed

Will never wait more than 60s between search intervals, to ensure result set kept alive



## [v1.0-alpha.3_stroom-v6.x] - 2019-10-23

### Added
Optional parameters for use with datasource:
* traceLevel: integer 0 (off/default) to 5 (max)
* maxResults: integer (default = 100000)
* pageSize: integer (default = 10000)
* numPartitions: integer (default = 3)

## [v1.0-alpha.2_stroom-v6.x] - 2019-10-21

* Initial alpha release, compatible with Stroom v6.x

## [v1.0-alpha.1] - 2019-10-14

* Initial alpha release

[Unreleased]: https://github.com/gchq/stroom-spark-datasource/compare/v1.0-alpha.3_stroom-v6.x...HEAD
[v1.0-alpha.3_stroom6.x]: https://github.com/gchq/stroom-spark-datasource/compare/v1.0-alpha.3_stroom-v6.x...v1.0-alpha.4_stroom-v6.x
[v1.0-alpha.3_stroom6.x]: https://github.com/gchq/stroom-spark-datasource/compare/v1.0-alpha.2_stroom-v6.x...v1.0-alpha.3_stroom-v6.x
[v1.0-alpha.2_stroom6.x]: https://github.com/gchq/stroom-spark-datasource/compare/v1.0-alpha.1...v1.0-alpha.2_stroom-v6.x
[v1.0-alpha.1]: https://github.com/gchq/stroom-spark-datasource/compare/v1.0-alpha.1...v1.0-alpha.1