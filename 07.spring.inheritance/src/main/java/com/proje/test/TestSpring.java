package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.model.Database;

public class TestSpring {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Database mysqlDatabase = (Database) applicationContext.getBean("mysqlDatabase");
		System.out.println(mysqlDatabase);
		
		System.out.println("------------------------------------");
		
		Database oracleDatabase = (Database) applicationContext.getBean("oracleDatabase");
		System.out.println(oracleDatabase);

		applicationContext.close();
	}

}
