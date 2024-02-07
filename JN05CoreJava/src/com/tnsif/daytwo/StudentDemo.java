package com.tnsif.daytwo;

public class StudentDemo {

	public static void main(String[] args) {
		Student studOne=new Student();
		studOne.accept();
		studOne.display();
		//studOne.acceptOne(); private member not accessible 
		studOne.displayOne();
		
		//create object of child class
		StudentResult studResult=new StudentResult();
		studResult.accept();
		//studResult.acceptOne();
		studResult.display();
		studResult.displayOne();
	}

}
