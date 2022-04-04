package com.proje.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

@Component
public class UserSendMailListener implements ApplicationListener<UserSendMailEvent>{

	@Override
	public void onApplicationEvent(UserSendMailEvent event) {
		
		User user = event.getUser();
		
		System.out.println("Mail gönderilecek User bilgileri :");
		System.out.println(user);
		
		System.out.println("Mail Başlığı : " +event.getTitle());
		System.out.println("Mail İçeriği : " +event.getContent());
		
	}

}
