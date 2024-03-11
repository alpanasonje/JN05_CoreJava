package com.tnsif.daynine;

public class ObjectClassDemo {
	int number;
	String name;
	
	public ObjectClassDemo() {}
	public ObjectClassDemo(int number, String name)
	{
		this.number=number;
		this.name=name;
	}
	
	public static void main(String[] args) {
		ObjectClassDemo obj=new ObjectClassDemo(10, "Amol");
		System.out.println(obj);
		

	}

}
