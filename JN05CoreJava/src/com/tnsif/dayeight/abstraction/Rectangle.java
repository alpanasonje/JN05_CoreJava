package com.tnsif.dayeight.abstraction;

//child class Reactangle from abstract class Shape
public class Rectangle extends Shape {
	private float length, breadth;
	private float perimeter;

	public Rectangle() {
		super();
		name="Rectangle";
	}

	public Rectangle(float length, float breadth) {
		super();
		name="Rectangle";
		this.length = length;
		this.breadth = breadth;
		perimeter = 2 * (length + breadth);
	}

	@Override
	public void calculateArea() {
		area = length * breadth;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Length = " + length);
		System.out.println("Breadth = " + breadth);
		System.out.println("Perimeter = " + perimeter);
	}
}
