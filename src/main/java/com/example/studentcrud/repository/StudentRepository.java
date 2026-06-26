 
package com.example.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentcrud.entity.Student1;

public interface StudentRepository extends JpaRepository<Student1, Long> {

}