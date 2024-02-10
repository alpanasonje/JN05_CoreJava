//Program to define child class B from Class A
package com.tnsif.dayfive.multilevel;

public class B extends A {
	private String privateString;
	protected String protectedString;

	public B() {
		//super();
		System.out.println("Default Constructor....Class B");
	}

	public B(int value, String privateString, String protectedString) {
		super(value);
		this.privateString = privateString;
		this.protectedString = protectedString;
		System.out.println("Parameterized Constructor....Class B");
	}

	public String getPrivateString() {
		return privateString;
	}

	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}

	public String getProtectedString() {
		return protectedString;
	}

	public void setProtectedString(String protectedString) {
		this.protectedString = protectedString;
	}

	@Override
	public String toString() {
		return "B [privateString=" + privateString + ", protectedString=" + protectedString + ", protectedNumber="
				+ protectedNumber + ", getPrivateNumber()=" + getPrivateNumber() + "]";
	}

	

}
