package com.lmg.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法: 直接调用某一个类的静态方法就可以返回 Bean 的实例
 * @author Lmg
 *
 */
//静态工厂方法
public class StaticFactory {
	
	private static Map<String, Car> map = null;
	
	//静态块中实例化 map
	static {
		map = new HashMap<String, Car>();
		map.put("Audi", new Car("Audi",300000));
		map.put("Ford", new Car("Ford",400000));
	}
	//通过调用静态工厂方法的静态方法返回对象
	public static Car getCar(String name) {
		return map.get(name);
	}
}
