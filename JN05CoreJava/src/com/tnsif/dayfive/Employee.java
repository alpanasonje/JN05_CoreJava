//Program to define child class Employee from a Person class
package com.tnsif.dayfive;

public class Employee extends Person{
	private float salary;
	private byte experience ;
	private String deptName;
	private String designation;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, byte age, long contactNo, long adharNo) {
		super(name, age, contactNo, adharNo);
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, byte age, long contactNo, long adharNo, float salary, byte experience, String deptName,
			String designation) {
		super(name, age, contactNo, adharNo);
		this.salary = salary;
		this.experience = experience;
		this.deptName = deptName;
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public byte getExperience() {
		return experience;
	}
	public void setExperience(byte experience) {
		this.experience = experience;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	@Override
	public String toString() {
		
		return "Employee ["+super.toString()+" salary=" + salary + ", experience=" + experience + ", deptName=" + deptName + ", designation="
				+ designation + "]";
	}
	
	
}
