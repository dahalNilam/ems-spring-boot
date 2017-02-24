package com.nilam.main.address;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.nilam.main.employee.Employee;

@Entity
public class Address {

	@Id
	private long id;
	private String street;
	private String city;
	private String state;
	private long zip;

	@ManyToOne
	private Employee employee;

	public Address() {
	}

	public Address(long id, String street, String city, String state, long zip, long employeeId) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.employee = new Employee(employeeId, "", "", 0);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public double getZip() {
		return zip;
	}

	public void setZip(long zip) {
		this.zip = zip;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
