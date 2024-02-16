package com.tnsif.daysix;

public class Student {
	private int rollNo;
	private String name, branch;
	private float per;
	private static int strength;

	//static block
	static
	{
		
		System.out.println("Static block ");
		strength=0;
		
	}
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}

	public Student() {
		super();
		strength++;
	}

	public Student(int rollNo, String name, String branch, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.per = per;
		strength++;
	}
	public static int getStrength()
	{
		//this.rollNo=11;
		return strength;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", per=" + per + ", Strength="+strength+"]";
	}

}
