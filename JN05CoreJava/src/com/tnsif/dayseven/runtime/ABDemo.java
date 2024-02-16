package com.tnsif.dayseven.runtime;

public class ABDemo {

	public static void main(String[] args) {
		A a=new A();
		a.show();
		System.out.println("-------------------------");
		B b=new B();
		b.show();
		
		A obj;
		obj=a;
		System.out.println("-------------------------");
		obj.show();
		
		obj=b;
		System.out.println("-------------------------");
		obj.show();
			

	}

}
