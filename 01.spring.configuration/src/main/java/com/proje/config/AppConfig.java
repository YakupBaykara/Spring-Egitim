package com.proje.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.proje.db.DBConnection;

@Configuration
public class AppConfig {
	
	@Bean
/*	@Bean(name="dbConnection")
 *  Bu şekilde name verilirse bu name göre TestAnnotation da aratacaktık. 
 */
	public DBConnection dbConnectionMethod( ) {
		
		DBConnection dbConnection = new DBConnection();
		
		return dbConnection;
	}

}
