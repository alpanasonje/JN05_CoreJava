//Program to define child class from interface
package com.tnsif.dayeight.interfaces;

//implementable class
public class MyChildClass implements MyFirstInterface {
	@Override
	public void display() {
		System.out.println("Implementing Interface method");
		
	}
	@Override
	public String greet(String name) {
		return "Hello "+name;
	}

}
