//Program to define classB to demonstrate access specifiers
package com.tnsif.pvg.dayfour.p1;

public class ClassB {
	public static void main(String[] args) {
		ClassA obj=new ClassA();		
	//	System.out.println(obj.privateNumber); Private member cann't accessible 
		System.out.println(obj.publicNumber);
		System.out.println(obj.protectedNumber);
		System.out.println(obj.number);
		System.out.println("-------------------------------");
		System.out.println(obj); //call toString() method of classA
		ClassB objB=new ClassB();
		System.out.println(objB); //call toString() method of Object class
	//	Object
	}
}
