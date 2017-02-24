package com.nilam.main.employee;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private List<Employee> employees = Arrays.asList(
			new Employee(1, "Nilam", "Manager", 70000),
			new Employee(2, "Manish", "CEO", 30000),
			new Employee(3, "Ashotosh", "Programmer", 40000),
			new Employee(4, "Gyanu", "Tester", 50000)
			);

	public List<Employee> getAllEmployees() {
		return employees;
	}
	
	public Employee getEmployee(long id) {
		return employees.stream()
		.filter(e -> e.getId() == id)
		.findFirst()
		.get();
	}
}
