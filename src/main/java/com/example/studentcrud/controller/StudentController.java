package com.example.studentcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.studentcrud.entity.Student1;
import com.example.studentcrud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public Student1 saveStudent(@RequestBody Student1 student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<Student1> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student1 getStudentById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }
    @PutMapping("/{id}")
public Student1 updateStudent(@PathVariable Long id,
                              @RequestBody Student1 student)
{
    return service.updateStudent(id, student);
}
}
