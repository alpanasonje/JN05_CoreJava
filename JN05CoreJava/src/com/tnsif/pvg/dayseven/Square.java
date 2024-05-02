//Program to define subclass Square for Shape class to calculate area of Square
package com.tnsif.pvg.dayseven;

public class Square extends Shape {
	private float side;

	public Square() {
		super();
		super.name = "Square";
	}
	public Square(float side) {
		super();
		this.side = side;
		super.name = "Square";
	}
	@Override
	public void calculateArea() {
		super.area = side * side;

	}
}
