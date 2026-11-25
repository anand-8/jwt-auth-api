# JWT Authentication & Authorization API

A secure RESTful authentication and authorization backend application built using Java and Spring Boot. The application uses JSON Web Tokens (JWT) to authenticate users and Spring Security to manage role-based access control.

## Features

- User registration and login.
- Password encryption using BCrypt.
- JWT token generation and validation.
- Stateless authentication using Spring Security.
- Custom JWT authentication filter.
- Role-based authorization (`USER` and `ADMIN`).
- Protected REST API endpoints.
- User profile access through authentication.
- Centralized exception handling.

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Boot | Application framework |
| Spring Security | Authentication and authorization |
| JWT | Token-based authentication |
| BCrypt | Password hashing |
| Spring Data JPA | Database operations |
| Hibernate | ORM |
| MySQL | Relational database |
| Maven | Dependency management |
| Postman | API testing |
| Git & GitHub | Version control |

## Application Architecture

The application follows a layered architecture:

- **Controller Layer:** Handles authentication and user-related HTTP requests.
- **Service Layer:** Implements registration, login and business logic.
- **Repository Layer:** Manages database operations.
- **Security Layer:** Handles authentication, JWT validation and authorization.
- **Entity Layer:** Represents user data stored in the database.

## Authentication Workflow

1. A user registers with their details.
2. The password is hashed using BCrypt before storage.
3. The user submits login credentials.
4. Spring Security verifies the credentials.
5. The application generates a JWT token.
6. The client sends the token in subsequent requests.
7. A custom JWT filter validates the token and establishes the authenticated user.
8. Spring Security checks the user's role and grants or denies access.

## API Endpoints

### Authentication

| Method | Endpoint | Description |
|---|---|---|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Authenticate user and generate JWT |

### User

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/user/profile` | Access authenticated user's profile |



## Example Authentication Request

### Register

```json
{
  "fullName": "John Doe",
  "email": "john@example.com",
  "password": "StrongPassword123"
}
```

### Login

```json
{
  "email": "john@example.com",
  "password": "StrongPassword123"
}
```

### Authorization Header


```http
Authorization: Bearer YOUR_JWT_TOKEN
```

## Database Configuration

Create a MySQL database for the application.

Configure the following environment variables:

```properties
DB_URL=jdbc:mysql://localhost:3306/jwt_auth_db
DB_USERNAME=your_username
DB_PASSWORD=your_password
JWT_SECRET=your_base64_encoded_secret
```



## Running the Application

1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Create the MySQL database.
4. Configure the required environment variables.
5. Install Maven dependencies.
6. Run the Spring Boot application.
7. Test authentication endpoints using Postman.

## Security Concepts Implemented

- Password hashing with BCrypt.
- JWT-based authentication.
- Stateless session management.
- Custom authentication filter.
- Role-based access control.
- Protected API endpoints.

## Future Improvements

- Refresh token implementation.
- Token revocation and logout mechanism.
- Email verification.
- Password reset functionality.
- Unit and integration testing.
- Swagger/OpenAPI documentation.
- Docker deployment.

## Author

Anand

Java Backend Developer
