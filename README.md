# Domus Back-End Developer Challenge

## Overview
This project implements a REST API that retrieves information about directors who have directed more movies than a specified threshold. The API interacts with an H2 database and uses Flyway for database migrations.

## Project Structure
The project is structured as follows:

```
challenge-domus-api-java
├── src
│   ├── main
│   │   ├── java
│   │   │   └── domus
│   │   │       └── challenge
│   │   │               ├── ChallengeApplication.java
│   │   │               ├── controller
│   │   │               │   └── DirectorController.java
│   │   │               ├── service
│   │   │               │   ├── support
│   │   │               │   ├── IDirectorService.java
                            ├── DirectorServiceSupport.java
│   │   │               ├── repository
│   │   │               │   └── DirectorRepository.java
│   │   │               ├── model
│   │   │               │   └── DirectorDto.java
│   │   │               ├── entity
│   │   │               │   └── DirectorEntity.java
│   │   │               └── config
│   │   │                   ├── RepositoryConfig.java
│   │   │                   ├── ServiceConfig.java
│   │   │                   ├── WebConfig.java
│   │   │                   ├── DomusBaseConfig.java
│   │   │                   └── OpenApiConfig.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── db
│   │           └── migration
│   │               └── V1__Create_Domus_Table.sql
├── test
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── domus
│   │               └── DomusBackendChallengeApplicationTests.java
├── pom.xml
└── README.md
```

## Technologies Used
- **Java 21**: The programming language used for the application.
- **Spring Boot 3.4.1**: Framework for building the REST API.
- **H2 Database**: In-memory database for storing movie and director data.
- **Flyway**: Database migration tool for managing schema changes.
- **Lombok**: Library to reduce boilerplate code.
- **Swagger**: Tool for API documentation.

## API Endpoint
### Get Directors
- **Endpoint**: `/directors?threshold=X`
- **Method**: GET
- **Description**: Returns a JSON object containing the names of directors whose number of movies directed is strictly greater than the given threshold.
- **Query Parameter**:
  - `threshold`: An integer value representing the minimum number of movies directed.
- **Response**:
  - Returns a JSON object with a list of director names sorted alphabetically.

### Example Request
```
GET /directors?threshold=4
```

### Example Response
```json
{
  "directors": ["Martin Scorsese", "Woody Allen"]
}
```

## Error Handling
- Negative threshold values will return an empty list.
- Non-numeric threshold values will return an error message.

## Setup Instructions
1. Clone the repository.
2. Navigate to the project directory.
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```
5. Access the API at `http://localhost:8080/challenge/api/v1`.

## Testing
Unit tests are included in the `test/java/com/example/domus/DomusBackendChallengeApplicationTests.java` file to verify the functionality of the REST API and service layer.

## Documentation
API documentation is generated using Swagger and can be accessed at `http://localhost:8080/challenge/api/v1/swagger-ui.html` after running the application.

## Considerations
- Ensure that the H2 database is properly configured in `application.properties`.
- Flyway will automatically create the necessary database tables on application startup using the SQL script located in `src/main/resources/db/migration`.

## Conclusion
This project provides a Raul Pena solution for retrieving director information based on movie counts, utilizing modern technologies and best practices in software development.