//Program to define constant using final keyword
package com.tnsif.daysix;

public class UseFinal {
	int n=1;
	final int number = 10; 
	final int numberOne; 
	static final int numberTwo;
	static
	{
		numberTwo=30;
	}
	public UseFinal()
	{
		//number++;
		numberOne=20;
		//numberOne--;
		n++;
	}
	public void nonFinalMethod()
	{
		System.out.println("This is not a final method");
	}
	public final void finalMethod()
	{
		System.out.println("This is a final method");
	}
	@Override
	public String toString() {
		return "UseFinal [n=" + n + ", number=" + number + ", numberOne=" + numberOne + ", numberTwo="+numberTwo+"]";
	}		
}

class usingFinal extends UseFinal
{
	public void nonFinalMethod()
	{
		System.out.println("This is overriden version of parent class method");
	}
	
	//final method cannot be overridden
	/*
	 * public final void finalMethod() {
	 * System.out.println("This is a final method"); }
	 */
}
