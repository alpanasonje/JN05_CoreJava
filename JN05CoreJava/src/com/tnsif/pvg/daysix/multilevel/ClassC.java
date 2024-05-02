package com.tnsif.pvg.daysix.multilevel;

public class ClassC extends ClassB {
	private float per;;

	public ClassC() {
		this(200,"PVG 2025 Students",65);
		System.out.println("ClassC Default Constructor");
	}

	public ClassC(int number, String name, float per) {
		super(number, name);
		this.per = per;
		System.out.println("ClassC Parameterized Constructor");
	}

	public void show() {
		super.show();
		System.out.println(this.per);
	}
}
