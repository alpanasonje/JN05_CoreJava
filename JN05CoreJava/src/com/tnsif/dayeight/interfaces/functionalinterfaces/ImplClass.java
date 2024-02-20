//Using old method to implement functional interface
package com.tnsif.dayeight.interfaces.functionalinterfaces;

public class ImplClass implements MyFunctionalInterface{
	@Override
	public String greet(String name) {		
		return "Good morning "+name;
	}

}
