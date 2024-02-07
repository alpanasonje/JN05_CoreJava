package com.tnsif.daythree;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee empOne=new Employee();
		empOne.setEmpId(101);
		empOne.setName("Abhi");
		empOne.setDept("IT");
		empOne.setDesignation("Network Administrator");
		empOne.setSalary(78000);
		System.out.println("Employee Details ");
		System.out.println("EmpID = "+empOne.getEmpId());
		System.out.println("Name = "+empOne.getName());
		System.out.println("Designation = "+empOne.getDesignation());
		System.out.println("Department = "+empOne.getDept());
		System.out.println("Salary = "+empOne.getSalary());
		
		Employee empTwo=new Employee();
		empTwo.setEmpId(102);
		empTwo.setName("Manoj");
		empTwo.setDept("Account");
		empTwo.setDesignation("Accountant");
		empTwo.setSalary(38000);
		System.out.println(empTwo);
		System.out.println(empOne);
		
		
		
		
	}

}
