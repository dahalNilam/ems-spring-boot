package com.nilam.main.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public List<Employee> getAllEmployees() {
		return employees;
	}

	public Employee getEmployee(long id) {
		return employees.stream()
				.filter(e -> e.getId() == id)
				.findFirst()
				.get();
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	private List<Employee> employees = new ArrayList<>(
			Arrays.asList(
					new Employee(1, "Nilam", "Manager", 70000),
					new Employee(2, "Manish", "CEO", 30000),
					new Employee(3, "Ashotosh", "Programmer", 40000),
					new Employee(4, "Gyanu", "Tester", 50000)
					)
			);

	public void updateEmployee(Employee employee, long id) {
		for(int i = 0; i < employees.size(); i++) {
			if(employees.get(i).getId() == id) {
				employees.set(i, employee);
			}
		}
	}

	public void deleteEmployee(long id) {
		employees.removeIf(e -> e.getId() == id);
		
	}

}
