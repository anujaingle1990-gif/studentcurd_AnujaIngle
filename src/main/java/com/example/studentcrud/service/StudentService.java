package com.example.studentcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentcrud.entity.Student1;
import com.example.studentcrud.exception.StudentNotFoundException;
import com.example.studentcrud.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student1 saveStudent(Student1 student) {
        return repository.save(student);
    }

    public List<Student1> getAllStudents() {
        return repository.findAll();
    }

    public Student1 getStudentById(Long id) {
     
          return repository.findById(id)
            .orElseThrow(() ->
                    new StudentNotFoundException("Student not found with id : " + id));

    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
    public Student1 updateStudent(Long id, Student1 student) {

    Student1 existingStudent = repository.findById(id)
                                         .orElseThrow();

    existingStudent.setName(student.getName());
    existingStudent.setAge(student.getAge());

    return repository.save(existingStudent);
}
}
