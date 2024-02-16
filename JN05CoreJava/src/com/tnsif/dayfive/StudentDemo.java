package com.tnsif.dayfive;

import com.tnsif.dayfour.Student;
import com.tnsif.dayfour.StudentResult;

public class StudentDemo {

	public static void main(String[] args) {
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
