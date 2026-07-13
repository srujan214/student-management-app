# Student Management App

# A simple Spring Boot REST API for managing student records, built using Java, Spring Boot, Spring Data JPA, and MySQL.
This project follows a standard layered architecture:
            Controller → Service → Repository → Database
            
#Features
  Add a new student
  Get all students
  Get a student by ID
  Update student details
  Delete a student

  
# Tech Stack
  Java
  Spring Boot
  Spring Data JPA (Hibernate)
  MySQL
  Maven

  
# Project Structure
   com.example.StudentManagementApp
├── Student           # Entity class
├── StudentDTO        # Data Transfer Objects (Save, Update, Response)
├── StudentRepo       # JPA Repository interface
├── StudentService    # Service interface + implementation
├── StudentController # REST controller (API endpoints)
└── StudentManagementAppApplication  # Main Spring Boot application

#  Setup Instructions

1. Clone the repository
Bash
     git clonehttps://github.com/srujan214/student-management-app.git
     cd StudentManagementApp
3. Create the MySQL database
Sql
    CREATE DATABASE student_management; 
4. Configure application.properties
Located at src/main/resources/application.properties:
Properties
     spring.datasource.url=jdbc:mysql://localhost:3306/student_management
     spring.datasource.username=root
     spring.datasource.password=your_mysql_password
     spring.jpa.hibernate.ddl-auto=update
     spring.jpa.show-sql=true
6. Run the application
Run StudentManagementAppApplication.java from your IDE, or via Maven:
  Bash
      ./mvnw spring-boot:run
The app will start on http://localhost:8080 (or the port configured in application.properties).

8. Test the API
Use Postman or any REST client to hit the endpoints listed above.
Future Improvements
[ ] Add input validation (@NotBlank, @Email)
[ ] Add global exception handling (@ControllerAdvice)
[ ] Add pagination and search/filter by department
[ ] Add authentication (Spring Security)
[ ] Write unit and integration tests

Author
Srujan (@srujan214)
Final year CSE student | Backend development enthusiast
