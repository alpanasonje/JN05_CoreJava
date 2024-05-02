//program to define ClassE child of ClassA(another package member) to demonstrate access specifiers
package com.tnsif.pvg.dayfour.p2;

import com.tnsif.pvg.dayfour.p1.ClassA;

//child class
public class ClassE extends ClassA {
	public ClassE()
	{
		System.out.println("ClassE default constructor");
	//	System.out.println(privateNumber);// Private member cann't be inherited
		System.out.println(publicNumber);
		System.out.println(protectedNumber);
	//	System.out.println(number); //default member cann't be accessible outside the package
	}
	public static void main(String[] args) {
		
			ClassE obj=new ClassE();	
			//System.out.println(obj.privateNumber);// Private member cann't accessible 
			System.out.println(obj.publicNumber);
			System.out.println(obj.protectedNumber);
			//System.out.println(obj.number);  //default member cann't be accessible outside the package
			System.out.println("-------------------------------");
			
	}
	

}
