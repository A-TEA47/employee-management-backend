## Employee Management System - Backend
This is the backend service for the Employee Management System, built with Spring Boot. It provides RESTful APIs for managing employee records, including adding, updating, viewing, and deleting employees.

![image](https://github.com/user-attachments/assets/76bcd138-d867-40b2-adea-d9677a59f3fc)

## Features
RESTful APIs for CRUD operations
Database integration using Spring Data JPA
In-memory database (H2) for development
Configurable to work with other databases (e.g., MySQL, PostgreSQL)
Error handling for API requests

## Technologies Used
Java 23
Spring Boot
Spring Data JPA
MySQL Database
Maven (for build and dependency management)

## Installation and Setup
# Clone the Repository
Copy code
git clone https://github.com/A-TEA47/final-stack-full-project.git
cd final-stack-full-project/backend
# Run the Application
Using Maven:
Copy code
./mvnw spring-boot:run
Using an IDE:
Open the project in your favorite IDE (e.g., IntelliJ IDEA or Eclipse).
Run the EmployeeManagementApplication class.
The backend will run at http://localhost:8080.

## API Endpoints
# Base URL
http://localhost:8080

# Endpoints
HTTP Method	Endpoint	Description
GET	/employees	Fetch all employees
GET	/employees/{id}	Fetch employee by ID
POST	/employees	Add a new employee
PUT	/employees/{id}	Update employee by ID
DELETE	/employees/{id}	Delete employee by ID

## Configuration
# Database Configuration
The application uses MySQL database.

MySQL
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=Quebecat47@
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

# Error Handling
The backend includes error handling for common issues like:
Invalid input
Resource not found (404)
Server errors (500)

## Testing the APIs
# Using Postman
Import the following endpoints into Postman:
GET /employees
POST /employees
PUT /employees/{id}
DELETE /employees/{id}
Test the API with sample payloads:
{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com"
}

![image](https://github.com/user-attachments/assets/350d4fa4-96cc-482b-93a6-f8fa1aa2c4f7)


## Folder Structure

backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.ems/
│   │   │   │   ├── controller/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   └── service/
│   │   ├── resources/
│   │   │   ├── application.properties
│   ├── test/
│   ├── pom.xml
└── README.md

## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## Contact
For any questions or feedback:
GitHub: A-TEA47

##Thank you!
