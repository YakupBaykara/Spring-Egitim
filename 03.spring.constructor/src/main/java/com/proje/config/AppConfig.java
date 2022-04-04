package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;

@Configuration
public class AppConfig {
	
	@Bean
	public DBConnection dbConnectionMethod() {
		DBConnection dbConnection = new DBConnection("mysql:localhost:8080", "yakup", "12345");
		return dbConnection;
	}

}
