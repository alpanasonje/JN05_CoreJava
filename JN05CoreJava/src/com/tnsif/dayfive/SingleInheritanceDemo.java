package com.tnsif.dayfive;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Person personObj=new Person();
		personObj.setAdharNo(222244447777L);
		personObj.setName("Aniket");
		personObj.setAge((byte) 28);
		personObj.setContactNo(982323232300L);
		System.out.println("Person Details "+personObj);
		
		Person personObjOne=new Person("Nikhil",(byte) 25,7722000000L,111111111111L);
		System.out.println("Person Details "+personObjOne);

		Employee empOne=new Employee("Manoj", (byte) 30, 8787878787L, 222222222222L,45000, (byte)2, "Account", "Accountant");
		System.out.println("Employee Details : "+empOne);

	}

}
