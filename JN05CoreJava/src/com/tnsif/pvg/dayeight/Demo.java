package com.tnsif.pvg.dayeight;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		GreetImpl obj=new GreetImpl();
		System.out.println(obj.sayHello("Students"));
		
		GreetImplTwo objOne=new GreetImplTwo();
		System.out.println(objOne.sayHello("PVG Students"));
		
	
		//Using Lambda Expression
		IGreet iObj=(name)->"Hi " + name;
		System.out.println(iObj.sayHello("Students"));
		
		iObj=(name)->{
			return ("Good Morning " + name);
			};
		System.out.println(iObj.sayHello("Students"));			
	}
}
