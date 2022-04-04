package com.proje.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.proje.model.Database;

@Configuration
@PropertySource("db.properties") // value = "db.properties" te yazılabilirdi.
public class AppConfig {

	@Value("${url}")
	private String url;
	
	@Value("${username}")
	private String username;
	
	@Value("${password}")
	private String password;
	
	@Bean
	public Database databaseMethod() {
		
		Database database =  new Database("mysql:localhost:8080", "yakup", "12345");
		return database;
	}
}
