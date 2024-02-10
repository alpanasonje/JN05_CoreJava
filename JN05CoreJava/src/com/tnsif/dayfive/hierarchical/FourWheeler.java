package com.tnsif.dayfive.hierarchical;

public class FourWheeler extends Vehicle {
	private boolean autoGeared;
	private String category;
	private int settingCapacity;

	public FourWheeler() {
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(String vehicleNumber, String vehicleType, String color, float price) {
		super(vehicleNumber, vehicleType, color, price);
		// TODO Auto-generated constructor stub
	}

	public FourWheeler(String vehicleNumber, String vehicleType, String color, float price, boolean autoGeared,
			String category, int settingCapacity) {
		super(vehicleNumber, vehicleType, color, price);
		this.autoGeared = autoGeared;
		this.category = category;
		this.settingCapacity = settingCapacity;
	}

	public boolean isAutoGeared() {
		return autoGeared;
	}

	public void setAutoGeared(boolean autoGeared) {
		this.autoGeared = autoGeared;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getSettingCapacity() {
		return settingCapacity;
	}

	public void setSettingCapacity(int settingCapacity) {
		this.settingCapacity = settingCapacity;
	}

	@Override
	public String toString() {
		return "FourWheeler [autoGeared=" + autoGeared + ", category=" + category + ", settingCapacity="
				+ settingCapacity + ", toString()=" + super.toString() + "]";
	}

}
