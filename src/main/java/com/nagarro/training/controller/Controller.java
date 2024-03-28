package com.nagarro.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.training.model.Employee;

@RestController
public class Controller {

	@GetMapping(value = "/employee")
	public Employee getEmployee() {
		
		Employee employee = new Employee();
		employee.setId(1001L);
		employee.setName("John Doe");
		employee.setDesignation("Manager");
		employee.setSalary(50000.00);
		
		return employee;
	}
	
}
