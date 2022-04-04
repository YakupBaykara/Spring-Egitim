package com.proje.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

import com.proje.model.Database;

@Configuration
@PropertySources({
	@PropertySource("classpath:db.properties")
//	@PropertySource("classpath:xxxx") // eğer varsa
})
public class AppConfig2 {

	@Autowired    
	// Spring tarafından context te otomatik oluşturulan environment bean'ine bağlanılması gerekmektedir.
	private Environment environment;
	
	@Bean
	public Database databaseMethod() {
		
//		String url = environment.getProperty("url");
		String username = environment.getProperty("username");
		String password = environment.getProperty("password");
		
		Database database = new Database(environment.getProperty("url"), username, password);
		
		return database;
	}
}
