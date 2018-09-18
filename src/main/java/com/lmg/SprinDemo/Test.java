package com.lmg.SprinDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//1.创建Spring的IOC容器对象
		//ApplicationContext 代表 IOC 容器
		//ClassPathXmlApplicationContext: 是 ApplicationContext 接口的实现类。该实现类从类路径下来加载配置文件
		ApplicationContext cxt = new ClassPathXmlApplicationContext("ApplictionContext.xml");
		//2.从IOC容器中获取Bean实例
		//利用 id 定位到 IOC 容器的 bean
//		HelloSpring h = (HelloSpring) cxt.getBean("helloSpring");
		//利用类型返回 IOC 容器中的 Bean,但要求 IOC 容器中必须只能有一个该类型的 Bean
		HelloSpring h = cxt.getBean(HelloSpring.class);
		//1.对象的创建和属性的设置交给sping容器实现
//		HelloSpring h = new HelloSpring();
//		h.set("spring");
		//3.调用hello方法.
		h.show();
		
		Car car = (Car) cxt.getBean("car");
		System.out.println(car);
		
		Car car1 = (Car) cxt.getBean("car1");
		System.out.println(car1);
	}
}
