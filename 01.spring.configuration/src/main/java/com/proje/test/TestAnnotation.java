package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.proje.config.AppConfig;
import com.proje.db.DBConnection;

public class TestAnnotation {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		DBConnection dbConnection = applicationContext.getBean(DBConnection.class);
/*		
 * 		DBConnection dbConnection = applicationContext.getBean("dbConnection", DBConnection.class);
 * 		AppConfig de Bean' e name verilseydi böyle almamız gerekirdi.
 */
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		applicationContext.close();
	}

}
