package com.lmg.bean.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.lmg.bean.annotation.TestObject;
import com.lmg.bean.annotation.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
 	
	//如果 bean 不存在也不会报错
	@Autowired(required = false)
	private TestObject testObject;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void excuce() {
		System.out.println("Controller excuce");
		userService.add();
		System.out.println(testObject);
	}
}
