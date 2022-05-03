package com.sneha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sneha.model.Department;
import com.sneha.repository.DepartmentRepository;

@Service
public class DepartmentService {


	@Autowired
	private DepartmentRepository departmentRepository;
	
	public void addDepartment(Department department) {
		departmentRepository.save(department);
	}
	
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
	}
	
	public Optional<Department> getDepartmentById(int departmentId) {
		return departmentRepository.findById(departmentId);
	}
	
	public void updateDepartment(int deapartmentId, Department department) {
		departmentRepository.save(department);
	}
	
	public void deleteDepartmet(int departmentId) {
		departmentRepository.deleteById(departmentId);
	}

	
}