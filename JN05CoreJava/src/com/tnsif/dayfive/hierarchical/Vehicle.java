package com.tnsif.dayfive.hierarchical;

public class Vehicle {
	private String vehicleNumber;
	private String vehicleType;
	private String color;
	private float price;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String vehicleNumber, String vehicleType, String color, float price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.color = color;
		this.price = price;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleNumber=" + vehicleNumber + ", vehicleType=" + vehicleType + ", color=" + color
				+ ", price=" + price + "]";
	}

}
