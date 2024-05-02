//Program to define abstract class Shape
package com.tnsif.pvg.dayseven;

abstract public class Shape {
	protected float area;
	protected String name;

	public void show() {
		System.out.println("Area of " + name + " is " + area);
	}
	
	//abstract method
	abstract public void calculateArea();
}
