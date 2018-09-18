package com.lmg.bean.cycle;

public class Car {
	public Car() {
		System.out.println("Car's Construct...");
	}
	
	private String brand;
	
	public void setBrand(String brand) {
		System.out.println("set brand...");
		this.brand = brand;
	}
	
	public void init() {
		System.out.println("init");
	}
	
	public void destory(){
		System.out.println("destory");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
	
	
}
