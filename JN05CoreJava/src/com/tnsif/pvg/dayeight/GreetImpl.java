package com.tnsif.pvg.dayeight;

public class GreetImpl implements IGreet {
	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
