//Program to define Person class
package com.tnsif.dayfive;

public class Person {
	private String name;
	private byte age;
	private long contactNo;
	private long adharNo;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, byte age, long contactNo, long adharNo) {
		super();
		this.name = name;
		this.age = age;
		this.contactNo = contactNo;
		this.adharNo = adharNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contactNo=" + contactNo + ", adharNo=" + adharNo + "]";
	}

}
