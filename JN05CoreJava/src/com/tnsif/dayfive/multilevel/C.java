//Program to define child class C from class B
package com.tnsif.dayfive.multilevel;

public class C extends B {
	public C() {
		//super();
		System.out.println("Default Constructor....Class C");
	}
	

	public C(int value, String privateString, String protectedString) {
		super(value, privateString, protectedString);
		System.out.println("Parameterized Constructor...Class C ");
	}
}
