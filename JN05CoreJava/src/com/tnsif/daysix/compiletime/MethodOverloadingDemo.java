package com.tnsif.daysix.compiletime;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		MethodOverloadingClass obj=new MethodOverloadingClass();
		obj.add();
		obj.add(111);
		obj.add(50,70);
		obj.add(60, 45.56f);
		obj.add(60, 50.0f);

	}

}
