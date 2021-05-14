#!/bin/bash

## Script to generate the swagger client library using the published Stroom API

# Download and run the code generator
mkdir -p lib
wget https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.25/swagger-codegen-cli-3.0.25.jar -O lib/swagger-codegen-cli.jar
java -jar lib/swagger-codegen-cli.jar generate -i 'https://raw.githubusercontent.com/gchq/stroom/7.0/stroom-app/src/main/resources/ui/noauth/swagger/stroom.json' -l java -o stroom-api-client
    #java -jar lib/swagger-codegen-cli.jar generate -i 'http://localhost/stroom/noauth/swagger/stroom.json' -l java -o stroom-api-client

# Hack the generated code
. ./fixup_stroom_api_client.sh
    
# Now build the client
cd stroom-api-client
. ./gradlew build

