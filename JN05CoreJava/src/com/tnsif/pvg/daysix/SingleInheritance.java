package com.tnsif.pvg.daysix;

public class SingleInheritance {

	public static void main(String[] args) {
		/*
		 * Person p1=new Person(); //System.out.println(p1.toString());
		 * System.out.println(p1); Person p2=new Person("Amit",34);
		 * System.out.println(p2);
		 */
		Student st=new Student();
		System.out.println(st);
		
		Student st1=new Student("Abhijeet", 22, 5);
		System.out.println(st1);
	}

}
