package com.tnsif.dayeight.interfaces.instanceofinterface;

public class Demo {

	public static void main(String[] args) {
		PhoneSim sim;
		sim=SimFactory.getSim("JIO");
		sim.calling();
		sim.messaging();

		sim=SimFactory.getSim("Samsung");
		sim.calling();
		sim.messaging();

	}

}
