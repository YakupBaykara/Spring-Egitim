package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;

public class TestSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConnection dbConnection = applicationContext.getBean("dbConnectionName", DBConnection.class);
		DBConnection dbConnection2 = applicationContext.getBean("dbConnectionIndex", DBConnection.class);
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		System.out.println("-------------------------------");
		
		dbConnection2.openConnection();
		dbConnection2.closeConnection();
		
		applicationContext.close();
	}

}
