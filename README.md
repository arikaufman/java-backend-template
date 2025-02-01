# Java Backend Template

## Setup

1. Install the Extension Pack for Java from VS Code.

2. Install JDK in the root directory as recommended:
    ```
    /Library/Java/JavaVirtualMachines/temurin-21.jdk
    ```

3. Verify the JVM path:
    ```sh
    java -version # should be openjdk version 21
    echo $JAVA_HOME # should show the micromamba env path to the JVM
    ```

## Local Deployment

1. Compile the Java project into a WAR file:
    ```sh
    ./mvnw clean package
    ```
    The compiled WAR file should be in the `target` directory.

2. Deploy with Docker:
    ```sh
    docker-compose up
    ```

3. Access the application at:
    ```
    http://127.0.0.1:8081/java-template/
    ```

## Structure

This repository follows the concept of domain-driven architecture. Below is an example of what a 'Users' stack might look like:

### Controller Layer
- **DTO**: Defines the Data Transfer Object, which is used for transferring data over the wire.
- **Controller**: Specifies all routes that can hit this stack.

### Domain Layer
- **DomainObject**: Defines the domain layer object, which is used for business logic manipulations.
- **Service**: Contains all domain-level functions. Dependencies from other stacks can be injected here.

### Data Access Layer
- **Entity**: Defines the class that will be mapped from the data accessor.
- **DataAccess**: Contains the SQL used for retrieval from a database.

This structure helps in maintaining a clean separation of concerns, making the codebase more modular and easier to manage.

## Core Dependancies
- **Lombok**: For automatic code generation such as getters, setters, constructors, etc.
- **MagicMapper**: For automatic mapping between DTOs, domain objects, and entities.
- **Spring Boot**: For creating stand-alone, production-grade Spring-based applications.
- **JUnit**: For unit testing the application.
- **Mockito**: For mocking objects in unit tests.
- **Docker**: For containerizing the application.
- **Maven**: For project management and build automation.

## Notes
- The environment setup is not hermetic; it uses a bare metal install for JDK and Java.
- Maven (`mvn`) is not installed globally; use `./mvnw` for Maven commands (from project root).
- The setup works best with the VS Code Extension Plugin.