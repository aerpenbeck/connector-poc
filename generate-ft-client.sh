#!/bin/bash

type openapi-generator-cli >/dev/null 2>&1

if [ $? != 0 ]; then
    echo "openapi-generator-cli is not installed, please have a look at https://openapi-generator.tech/docs/installation/"
    exit 1
fi

mkdir -p target/generated-sources

YAML=https://raw.githubusercontent.com/fulfillmenttools/fulfillmenttools-api-reference/master/api.swagger.yaml

echo "Generating Java client for '${YAML}'"

openapi-generator-cli generate \
  -g java \
  -i ${YAML} \
  -o target/generated-sources \
  --library resttemplate \
  --api-package com.example.connectorpoc.ft.api \
  --invoker-package com.example.connectorpoc.ft.invoker \
  --model-package com.example.connectorpoc.ft.model \
  --additional-properties=useBeanValidations=true,dateLibrary=java8,java8=true,sourceFolder=swagger \
  --global-property=apiDocs=false,apiTests=false,modelDocs=false,modelTests=false

