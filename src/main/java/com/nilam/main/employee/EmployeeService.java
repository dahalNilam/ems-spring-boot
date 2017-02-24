package com.nilam.main.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	// Get List of Employees
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>();
		employeeRepository.findAll().forEach(employeeList::add);
		return employeeList;
	}

	// Get Employee from id
	public Employee getEmployee(long id) {
		return employeeRepository.findOne(id);
	}

	// Save or Update Employee
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	// Delete Employee
	public void deleteEmployee(long id) {
		employeeRepository.delete(id);
	}

}
