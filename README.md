# Student Management App

A REST API built using **Java, Spring Boot, Spring Data JPA, and MySQL** for managing student records.

The project follows a standard layered architecture:

```
Controller → Service → Repository → Database
```

---

## Features

- Add a new student
- Get all students
- Get a student by ID
- Update student details
- Delete a student

---

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL
- Maven

---

## Project Structure

```
com.example.StudentManagementApp
├── Student
├── StudentDTO
├── StudentRepo
├── StudentService
├── StudentController
└── StudentManagementAppApplication
```

---

## Setup Instructions

### 1. Clone the repository

```bash
git clone https://github.com/srujan214/student-management-app.git
cd StudentManagementApp
```

### 2. Create the database

```sql
CREATE DATABASE student_management;
```

### 3. Configure `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_management
spring.datasource.username=root
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 4. Run the application

```bash
./mvnw spring-boot:run
```

Application URL:

```
http://localhost:8081
```

---

## API Endpoints

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/students` | Create a student |
| GET | `/students` | Get all students |
| GET | `/students/{id}` | Get student by ID |
| PUT | `/students/{id}` | Update student |
| DELETE | `/students/{id}` | Delete student |

---

## Example Request

### Create Student

```bash
curl -X POST http://localhost:8080/students \
-H "Content-Type: application/json" \
-d '{
  "name":"Srujan",
  "age":22,
  "department":"Computer Science"
}'
```

### Get All Students

```bash
curl http://localhost:8080/students
```

---

## Sample Response

```json
{
  "id": 1,
  "name": "Srujan",
  "age": 22,
  "department": "Computer Science"
}
```

---

## Screenshots

<img width="1920" height="1080" alt="image" src="https://github.com/user-attachments/assets/469401e5-5bf9-461c-8f01-e8e11ea7a75f" />


---

## Author

**Srujan A Naik**

Final Year BE Computer Science Student

GitHub: https://github.com/srujan214
