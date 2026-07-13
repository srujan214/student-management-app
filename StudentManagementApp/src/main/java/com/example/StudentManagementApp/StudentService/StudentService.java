
package com.example.StudentManagementApp.StudentService;

import com.example.StudentManagementApp.StudentDTO.StudentDto;
import com.example.StudentManagementApp.StudentDTO.StudentSaveDTO;
import com.example.StudentManagementApp.StudentDTO.StudentUpdateDto;

import java.util.List;

public interface StudentService {
    String addStudent(StudentSaveDTO studentSaveDTO);
    List<StudentDto> getAllStudents();
    StudentDto getStudentById(Long id);
    String updateStudent(Long id, StudentUpdateDto studentUpdateDto);
    String deleteStudent(Long id);
}

