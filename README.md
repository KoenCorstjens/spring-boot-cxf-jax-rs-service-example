    # spring-boot-cxf-jax-ws-service-example
**Example for cxf web services with JAX-RS on spring boot** 

- First step add dependency cxf-spring-boot-starter-jaxrs see pom.xml
- Create endpoint eu.corstjens.example.spring.boot.cxf.webservice.endpoint.ExempleEndpointImpl
- Activate cxf component scan from property file see: application.yml
`     cxf:
      jaxrs:
        component-scan: true`
- Add dependency for JacksonJsonProvider see pom.xml
- Make a jackson provider to map to json JacksonJsonProvider see: SpringBootCxfJaxRsServiceExampleApplication

**Configure swagger**
- Add dependecies to the pom:
`        <dependency>
            <groupId>org.apache.cxf</groupId>
            <artifactId>cxf-rt-rs-service-description-swagger</artifactId>
            <version>3.1.10</version>
        </dependency>
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>swagger-ui</artifactId>
            <version>2.1.8-M1</version>
        </dependency>`
- Activate swagger scan package classes-scan-packages: org.apache.cxf.jaxrs.swagger

Result: 
Swagger url: http://localhost:8080/services/api-docs?http://localhost:8080/services/swagger.json

