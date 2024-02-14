//Program to demonstrate constructor overloading
package com.tnsif.daysix.compiletime;

public class PointDemo {

	public static void main(String[] args) {
		Point p=new Point(); //default constructor
		Point pOne=new Point(12); //single parameter constructor 
		Point pTwo=new Point(12.50f, 60.10f); //two parameters constructor
	}

}
