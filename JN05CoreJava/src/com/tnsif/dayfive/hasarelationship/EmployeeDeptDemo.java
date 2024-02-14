package com.tnsif.dayfive.hasarelationship;

public class EmployeeDeptDemo {

	public static void main(String[] args) {
		Department deptOne=new Department("Account", 5);
		Department deptTwo=new Department("IT", 12);
		
		Employee empOne=new Employee(101, "Amit", 56700, deptTwo);
		Employee empTwo=new Employee(102, "Amita", 86700, deptTwo);
		Employee empThree=new Employee(103, "Ankit", 50700, deptOne);
		Employee empFour=new Employee(104, "Ankita", 61700, deptTwo);
		Employee empFive=new Employee(105, "Atul", 67000, deptOne);
		
		System.out.println("---------Employee Details---------------");
		System.out.println(empOne);
		System.out.println(empTwo);
		System.out.println(empThree);
		System.out.println(empFour);
		System.out.println(empFive);

	}

}
