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


import com.sneha.model.Department;
import com.sneha.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;

	/**
	 * this is used to add the department
	 */
	@PostMapping("/add")
	public void addDepartment(@RequestBody Department department) {
		departmentService.addDepartment(department);
	}
	
	@GetMapping("/get")
	public List<Department> getAllDepartments(){
		return departmentService.getAllDepartments();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Department> getDepartmentById(@PathVariable int id) {
		return departmentService.getDepartmentById(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateDepartment(@PathVariable int id, @RequestBody Department department) {
		departmentService.updateDepartment(id, department);
		return "Update Successfully";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable int id) {
		departmentService.deleteDepartmet(id);
		return "Delete Successfully";
	}

}