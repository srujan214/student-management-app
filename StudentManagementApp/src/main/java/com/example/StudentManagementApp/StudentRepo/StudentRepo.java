

package com.example.StudentManagementApp.StudentRepo;

import com.example.StudentManagementApp.Student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}


