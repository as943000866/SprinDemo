package com.lmg.bean.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService<T> {
	//通过定义父类泛型的依赖注入,该属性能被子类所继承
	@Autowired
	private BaseRepository<T> baseRepository;
	
	public void save(){
		System.out.println("add");
		System.out.println(baseRepository);
	}
}
