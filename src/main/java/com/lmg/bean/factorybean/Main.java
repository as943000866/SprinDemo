package com.lmg.bean.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factoryBean.xml");
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
	}
}
