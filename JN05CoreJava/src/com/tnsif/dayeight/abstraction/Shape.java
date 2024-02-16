//Program to define abstract class shape
package com.tnsif.dayeight.abstraction;

//Abstract class
public abstract class Shape {
	protected String name;
	protected double area;  
	
	//abstract method
	public abstract void calculateArea();
	
	//concrete method
	public void show()
	{
		System.out.println("Area of "+name+" is "+area);
	}
}
