package com.tnsif.pvg.daysix.multilevel;

public class ClassB extends ClassA {
	private String name;

	public ClassB() {
		this(100,"PVG Student");
		System.out.println("ClassB Default Constructor");
	}

	public ClassB(int number, String name) {
		super(number);
		this.name = name;
		System.out.println("ClassB Parameterized Constructor");
	}

	public void show() {
		super.show();
		System.out.println(this.name);
	}
}
