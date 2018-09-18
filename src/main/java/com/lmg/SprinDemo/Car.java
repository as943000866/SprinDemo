package com.lmg.SprinDemo;

public class Car {
	private String brand;
	private String crop;
	private double price;
	private int speedMax;
	
	public Car(String brand, String crop, double price) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.price = price;
	}

	
	public Car(String brand, String crop, int speedMax) {
		super();
		this.brand = brand;
		this.crop = crop;
		this.speedMax = speedMax;
	}


	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price + ", speedMax=" + speedMax + "]";
	}
	
	
}
