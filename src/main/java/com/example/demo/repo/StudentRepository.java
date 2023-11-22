package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;
import com.example.demo.model.StudentDto;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

	
}
