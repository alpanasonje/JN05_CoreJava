//Program to define base class A for multilevel inheritance
package com.tnsif.dayfive.multilevel;

public class A {
	private int privateNumber;
	protected int protectedNumber;
    //Default Constructor
	A() {
		//super();
		System.out.println("Default Constructor....class A");
	}


	//Parameterized Constructor
	A(int value) {
		System.out.println("Parameterized Constructor....class A");
		privateNumber = value;
		protectedNumber = value+100;
	}

	//getter and setters
	public int getPrivateNumber() {
		return privateNumber;
	}

	public void setPrivateNumber(int privateNumber) {
		this.privateNumber = privateNumber;
	}

	public int getProtectedNumber() {
		return protectedNumber;
	}

	public void setProtectedNumber(int protectedNumber) {
		this.protectedNumber = protectedNumber;
	}

	//toString method
	@Override
	public String toString() {
		return "A [privateNumber=" + privateNumber + ", protectedNumber=" + protectedNumber + "]";
	}

}
