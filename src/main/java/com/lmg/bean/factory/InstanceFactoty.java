package com.lmg.bean.factory;

import java.util.HashMap;
import java.util.Map;
/**
 * 实例工厂方法: 实例工厂的方法. 即先需要创建工厂对象本身, 再调用工厂的实例方法来返回 bean 的实例
 * @author Lmg
 *
 */
//实例工厂方法
public class InstanceFactoty {
	private Map<String, Car> map = null;
	
	public Car getInstance(String name) {
		map = new HashMap<String, Car>();
		map.put("Audi", new Car("Audi",300000));
		map.put("Ford", new Car("Ford",400000));
		return map.get(name);
	}
}
