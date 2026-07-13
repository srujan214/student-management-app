
package com.example.StudentManagementApp.StudentService.IMPL;

import com.example.StudentManagementApp.Student.Student;
import com.example.StudentManagementApp.StudentDTO.StudentDto;
import com.example.StudentManagementApp.StudentDTO.StudentSaveDTO;
import com.example.StudentManagementApp.StudentDTO.StudentUpdateDto;
import com.example.StudentManagementApp.StudentRepo.StudentRepo;
import com.example.StudentManagementApp.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(StudentSaveDTO studentSaveDTO) {
        Student student = new Student(
                studentSaveDTO.getName(),
                studentSaveDTO.getEmail(),
                studentSaveDTO.getDepartment()
        );
        studentRepo.save(student);
        return student.getName();
    }

    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepo.findAll().stream()
                .map(s -> new StudentDto(s.getId(), s.getName(), s.getEmail(), s.getDepartment()))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto getStudentById(Long id) {
        Student s = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        return new StudentDto(s.getId(), s.getName(), s.getEmail(), s.getDepartment());
    }

    @Override
    public String updateStudent(Long id, StudentUpdateDto dto) {
        Student s = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        s.setName(dto.getName());
        s.setEmail(dto.getEmail());
        s.setDepartment(dto.getDepartment());
        studentRepo.save(s);
        return s.getName();
    }

    @Override
    public String deleteStudent(Long id) {
        studentRepo.deleteById(id);
        return "Student deleted with id: " + id;
    }
}

