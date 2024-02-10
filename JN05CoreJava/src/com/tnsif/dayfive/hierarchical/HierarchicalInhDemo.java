package com.tnsif.dayfive.hierarchical;

public class HierarchicalInhDemo {

	public static void main(String[] args) {
		TwoWheeler objOne=new TwoWheeler("MH15 AB1234","Fuel","Black",78000,true, false);
		TwoWheeler objTwo=new TwoWheeler("MH15 XY9898","Electric","Magenta",178000,false, false);

		FourWheeler fObjOne=new FourWheeler("MH12 EK1111","Electric","White",978000,true,"hatchback",5);
		FourWheeler fObjTwo=new FourWheeler("MH04 AY1000","Fuel","White",2580000,false,"SUV",7);
		
		System.out.println("----------Two Wheeler---------------");
		System.out.println(objOne);
		System.out.println(objTwo);
		
		System.out.println("----------Four Wheeler---------------");
		System.out.println(fObjOne);
		System.out.println(fObjTwo);
		
	}

}
