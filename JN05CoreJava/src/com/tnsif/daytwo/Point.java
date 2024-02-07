package com.tnsif.daytwo;

public class Point {
	float x;
	float y;
	
	
	public Point() //Default Constructor 
	{ x=0; y=0.0f; }
	 
	public Point(float value)
	{
		x=value;
		y=value;
	}
	public Point(float a, float b)
	{
		x=a;
		y=b;
	}
	public void display()
	{
		System.out.println("Point is ("+x+", "+y+")");
	}
}
