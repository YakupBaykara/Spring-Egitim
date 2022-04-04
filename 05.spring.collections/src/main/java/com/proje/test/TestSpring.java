package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection = applicationContext.getBean("dbConnection", DBConnection.class);
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		applicationContext.close();
	}

}
