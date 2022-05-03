package com.sneha.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sneha.model.Employee;
import com.sneha.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor	//To inject mongo repository to this class
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@GetMapping("/getAllEmployees")
	
	public List<Employee> getAll(){
		return employeeRepository.findAll();                              //List down all the employees
	}
	
	
	@GetMapping("/getEmployee/{employeeId}")
	public Optional<Employee> getEmployee(@PathVariable String employeeId){
		return employeeRepository.findById(employeeId);                    //optional class may contain null or not null values
	}
	
	
	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmployee(@PathVariable String employeeId) {
		employeeRepository.deleteById(employeeId);
	}
	
	
	
/*	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<?> updateEmployee(@PathVariable String id, @RequestBody Employee employeeDetails){
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employeeOptional.isPresent()) {
			//Employee employeeToSave = employeeOptional.get();
			employee.setName(employeeDetails.getName());
			employee.setAge(employee.getAge());
			employee.setSalary(employee.getSalary());
			employee.setDepartment(employee.getDepartment());
			employee.setAddress(employee.getAddress());
			employee.setPhone(employee.getPhone());
		}		
	}
	
	*/
	
	@PutMapping("/update/{employeeId}")
	
	public Employee updateEmployee(@PathVariable String employeeId, @RequestBody Employee employee) {
		Optional<Employee> empOptional = employeeRepository.findById(employeeId);
		Employee emp = empOptional.get();
		emp.setName(employee.getName());
		emp.setAge(employee.getAge());
		emp.setAddress(employee.getAddress());
		emp.setSalary(employee.getSalary());
		emp.setDepartment(employee.getDepartment());
		emp.setPhone(employee.getPhone());
		
		return employeeRepository.save(emp);
	}
	
	
	@PostMapping("/add")
	
	public void addEmployee(@RequestBody Employee employee){
	//Create employee
		employeeRepository.insert(employee);
		
	}
}