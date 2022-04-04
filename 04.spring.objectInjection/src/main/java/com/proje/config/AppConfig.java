package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;
import com.proje.db.Database;

/**
 * @author Yakup
 *
 */
@Configuration
public class AppConfig {
	
	@Bean
	public Database databaseMethod() {
		
		Database database = new Database("mysql:localhost:8080", "yakup", "12345");
		return database;
	}
	
	
	@Bean
	public DBConnection dbConnectionMethod() {
		
		DBConnection dbConnection = new DBConnection();
		dbConnection.setDatabase(this.databaseMethod());
		return dbConnection;
	}
	
	/*
	 * 2.Yol : Inner Bean
	 * 
	 * @Bean public DBConnection dbConnectionMethod() {
	 * 
	 * Database database = new Database("mysql:localhost:8080", "yakup", "12345");
	 * 
	 * DBConnection dbConnection = new DBConnection();
	 * dbConnection.setDatabase(this.databaseMethod()); return dbConnection; }
	 */

}
