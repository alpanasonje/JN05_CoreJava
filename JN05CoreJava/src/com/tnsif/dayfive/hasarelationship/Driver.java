//Program to demonstrate Has a relationship
package com.tnsif.dayfive.hasarelationship;

public class Driver {

	public static void main(String[] args) {
		Address addrObj=new Address(12, "Pune", 520001);
		
		Person p=new Person();
		p.setName("Sumit");
		p.setContactNo(8778787700L);
		p.setAddress(addrObj);
		System.out.println(p);
		
		Address addrObjOne=new Address(11, "Mumbai", 533002);
		Person pObj=new Person("Amit", 8899000000L,addrObjOne);
		System.out.println(pObj);
		pObj.setAddress(addrObj);
		System.out.println(pObj);

	}

}
