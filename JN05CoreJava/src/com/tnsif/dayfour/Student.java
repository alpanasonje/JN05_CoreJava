package com.tnsif.dayfour;

import java.util.Scanner;

public class Student {
	short rollNo;
	String name;
	String branch;
	
	void accept()
	{
		System.out.println("Enter Rollno, Name and branch of the student ");
		Scanner sc=new Scanner(System.in);
		rollNo=sc.nextShort();
		name=sc.next();
		branch=sc.next();
	}
	
	public void display()
	{
		System.out.println("Student details are as follows\n");
		System.out.println(rollNo+"\t"+name+"\t"+branch);
	}
	private void acceptOne()
	{
		System.out.println("Private method");
	}
	
	protected void displayOne()
	{
		System.out.println("Protected method");
	}

}
