//program to define ClassD to demonstrate access specifiers
package com.tnsif.pvg.dayfour.p2;

import com.tnsif.pvg.dayfour.p1.ClassA;

public class ClassD {
	public static void main(String[] args) {
		//ClassA from another package
		ClassA obj=new ClassA();		
	//	System.out.println(obj.privateNumber); //Private member cann't accessible 
		System.out.println(obj.publicNumber);
//		System.out.println(obj.protectedNumber); //Protected member cann't accessible another package non-subclass
	//	System.out.println(obj.number);//default member cann't accessible in another package
		System.out.println("-------------------------------");
	}
}
