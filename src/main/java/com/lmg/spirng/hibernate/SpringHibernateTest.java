package com.lmg.spirng.hibernate;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {
	
	private ApplicationContext ctx = null;
	
	{
		ctx = new ClassPathXmlApplicationContext("ApplicationContext-hibernate.xml");
		
	}
	@Test
	public void testDataSource() throws SQLException{
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
}
