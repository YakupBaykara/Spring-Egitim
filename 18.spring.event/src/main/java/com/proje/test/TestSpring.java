package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.publisher.UserSendMailPublisher;

public class TestSpring {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserSendMailPublisher publisher = (UserSendMailPublisher) applicationContext.getBean("userSendMailPublisher");
		publisher.userRegisterMessage();
		
		applicationContext.close();
	}

}
