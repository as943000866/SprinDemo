package com.lmg.bean.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//bean 的 init() 的后置处理器
public class MyBeanPostProcess implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization" + bean+","+beanName);
		Car car = new Car();
		car.setBrand("BaoMa");
		return car;
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization" + bean+","+beanName);
		return bean;
	}

}
