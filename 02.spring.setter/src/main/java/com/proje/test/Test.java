package com.proje.test;

import com.proje.db.DBConnection;

public class Test {

	public static void main(String[] args) {
		
		DBConnection dbConnection  = new DBConnection();
		
		dbConnection.setUrl("mysql:localhost:8080");
		dbConnection.setUsername("yakup");
		dbConnection.setPassword("12345");
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
	}

}
