package com.tnsif.dayeight.interfaces.functionalinterfaces;

public class Demo {

	public static void main(String[] args) {
		//Functional interface 
		Runnable r=()->{
			System.out.println("Thread is running.....");
		};
		Thread t=new Thread(r);
		t.start();
		
		//Old way - Using implementable class
		ImplClass c=new ImplClass();
		System.out.println(c.greet("Students"));
		
		//Old way - using anonymous class
		MyFunctionalInterface i=new MyFunctionalInterface() {
			@Override
			public String greet(String name) {				
				return "Hello "+name;
			}
		};
		
		System.out.println(i.greet("Students"));
		
		//Using Lambda Expression
		MyFunctionalInterface obj=(s)->  "Hi "+s;
		
		System.out.println(obj.greet("Students"));
	}

}
