package com.example.demo.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data


public class StudentDto {

	private int id;
	
	private String name;
	
	private int age;
	
	private double salary;
	
	
}
