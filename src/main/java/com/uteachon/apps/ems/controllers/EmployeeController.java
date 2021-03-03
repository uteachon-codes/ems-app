package com.uteachon.apps.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uteachon.apps.ems.model.Employee;
import com.uteachon.apps.ems.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
    
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	// get all employees
	@GetMapping("/employees")
	public List<Employee> fetchAllEmployees() {
		return employeeRepository.findAll();
	}
}
