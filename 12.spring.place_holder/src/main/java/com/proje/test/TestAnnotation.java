package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.config.AppConfig2;
import com.proje.model.Database;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig2.class);
		Database database = applicationContext.getBean(Database.class);
		
		System.out.println("Url : " + database.getUrl());
		System.out.println("Username : " + database.getUsername());
		System.out.println("Password : " + database.getPassword());
		
		applicationContext.close();
	}

}
