package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(Address address) {
		super();
		this.address = address;
		
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}