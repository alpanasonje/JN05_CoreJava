package com.tnsif.dayfour;

public class FinalDemo {

	public static void main(String[] args) {
		UseFinal objectOne=new UseFinal();
		System.out.println(objectOne);
		
		UseFinal objectTwo=new UseFinal();
		System.out.println(objectTwo);

		objectOne.finalMethod();
		objectTwo.finalMethod();
	}

}
