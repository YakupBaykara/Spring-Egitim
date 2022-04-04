package com.proje.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.proje.event.UserSendMailEvent;
import com.proje.model.User;

@Component
public class UserSendMailPublisher {
	
	@Autowired  //Spring bu bean i otomatik olarak oluşuturur ve biz bu bean e bağlanırız
	private ApplicationEventPublisher applicationEventPublisher;
	
	public void userRegisterMessage() {
		
		String title = "Kayıt Onay Mesajı";
		String content = "Kaydınızı tamamlamak için aşağıdaki linke tıklayınız.";
		User user = new User("xxx@gmail.com", "12345", "Yakup", "Baykara");
		
		UserSendMailEvent event = new UserSendMailEvent(user, title, content);
		
		this.applicationEventPublisher.publishEvent(event);
	}

}
