package com.sneha;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;



@SpringBootApplication
@EnableEurekaClient
@OpenAPIDefinition(info=@Info(title="EmployeeService",version="1.0",description="employee microservice"))
public class EmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
//spring.data.mongodb.uri=mongodb+srv://Sneha112:sneha112@cluster0.ore03.mongodb.net/employee-service