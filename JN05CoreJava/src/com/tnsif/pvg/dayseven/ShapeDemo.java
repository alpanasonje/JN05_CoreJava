//Program to demonstrate abstract class
package com.tnsif.pvg.dayseven;

public class ShapeDemo {
	public static void main(String[] args) {
		Shape s;
	//	s=new Shape(); //abstract class cann't be instantiated
		s=new Circle();
		//s.setRadius(3.5f); child class members cann't accessible using parent class variable
		Circle c=(Circle)s; //convert Shape to Circle
		c.setRadius(3.5f);
		c.calculateArea();
		c.show();
		
		System.out.println("---------------------------");
		
		s=new Square(20);
		s.calculateArea();
		s.show();
	}
}
