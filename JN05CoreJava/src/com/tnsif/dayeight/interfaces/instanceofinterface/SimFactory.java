package com.tnsif.dayeight.interfaces.instanceofinterface;

public class SimFactory {
	public static PhoneSim getSim(String type)
	{
		if (type.equalsIgnoreCase("Jio"))
				return new JioSim();
		else
		if (type.equalsIgnoreCase("Samsung"))
				return new SamsungSim();
		return null;		
	}
}
