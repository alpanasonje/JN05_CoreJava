package com.tnsif.dayeight.interfaces.markerinterfaces;

public class RegisteredStudent implements Registrable{
	private String name;
	private long contactNo;
	public RegisteredStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisteredStudent(String name, long contactNo) {
		super();
		this.name = name;
		this.contactNo = contactNo;
	}
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
	@Override
	public String toString() {
		return "Student [name=" + name + ", contactNo=" + contactNo + "]";
	}
	

}
