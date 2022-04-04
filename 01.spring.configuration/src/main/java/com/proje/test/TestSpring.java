package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
		
//		1. Yol
		
//		BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
//		DBConnection dbConnection = beanFactory.getBean("dbConnection", DBConnection.class);
//		
//		dbConnection.openConnection();
//		dbConnection.closeConnection();
		
		
//		2. Yol 
		
//		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		DBConnection dbConnection = abstractApplicationContext.getBean("dbConnection", DBConnection.class);
//		
//		dbConnection.openConnection();
//		dbConnection.closeConnection();
//		
//		abstractApplicationContext.close();
		
//		3. Yol
		
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		DBConnection dbConnection = applicationContext.getBean("dbConnection", DBConnection.class);
//		
//		dbConnection.openConnection();
//		dbConnection.closeConnection();
		
//		4. Yol. Bunu kullanmak daha iyi
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection = applicationContext.getBean("dbConnection", DBConnection.class);
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		applicationContext.close();
	}

}
