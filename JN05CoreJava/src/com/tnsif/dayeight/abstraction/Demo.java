package com.tnsif.dayeight.abstraction;

public class Demo {
	public static void main(String[] args) {
		//abstract class cannot instantiated
		//Shape s=new Shape();
		Shape s; //declare s as a type of Shape
		
		Circle c=new Circle(4.5f);
		s=c; //holding instance of Circle
		s.calculateArea(); //method of Circle
		s.show(); //method of Circle
					
		System.out.println("-----------------------------");
		
		Rectangle r=new Rectangle(20,45);
		s=r; //holding instance of Rectangle
		s.calculateArea(); //method of Rectangle
		s.show(); //method of Rectangle
		
		
				
	}
}
