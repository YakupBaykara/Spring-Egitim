package com.proje.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.proje.db.DBConnection;

public class Test {

	public static void main(String[] args) {
		
		DBConnection dbConnection = new DBConnection();
		
		dbConnection.setUsername("yakup");
		dbConnection.setPassword("12345");
		
		List<String> list = Arrays.asList("Min 5 connections", "Max 20 connections", "100 statement cacheable" );		
		dbConnection.setList(list);
		
		Map<String, String> maps = new HashMap<>();
		maps.put("Min_connection", "5");
		maps.put("Max_connection", "20");
		maps.put("Max_statement_cacheable", "100");
		dbConnection.setMaps(maps);
		
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "12345");
		properties.setProperty("url", "mysql:localhost:8080");
		dbConnection.setProps(properties);
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
	}

}
