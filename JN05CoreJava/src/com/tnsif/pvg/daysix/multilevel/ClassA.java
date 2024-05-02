package com.tnsif.pvg.daysix.multilevel;

public class ClassA {
	private int number; //data member
	public ClassA()
	{
		this(5); //this.number=5;
		System.out.println("Class A Default constructor");		
	}
	public ClassA(int number /*local variable*/)
	{
		System.out.println("Class A parameterized constructor");
		this.number=number; //this.number refers data member number
	}
	public void show()
	{
		System.out.println(this.number);
	}
	public void show1()
	{
		System.out.println(this.number);
	}
}
