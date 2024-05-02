package com.tnsif.pvg.dayseven;

public class Student {
	private String uid, name, branch;
	static private String techTrainer="Alpana", softskillTrainer=getSoftskillTrainer();
	static final String collegeName="PVG, Nashik";
	static
	{
		//techTrainer="Alpana";
		softskillTrainer="Divya";	
		initializeStaticMembers();
	}
	
	public static void initializeStaticMembers()
	{
		//this.techTrainer="";  this cann't used in static context 
		techTrainer="Alpana Sonje";
		softskillTrainer="Divya Kalarikal";
		//branch="BEIT"; non static members cann't used in static context
	}
	
	public static String getSoftSkillTrainer()
	{
		return "Divya K";
	}
	public Student() {
		
	}
	
	public Student(String uid, String name, String branch) {
		super();
		this.uid = uid;
		this.name = name;
		this.branch = branch;
		techTrainer="";
	}


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public static String getTechTrainer() {
		return techTrainer;
	}

	public static void setTechTrainer(String techTrainer) {
		Student.techTrainer = techTrainer;
	}

	public static String getSoftskillTrainer() {
		return softskillTrainer;
	}

	public static void setSoftskillTrainer(String softskillTrainer) {
		Student.softskillTrainer = softskillTrainer;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", name=" + name + ", branch=" + branch + "College : "+collegeName+"]";
	}


	

}
