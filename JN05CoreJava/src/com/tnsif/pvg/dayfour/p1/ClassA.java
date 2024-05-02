//Program to define classA
package com.tnsif.pvg.dayfour.p1;

public class ClassA {
	private int privateNumber;
	public int publicNumber;
	protected int protectedNumber;
	int number;
	
	//default constructor
	public ClassA()
	{
		System.out.println("ClassA default constructor...");
		privateNumber=10;
		publicNumber=20;
		protectedNumber=30;
		number=40;
	}

	//override toString() method of Object class
	@Override
	public String toString() {
		return "ClassA [privateNumber=" + privateNumber + ", publicNumber=" + publicNumber + ", protectedNumber="
				+ protectedNumber + ", number=" + number + "]";
	}
	
	
}

