package com.tnsif.dayeight.interfaces.markerinterfaces;

public class StudentDemo {

	public static void main(String[] args) {
		Student s=new Student("Amol", 7878780000L);
		RegisteredStudent ss=new RegisteredStudent("Abhishek", 9898897878L);
		
		if  (ss instanceof Registrable) 
			System.out.println(ss.getName()+ " is registered for training");
		else
			System.out.println(ss.getName()+ " is not registered for training");
		System.out.println("--------------------------------------");
		if (s instanceof Registrable)
			System.out.println(s.getName()+ " is registered for training");
		else
			System.out.println(s.getName()+ " is not registered for training");
		
		

	}

}
