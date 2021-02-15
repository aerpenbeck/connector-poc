# connector-poc
Commercetools Connector POC

## Introduction
This POC shows how to connect [Commercetools](https://docs.commercetools.com/api/) and [Fulfillmenttools](https://fulfillmenttools.github.io/fulfillmenttools-api-reference/).
It has no real practical value.

## Approach
- Orders are fetched using a scheduled Spring Task from the Commercetools API
- Each order is placed into a Spring Integration channel
- Each order is transformed from Commercetools POJO to Fulfillmenttools POJO
- Each order is posted to the Fulfillmenttools API

## Limitations of POC
- error handling is very limited
- mapping of CT to FT Order is error prone
- mapping to FT DeliveryPreferences is a best guess and incomplete 
- we do not refresh the API tokens
- fetching orders from the Commercetools API is done in a blocking fashion (should be improved to non-blocking/async)
- paging through all orders is not implemented yet (we only process the first page)
- we currently do not track which orders have already been processed (would require some persistence)
- after the order has been posted to the Fulfillmenttools API there should be some visible result/logging etc.
- generated Java client for Fulfillmenttools API was added to source tree and manually modified to make it compile
  (usually we would generate the source as part of the build process)
- Spring message channels are `DirectChannel` and should be changed into `PublishSubscribeChannel`

## Requirements
- OpenJDK 11
- Apache Maven 
- OpenAPI Generator [CLI](https://openapi-generator.tech/docs/installation/)
- Node/npm (for OpenAPI generator)

## How to build
```
mvn clean install
```

## How to run
Options to run the application once it has been built:
a) Edit your API client ID, secret, ... in `application.properties` and run
```
java -jar target/connector-poc-0.0.1-SNAPSHOT.jar
```

b) Edit your API client ID, secret, ... in `application-development.properties` and run
```
mvn spring-boot:run
```

c) Edit your API client ID, secret, ... in `application-local.properties` and run
```
mvn spring-boot:run -Plocal
```

## Configuration
All configuration is done in `application.properties` and `application-development.properties`
Make sure you do not commit real ids, secrets, keys in these files.
You can create a local file `application-local.properties` for development.

## Tests
Run tests like this
```
mvn test
```

## Links

### Commercetools
- [Getting Started](https://docs.commercetools.com/tutorials/getting-started)
- [API](https://docs.commercetools.com/api/)
- [Java SDK](https://docs.commercetools.com/sdk/jvm-sdk)
- [Postman Collections](https://github.com/commercetools/commercetools-postman-collection)  
- [Merchant Center](https://mc.europe-west1.gcp.commercetools.com/connector-poc/dashboard)
  
### Fulfillmenttools
- [API](https://fulfillmenttools.github.io/api-reference-ui/)  
- [Documentation](https://fulfillmenttools.github.io/fulfillmenttools-api-reference/)
  
### Sample Data
- [Sunrise Data](https://github.com/commercetools/commercetools-sunrise-data)

### Spring
- [Spring Initializr](https://start.spring.io/)

### Swagger / OpenAPI
- [OpenAPI Generator](https://openapi-generator.tech/docs/generators/java)
- [swagger-codegen-maven-plugin](https://github.com/swagger-api/swagger-codegen/blob/master/modules/swagger-codegen-maven-plugin/README.md)

## License
Connector POC shows how to connect Commercetools and Fulfillmenttools APIs.

Copyright (C) 2021 Arno Erpenbeck

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.