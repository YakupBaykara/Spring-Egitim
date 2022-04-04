package com.proje.test;

import java.util.Locale;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.proje.config.AppConfig;

public class TestAnnotation {
	
//	@Autowired
//	private static MessageSource messageSource;

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Locale locale = new Locale("tr", "TR");
		
//		String messageTR = applicationContext.getMessage("failure.login.message", null, locale);
//		String messageTR = messageSource.getMessage("failure.login.message", null, locale);
//		System.out.println(messageTR);
		System.out.println("-------------------------------------");
		
		String messageUS = applicationContext.getMessage("failure.login.message", null, Locale.US);	
		System.out.println(messageUS);
		
		applicationContext.close();
	}

}
