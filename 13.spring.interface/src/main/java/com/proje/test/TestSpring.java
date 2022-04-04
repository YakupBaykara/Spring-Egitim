package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proje.db.DBConnection;
import com.proje.impl.MysqlImpl;
import com.proje.impl.OracleImpl;

public class TestSpring {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// MysqlImpl ve OracleImpl sınıfları yerine DBConnection interface i baz alınır. Çünkü o iki sınıfında referansını tutar.
		//Herhangi bir değişiklikte sadece sağ taraf bilgileri değiştirilerek işlem yapılır.
		
		DBConnection dbConnection = applicationContext.getBean("mysqlImpl", MysqlImpl.class);
		DBConnection dbConnection2 = applicationContext.getBean("oracleImpl", OracleImpl.class);
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
		System.out.println("-----------------------------------");
		
		dbConnection2.openConnection();
		dbConnection2.closeConnection();
		
		applicationContext.close();
	}

}
