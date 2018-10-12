# Contacts

## Mysql credentials
Change properties in application.properties

```bash
spring.datasource.url = jdbc:mysql://localhost:3306/freedompop?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username = test
spring.datasource.password = test1234
```

## Run Application with maven
mvn spring-boot:run

## Registration
http://localhost:8080/registration

## Login

http://localhost:8080/login

## Endpoints

RestContactController
```bash
[GET] /contacts
[GET] /contacts/{id}
[POST] /contacts
[PUT] /contacts/{id}
[DELETE] /contacts/{id}
```