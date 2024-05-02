package com.tnsif.pvg.daythree;

public class PointDemo {

	public static void main(String[] args) {
		Point p1;
		p1=new Point(); //default constructor
		p1.show();

		Point p2=new Point(23); // single parameter constructor
		p2.show();
		
		Point p3=new Point(20.50f, 60.40f); // two parameters constructor
		p3.show();
		
		//p1.x=23; private members cannot accessible
		p1.setX(12);
		p1.setY(15.50f);
		System.out.println(p1.getX()+", "+p1.getY());
		p1.show();
	}

}
