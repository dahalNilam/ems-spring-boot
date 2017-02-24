package com.nilam.main.address;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public List<Address> getAllAddresses(long id) {
		List<Address> addresses = new ArrayList<>();
		addressRepository.findByEmployeeId(id).forEach(addresses::add);
		return addresses;
	}

	public Address getAddress(@PathVariable long id) {
		return addressRepository.findOne(id);
	}

	public void addAddress(Address address) {
		addressRepository.save(address);
	}

	public void deleteAddress(long id) {
		addressRepository.delete(id);
	}

}
