package com.tnsif.pvg.dayseven;

public class UsingFinal {
	int x;
	final int y = 10; // constant with value 10
	final int z; //initialize constant z in the constructor
	static final int a=10;
	public UsingFinal() {
		x++;
		// y++; final field cann't be re-assigned;
		z=20;	
	}

	public UsingFinal(int value) {
		x = value;
		z=value;
		// y=value; final field cann't be re-assigned
	}

	@Override
	public String toString() {
		return "UsingFinal [x=" + x + ", y=" + y + ", z=" + z + ", a = "+a+"]";
	}

	

}
