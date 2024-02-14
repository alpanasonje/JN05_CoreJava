//Program to define Person class
package com.tnsif.dayfive.hasarelationship;

public class Person {
	private String name;
	private long contactNo;
	private Address address;

	//Constructor
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, long contactNo, Address address) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + ", address=" + address + "]";
	}
	
	
}
