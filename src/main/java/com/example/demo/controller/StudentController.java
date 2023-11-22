package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.model.PostStudent;
import com.example.demo.model.StudentDto;
import com.example.demo.repo.StudentRepository;

@RestController
@RequestMapping("/api")
public class StudentController {

	
	
	

	@Autowired
	private StudentRepository repository;
	
	@PostMapping("/post")
	public StudentDto postStudent(@RequestBody PostStudent postStudent) {
		
		Student student = Student.builder()
							.age(postStudent.getAge())
							.salary(postStudent.getSalary())
							.name(postStudent.getName())
							.build();
		
		return convertToDto(repository.save(student));
		
	}
	
	@GetMapping("	/{id}")
	public StudentDto getStudet(@PathVariable int id) {
		return convertToDto(repository.findById(id).orElseThrow(()-> new RuntimeException("Student is not in database")));
	}

	private StudentDto convertToDto(Student save) {
		return StudentDto.builder()
					.id(save.getId())
					.name(save.getName())
					.salary(save.getSalary())
					.age(save.getAge())
					.build();
	}
}
