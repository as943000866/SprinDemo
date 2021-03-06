package com.lmg.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lmg.bean.annotation.controller.UserController;
import com.lmg.bean.annotation.repository.UserRepository;
import com.lmg.bean.annotation.service.UserService;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
	
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.excuce();
		
//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
		
//		UserRepository userRepository = (UserRepository) ctx.getBean("userRepository");
//		System.out.println(userRepository);
	}
}
