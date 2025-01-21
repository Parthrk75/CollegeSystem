# College Management System

This project is a Spring Boot-based REST API designed to manage admins, students, and teachers within an educational institution. It provides a centralized system for adding, retrieving, updating, and deleting records for each entity, with clear role segregation and enhanced scalability. The system ensures efficient management and data integrity across multiple user roles.

## Project Structure

### Controllers
1. **AdminController**: Handles operations related to admins, including CRUD operations and the management of students and teachers.
2. **StudentController**: Manages operations related to students, including retrieving and adding student records.

### Service Layer
Contains the business logic for admins, students, and teachers.

### Entity Layer
Defines the data models (`Admin`, `Student`, `Teacher`) that map to the database.

### Repository Layer
Handles data persistence and retrieval for the entities.

## Prerequisites

Before running this project, ensure you have the following installed:

1. **Java Development Kit (JDK)**: Version 11 or higher.
2. **Maven**: For building and managing dependencies.
3. **MySQL Database**: Or any other database configured in the application.
4. **Postman** (optional): For testing the API endpoints.

## Running the Project

1. Clone the repository.
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory and build the project.
   ```bash
   mvn clean install
   ```

3. Update the `application.properties` file with your database credentials.

4. Run the application.
   ```bash
   mvn spring-boot:run
   ```

## API Endpoints

### Admin Endpoints

#### Base URL
All endpoints are prefixed with `/admin`.

#### Get All Admins
- **URL**: `GET /admins`
- **Description**: Retrieves a list of all admins.
- **Response**: List of `Admin` objects.

#### Get Admin by ID
- **URL**: `GET /admins/{id}`
- **Description**: Retrieves a specific admin by their ID.
- **Parameters**:
  - `id` (PathVariable): The ID of the admin.
- **Response**: Single `Admin` object.

#### Create Admin
- **URL**: `POST /admins`
- **Description**: Adds a new admin.
- **Request Body**:
  - `Admin` object containing admin details.
- **Response**: The newly created `Admin` object.

#### Update Admin
- **URL**: `PUT /admins/{id}`
- **Description**: Updates an existing admin.
- **Parameters**:
  - `id` (PathVariable): The ID of the admin to update.
- **Request Body**:
  - `Admin` object containing updated details.
- **Response**: The updated `Admin` object.

#### Delete Admin
- **URL**: `DELETE /admins/{id}`
- **Description**: Deletes an admin by their ID.
- **Parameters**:
  - `id` (PathVariable): The ID of the admin to delete.
- **Response**: No content.

### Student Endpoints

#### Base URL
All endpoints are prefixed with `/student`.

#### Get Student by ID
- **URL**: `GET /{id}`
- **Description**: Retrieves a specific student by their ID.
- **Parameters**:
  - `id` (PathVariable): The ID of the student.
- **Response**: Single `Student` object.

#### Add New Student
- **URL**: `POST /addstudent`
- **Description**: Adds a new student.
- **Request Body**:
  - `Student` object containing student details.
- **Response**: The newly created `Student` object.

#### Update Student
- **URL**: `PUT /students/{id}`
- **Description**: Updates an existing student.
- **Parameters**:
  - `id` (PathVariable): The ID of the student to update.
- **Request Body**:
  - `Student` object containing updated details.
- **Response**: The updated `Student` object.

#### Delete Student
- **URL**: `DELETE /students/{id}`
- **Description**: Deletes a student by their ID.
- **Parameters**:
  - `id` (PathVariable): The ID of the student to delete.
- **Response**: No content.

### Teacher Endpoints

#### Base URL
All endpoints are prefixed with `/admin/teachers`.

#### Get All Teachers
- **URL**: `GET /`
- **Description**: Retrieves a list of all teachers.
- **Response**: List of `Teacher` objects.

#### Get Teacher by ID
- **URL**: `GET /{id}`
- **Description**: Retrieves a specific teacher by their ID.
- **Parameters**:
  - `id` (PathVariable): The ID of the teacher.
- **Response**: Single `Teacher` object.

#### Create Teacher
- **URL**: `POST /`
- **Description**: Adds a new teacher.
- **Request Body**:
  - `Teacher` object containing teacher details.
- **Response**: The newly created `Teacher` object.

#### Update Teacher
- **URL**: `PUT /{id}`
- **Description**: Updates an existing teacher.
- **Parameters**:
  - `id` (PathVariable): The ID of the teacher to update.
- **Request Body**:
  - `Teacher` object containing updated details.
- **Response**: The updated `Teacher` object.

#### Delete Teacher
- **URL**: `DELETE /{id}`
- **Description**: Deletes a teacher by their ID.
- **Parameters**:
  - `id` (PathVariable): The ID of the teacher to delete.
- **Response**: No content.

## Example `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/schoolmanagementdb
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
server.port=8080
```

## Testing the API

1. Use Postman or any API testing tool to test the endpoints.
2. Ensure the database is running and properly configured.
3. Test each endpoint using the appropriate HTTP method and request body/parameters.

## Future Enhancements

1. Add user authentication and role-based access control.
2. Implement advanced search and filtering options for students and teachers.
3. Add validations for request payloads.
4. Enhance error handling and logging.
