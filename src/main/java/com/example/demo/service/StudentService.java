package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;

	public Student save(Student student) {
		
		return repository.save(student);
	}

	public Student findById(int id) {
		return repository.findById(id).orElseThrow(()-> new RuntimeException("user not found"));
	}
 
	
	
}
