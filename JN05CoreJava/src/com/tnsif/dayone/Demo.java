//First Java Program - Program to demonstrate java basics
package com.tnsif.dayone;

import java.util.Scanner;

import com.tnsif.daytwo.Student;
import com.tnsif.daytwo.StudentResult;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number : ");
		number=sc.nextInt();
		
		Operations.checkPositiveNegative(number);
		Operations.checkPositiveNegative(-12);
		Operations.checkPositiveNegative(0);
	
		System.out.println("Is 4 Even?  "+Operations.isEven(number));
		System.err.println("Is 41 Even? "+Operations.isEven(41));
		
		Student s=new Student();
		s.accept(); //package-specific members not accessible
		s.display();
		s.acceptOne(); // private members not accessible
		s.displayOne(); //protected members not accessible
		
		//create object of child class
		StudentResult studResult=new StudentResult();
		studResult.accept(); //package-specific members not accessible
		//studResult.acceptOne();
		studResult.display();
		studResult.displayOne(); //protected members not accessible
	}

}
