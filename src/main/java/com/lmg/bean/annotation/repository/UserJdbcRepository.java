package com.lmg.bean.annotation.repository;

import org.springframework.stereotype.Service;

@Service
public class UserJdbcRepository implements UserRepository {

	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserJdbcRepository save");
	}

}
