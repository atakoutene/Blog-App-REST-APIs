# Kennesaw State University CCSE Tutoring Center Blog Application Backend

A RESTful API for creating, reading, and managing blog posts specifically designed for the CCSE Tutoring Center at Kennesaw State University, where I work as a tutor. Developed using Spring Boot, this REST API provides fast and secure access to all the functionalities needed to manage the tutoring center's blog.

## Overview

The Blog Application Backend allows users to create, read, update, and delete posts. Each post can be tagged with a category or topic. The application supports user signup and login with password hashing for security. Additional features include pagination and sorting of posts, data validation, role-based authentication, and more. The blog is intended to post announcements concerning the tutoring center and also to post solutions and explanations to the most popular student concerns about data structures, programming concepts, and algorithm analysis.

## Built With

- **Spring Boot** - Framework for building production-ready applications
- **Maven** - Dependency management and build automation
- **JPA** - Java Persistence API for data access
- **Hibernate** - ORM for data persistence
- **MySQL** - Relational database management

## Features

- **Posts CRUD**: Create, read, update, and delete blog posts.
- **Users CRUD**: User management including signup, login, and profile updates.
- **Category CRUD**: Manage categories or topics for posts.
- **Comments CRUD**: Add, read, update, and delete comments on posts.
- **Pagination & Sorting**: Efficiently paginate and sort posts.
- **Role-based Authentication**: Secure endpoints with role-specific access.
- **Custom Exception Handling**: Graceful error handling with custom exceptions.
- **JWT Authentication**: Secure API endpoints with JSON Web Tokens.
- **DTO Pattern**: Use Data Transfer Objects for better API design.
- **Image Upload**: Upload images to associate with posts.
- **Post Searching**: Search for posts by keywords.
- **Data Validation**: Validate data using Hibernate Validator.
- **API Documentation**: Comprehensive documentation with Swagger.

## Getting Started

To get a local copy of the project up and running, follow these steps.

### Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher
- MySQL

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/atakoutene/Blog-App-REST-APIs.git
    ```
2. Navigate to the project directory:
    ```sh
    cd https://github.com/atakoutene/Blog-App-REST-APIs/edit
    ```
3. Update the MySQL configuration in `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/blogging_app_apis
    spring.datasource.username=root
    spring.datasource.password=superadmin123
    ```
4. Build the project:
    ```sh
    mvn clean install
    ```
5. Run the application:
    ```sh
    mvn spring-boot:run
    ```

## Usage

The API documentation is available at `/swagger-ui.html` once the application is running. You can use tools like Postman to test the endpoints.

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information.

## Contact

Aurelien Takou - https://www.linkedin.com/in/aurelien-takou

Project Link: https://github.com/atakoutene/Blog-App-REST-APIs

