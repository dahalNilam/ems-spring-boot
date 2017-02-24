package com.nilam.main.address;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

	public List<Address> findByEmployeeId(long employeeId);

}
