package com.tnsif.pvg.daysix;

public class Student extends Person{
	private int rno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int rno) {
		super(name, age);
		this.rno=rno;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return super.toString()+"Student [rno=" + rno + "]";
	}
	
	
}
