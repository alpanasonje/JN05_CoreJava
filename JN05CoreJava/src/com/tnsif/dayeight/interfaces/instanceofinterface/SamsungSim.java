package com.tnsif.dayeight.interfaces.instanceofinterface;

public class SamsungSim implements PhoneSim{

	@Override
	public void calling() {
		System.out.println("Calling through Samsung sim");
		
	}

	@Override
	public void messaging() {
		System.out.println("Messaging through Samsung sim");
		
	}

}
