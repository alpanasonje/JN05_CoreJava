package com.tnsif.daythree;

public class Employee {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	private int empId;
	private String name;
	private String designation, dept;
	private float salary;
	
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", dept=" + dept
				+ ", salary=" + salary + "]";
	}
	
	
}
