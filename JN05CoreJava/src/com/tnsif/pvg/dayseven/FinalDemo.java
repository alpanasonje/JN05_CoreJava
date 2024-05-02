package com.tnsif.pvg.dayseven;

public class FinalDemo {

	public static void main(String[] args) {
		UsingFinal obj = new UsingFinal();
		System.out.println(obj);

		UsingFinal objOne = new UsingFinal(5);
		System.out.println(objOne);

		UsingFinal objTwo = new UsingFinal(50);
		System.out.println(objTwo);
	}
}

//final class
final class ClassA {
	public ClassA() {
		System.out.println("This is final class");
	}
}
//String, System, all wrapper classes are final
/*
 * cann't create child classes from final class 
 * class ClassB extends ClassA {
 * 
 * }
 */

class ClassX {
	public void show() {
		System.out.println("show() in ClassX");
	}

	// final method
	public final void display() {
		System.out.println("display() in ClassX");
	}
}

class ClassY extends ClassX {
	public void show() {
		System.out.println("show() in ClassY");
	}
	// final method cann't be override
	/*
	 * public final void display() { System.out.println("display() in ClassY"); }
	 */
}