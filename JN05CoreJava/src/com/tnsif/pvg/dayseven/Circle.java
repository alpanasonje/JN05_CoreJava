//Program to define subclass Circle for Shape class to calculate area of circle
package com.tnsif.pvg.dayseven;

public class Circle extends Shape {
	private float radius;
	
	public Circle() {
		super();
		super.name="Circle";
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
		super.name="Circle";
	}

	
	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		super.area=(float) (Math.PI*radius*radius);
	}
}
