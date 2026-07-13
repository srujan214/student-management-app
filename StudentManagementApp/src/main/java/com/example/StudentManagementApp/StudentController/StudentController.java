package com.example.StudentManagementApp.StudentController;

import com.example.StudentManagementApp.StudentDTO.StudentDto;
import com.example.StudentManagementApp.StudentDTO.StudentSaveDTO;
import com.example.StudentManagementApp.StudentDTO.StudentUpdateDto;
import com.example.StudentManagementApp.StudentService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("save")
    public String savestudent(@RequestBody StudentSaveDTO studentsaveDTO) {
        String stname = studentService.addStudent(studentsaveDTO);
        return stname;
    }

    @GetMapping("all")
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("{id}")
    public StudentDto getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("update/{id}")
    public String updateStudent(@PathVariable Long id, @RequestBody StudentUpdateDto dto) {
        return studentService.updateStudent(id, dto);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}

