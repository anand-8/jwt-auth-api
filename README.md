# JWT Authentication & Authorization API

A secure REST API built using Java, Spring Boot, Spring Security, JWT, and MySQL.

## Features

- User Registration
- User Login
- BCrypt Password Encryption
- JWT Authentication
- JWT Validation
- Protected Endpoints
- Role-Based Access Control (USER / ADMIN)
- Spring Data JPA Integration
- MySQL Database

## Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT
- Spring Data JPA
- MySQL
- Maven
- Postman

## API Endpoints

### Authentication

POST /api/auth/register

POST /api/auth/login

### User

GET /api/user/profile

### Admin

GET /api/admin/dashboard