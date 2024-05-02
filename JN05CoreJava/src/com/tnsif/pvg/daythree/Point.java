package com.tnsif.pvg.daythree;

public class Point {
	private float x, y;

	// default constructor
	public Point() {
		x = 0.0f;
		y = 0.0F;
	}

	// single parameter constructor
	public Point(float value) {
		x = value;
		y = value;
	}

	// two parameters constructor
	public Point(float a, float b) {
		x = a;
		y = b;
	}

	public void setX(float value) {
		x = value;
	}

	public float getX() {
		return x;
	}

	public void setY(float value) {
		y = value;
	}

	public float getY() {
		return y;
	}

	public void show() {
		System.out.println("Point is (" + x + ", " + y + ")");
	}
}
