package com.sneha.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="employee")	//This is mongodb collection
@AllArgsConstructor		//Lombok annotations to generate constructors,getters/setters
@NoArgsConstructor
@Builder
@Data

public class Employee {

	@Id
	private String employeeId;
	private String name;
	private int age;
	private BigDecimal salary;
	private String department;
	private String address;
	private long phone;
	
}