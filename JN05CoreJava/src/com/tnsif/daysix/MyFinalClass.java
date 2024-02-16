package com.tnsif.daysix;

public final class MyFinalClass {
	public MyFinalClass() {
		System.out.println("This is a Final Class");
	}
}

//cannot inherit final class
class MyChildClass extends MyFinalClass
{
	
}
