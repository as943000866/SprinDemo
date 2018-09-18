package com.lmg.bean.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.lmg.bean.annotation.repository.UserRepository;

@Service
public class UserService {

	// Qualifier 指定注入的类(需与Autowired一起使用)
	//@Qualifier("userRepositoryImpl")
	private UserRepository userRepository;
	
	@Autowired
	public void setUserRepository(@Qualifier("userRepositoryImpl") UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public void add() {
		System.out.println("Service add");
		userRepository.save();
	}
}
