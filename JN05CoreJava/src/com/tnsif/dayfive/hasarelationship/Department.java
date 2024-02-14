package com.tnsif.dayfive.hasarelationship;

public class Department {
	private String name;
	private int noOfEmployees;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String name, int noOfEmployees) {
		super();
		this.name = name;
		this.noOfEmployees = noOfEmployees;
	}
	@Override
	public String toString() {
		return "Department [name=" + name + ", noOfEmployees=" + noOfEmployees + "]";
	}
	
	
}
