package com.tnsif.pvg.dayseven;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setUid("T05040201");
		s1.setName("Abhishek");
		s1.setBranch("CS");
	//	Student.setTechTrainer("Alpana");
		//Student.setSoftskillTrainer("Divya");
		
		Student s2=new Student();
		s2.setUid("T05040202");
		s2.setName("Atharv");
		s2.setBranch("IT");
		System.out.println(s1);
		Student s3=new Student("T05040203", "Chetan", "CS");
		
		
	//	System.out.println(s1.getTechTrainer()+"\t"+s1.getSoftskillTrainer());
		System.out.println(s2);
	//	System.out.println(s2.getTechTrainer()+"\t"+s2.getSoftskillTrainer());
		System.out.println(s3);
	}

}
