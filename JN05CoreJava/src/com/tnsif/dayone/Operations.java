package com.tnsif.dayone;

public class Operations {
	public static boolean isEven(int number) {
		/*
		 * if (number % 2 == 0) return true; else return false;
		 */
		//return number%2==0?true:false;
		return number%2==0;
	}
	public static void checkPositiveNegative(int number)
	{
		if (number>=0)
			System.out.println(number+" is Positive");
		else 
			System.out.println(number+" is Negative");
	}
}
