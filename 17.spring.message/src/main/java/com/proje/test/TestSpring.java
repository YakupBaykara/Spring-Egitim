package com.proje.test;

import java.util.Locale;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Locale locale = new Locale("tr", "TR");
		
		String messageTR = applicationContext.getMessage("failure.login.message", null, locale);
		System.out.println(messageTR);
		
		System.out.println("-------------------------------");
		
		String messageUS = applicationContext.getMessage("failure.login.message", null, Locale.US);
		System.out.println(messageUS);
		
		applicationContext.close();
	}
}
