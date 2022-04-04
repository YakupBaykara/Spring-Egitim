package com.proje.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;
import com.proje.model.Database;

@Configuration
public class AppConfig {
	
	@Bean(name="database")
	public Database databaseMethod() {
		
		Database database = new Database("mysql:localhost:8080", "yakup", "12345");
		return database;
	}
	
	@Bean  //(autowire = Autowire.BY_NAME)
	public DBConnection dbConnectionMethod() {
		
		DBConnection dbConnection = new DBConnection();

		return dbConnection;
	}
	
	/*
	 * @Bean 
	 * public DBConnection dbConnectionMethod() {
	 * 
	 * DBConnection dbConnection = new DBConnection();
	 * dbConnection.setDatabase(this.databaseMethod()); return dbConnection; }
	 */
	
	/*
	 * 2.Yol : Inner Bean
	 * 
	 * @Bean 
	 * public DBConnection dbConnectionMethod() {
	 * 
	 * Database database = new Database("mysql:localhost:8080", "yakup", "12345");
	 * 
	 * DBConnection dbConnection = new DBConnection();
	 * dbConnection.setDatabase(this.databaseMethod()); return dbConnection; }
	 */

}
