# API Students

API con Spring Boot para consultar los  estudiantes y alas familas que pertenecen

## Información

Se uso [Swagger](https://pip.pypa.io/en/stable/) para documentar el API.

Se uso la siguiente configuracion en `application.properties`:
```properties
server.port=7070
server.servlet.context-path= /college/api
spring.data.mongodb.host= localhost
spring.data.mongodb.port= 27017
spring.data.mongodb.database= college
```
 
```bash
URL Swagger=  http://localhost:7070/college/api/swagger-ui/index.html
```

## Estructura

```bash
│   build.gradle
│   gradlew
│   README.md
│   settings.gradle
│
├───mongoDatabase
│       students.json
│
└───src
    └───main
       ├───java
       │   └───com
       │       └───example
       │           └───college
       │               │   CollegeApplication.java
       │               │
       │               ├───config
       │               │       SwaggerConfig.java
       │               │
       │               ├───controller
       │               │       StudentController.java
       │               │
       │               ├───document
       │               │       Student.java
       │               │
       │               ├───repository
       │               │       StudentsRepository.java
       │               │
       │               └───service
       │                   │   Inter_StudentsService.java
       │                   │
       │                   └───implementation
       │                           ImplStudentsService.java
       │
       └───resources
           │   application.properties
           │
           ├───static
           └───templates

```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
For more info on how to choose a license for an open source project, please
refer to http://choosealicense.com