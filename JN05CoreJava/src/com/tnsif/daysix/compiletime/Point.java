//Program to define class with overloaded constructors
package com.tnsif.daysix.compiletime;

public class Point {
	float x, y;
	//Default Constructor
	Point()
	{
		x=0;
		y=0;
		System.out.println("Point is set to Origin : ("+x+", "+y+")");
	}

	//Parameterized constructors
	Point(float value)
	{
		x=value;
		y=value;
		System.out.println("Point is set to equal coordinates: ("+x+", "+y+")");
	}
	
	Point (float x, float y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Point is set to : ("+x+", "+y+")");
	}
	
}
