//Program to define child class ClassC from ClassA, demonstrate access specifiers
package com.tnsif.pvg.dayfour.p1;

public class ClassC extends ClassA {
	//default constructor
	public ClassC()
	{
		System.out.println("ClassC default constructor");
		//System.out.println(privateNumber);// Private member cann't be inherited
		System.out.println(publicNumber);
		System.out.println(protectedNumber);
		System.out.println(number);
	}
	public static void main(String[] args) {
			ClassC obj=new ClassC();	
			//System.out.println(obj.privateNumber);// Private member cann't accessible 
			System.out.println(obj.publicNumber);
			System.out.println(obj.protectedNumber);
			System.out.println(obj.number);
			System.out.println("-------------------------------");
			System.out.println(obj); //call toString() method of ClassA
			
	}
	
}
