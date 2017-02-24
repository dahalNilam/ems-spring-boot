package com.nilam.main.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/employees")
	public List<Employee> getEmployeeList() {
		return getEmployees();
	}

	protected List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	
}
