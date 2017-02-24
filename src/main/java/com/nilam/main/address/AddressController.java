package com.nilam.main.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nilam.main.employee.Employee;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;

	@RequestMapping("/employees/{id}/addresses")
	public List<Address> getAllAddresses(@PathVariable long id) {
		System.out.println("I am here");
		return addressService.getAllAddresses(id);
	}

	@RequestMapping("/employees/{employeeId}/addresses/{id}")
	public Address getAddress(@PathVariable long id) {
		return addressService.getAddress(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employees/{employeeId}/addresses")
	public void addAddress(@RequestBody Address address, @PathVariable long employeeId) {
		System.out.println(address.getCity());
		address.setEmployee(new Employee(employeeId, "", "", 0.0));
		addressService.addAddress(address);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employees/{employeeId}/addresses/{id}")
	public void updateAddress(@RequestBody Address address, @PathVariable long employeeId) {
		address.setEmployee(new Employee(employeeId, "", "", 0.0));
		addressService.addAddress(address);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employees/{employeeId}/addresses/{id}")
	public void deleteAddress(@PathVariable long id) {
		addressService.deleteAddress(id);
	}
}
