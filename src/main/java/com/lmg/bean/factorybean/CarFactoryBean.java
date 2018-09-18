package com.lmg.bean.factorybean;

import org.springframework.beans.factory.FactoryBean;


public class CarFactoryBean implements FactoryBean<Car>{
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * 返回 bean 本身
	 */
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, 500000);
	}
	
	/**
	 * 返回对象的类型
	 */
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}
	/**
	 * 是否为单例的
	 */
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
