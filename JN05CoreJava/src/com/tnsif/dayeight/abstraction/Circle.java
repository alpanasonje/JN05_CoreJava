package com.tnsif.dayeight.abstraction;

//child class of abstract class shape
public class Circle extends Shape {
	float radius;
	float diameter;
	double circumference;

	public Circle() {
		super();
		name = "Circle";
	}

	public Circle(float radius) {
		super();
		name = "Circle";
		this.radius = radius;
		this.diameter = 2 * radius;
		this.circumference = Math.PI * this.diameter;
	}

	@Override
	public void calculateArea() {
		area = Math.PI * radius * radius;
	}

	@Override
	public void show() {
		System.out.println("Radius = " + radius);
		super.show();
		System.out.println("Diameter of circle is " + diameter);
		System.out.println("Circumference of circle is " + circumference);
	}

}
