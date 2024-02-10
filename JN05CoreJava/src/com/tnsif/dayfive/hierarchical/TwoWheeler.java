package com.tnsif.dayfive.hierarchical;

public class TwoWheeler extends Vehicle {
	private boolean isGeared;
	private boolean withSideWheel;

	public TwoWheeler() {
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(String vehicleNumber, String vehicleType, String color, float price) {
		super(vehicleNumber, vehicleType, color, price);
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler(String vehicleNumber, String vehicleType, String color, float price, boolean isGeared,
			boolean withSideWheel) {
		super(vehicleNumber, vehicleType, color, price);
		this.isGeared = isGeared;
		this.withSideWheel = withSideWheel;
	}

	public boolean isGeared() {
		return isGeared;
	}

	public void setGeared(boolean isGeared) {
		this.isGeared = isGeared;
	}

	public boolean isWithSideWheel() {
		return withSideWheel;
	}

	public void setWithSideWheel(boolean withSideWheel) {
		this.withSideWheel = withSideWheel;
	}

	@Override
	public String toString() {
		return "TwoWheeler [isGeared=" + isGeared + ", withSideWheel=" + withSideWheel + ", toString()="
				+ super.toString() + "]";
	}

}
