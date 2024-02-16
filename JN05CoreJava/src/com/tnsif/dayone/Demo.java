//First Java Program - Program to demonstrate java basics
package com.tnsif.dayone;

import java.util.Scanner;

import com.tnsif.dayfour.Student;
import com.tnsif.dayfour.StudentResult;

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
		
			}

}
