#!/bin/bash

## Script to fix slight problem in generated swagger client library

#Fixup Java classes to work around generator bug
sed 's/public class ExpressionOperator/public class ExpressionOperator extends ExpressionItem/' stroom-api-client/src/main/java/io/swagger/client/model/ExpressionOperator.java > /tmp/ExpressionOperator.java.$$

cp /tmp/ExpressionOperator.java.$$ stroom-api-client/src/main/java/io/swagger/client/model/ExpressionOperator.java
rm /tmp/ExpressionOperator.java.$$
