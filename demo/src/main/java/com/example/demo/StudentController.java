package com.demo.controller;

import com.demo.model.Student;
import com.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return service.getAllStudent();
    }

    @GetMapping("/{id")
    public Student getStudentById(id);
}

    @PostMapping
    public Student createStudent(@Requestbody) Student student {
    return service.createStudent(student);
    }

    @PutMapping("/{id")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
    return service.updateStudent(id, studentDetails);
    }

    @DeleteMapping("/{id")
    public void deleteStudent(@PathVariable Long id) {
    service.deleteStudent(id);
    }