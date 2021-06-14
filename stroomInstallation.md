# Installing Stroom
These instructions describe how to obtain a version of stroom that is compatible with `stroom-spark-datasource` and
ensure that it contains suitable data.

1. Download the `stroom-full-test` stack for [Stroom v7](https://github.com/gchq/stroom/releases/latest)
1. Unpack the archive into a suitable directory, e.g. `~/stroom/stacks`
1. `cd` into the `stroom-full-test-v7.0-VERSION/` directory of the software distribution.
1. Open `config/stroom_full_test.env` in a text editor and insert the following line at the end of the file:
```export STROOM_SERVICE_DISCOVERY_ENABLED=false```
1. Enable the correct services by running
```./set_services.sh stroom-log-sender nginx stroom-all-dbs stroom```
1. Start the Stroom components by running `./start.sh`