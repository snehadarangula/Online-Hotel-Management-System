package com.sneha.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sneha.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}