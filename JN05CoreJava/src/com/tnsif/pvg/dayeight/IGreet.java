//Program to define Functional interface IGreet
package com.tnsif.pvg.dayeight;

@FunctionalInterface
public interface IGreet {
	String sayHello(String name);
	//void show(); //functional interface must have only one abstract method
} 

