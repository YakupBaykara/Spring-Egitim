package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.model.Database;

public class TestSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Database database = applicationContext.getBean("database", Database.class);
		
		System.out.println("Url : " + database.getUrl());
		System.out.println("Username : " + database.getUsername());
		System.out.println("Password : " + database.getPassword());
		
		applicationContext.close();
	}

}
