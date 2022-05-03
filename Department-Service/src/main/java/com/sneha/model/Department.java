package com.sneha.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="department")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@Id
	private int departmentId;
	
	
	private String departmentName;
	
	
	private int numberOfEmployee;
	
	
	private double averageSalary;
}