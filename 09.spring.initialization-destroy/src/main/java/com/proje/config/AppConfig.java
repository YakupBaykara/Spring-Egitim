package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;

@Configuration
public class AppConfig {
	
	@Bean(initMethod = "validation", destroyMethod = "closeConnection")
	public DBConnection dbConnectionMethod() {
		
		DBConnection dbConnection = new DBConnection();
		dbConnection.setUrl("mysql:localhost:8080");
		dbConnection.setUsername("yakup");
		dbConnection.setPassword("12345");
		
		return dbConnection;
	}

}
