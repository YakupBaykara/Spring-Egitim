package com.proje.test;

import com.proje.db.DBConnection;
import com.proje.db.Database;

public class Test {
	
	public static void main(String[] args) {
		
		Database database = new Database("mysql:localhost:8080", "yakup", "12345");
		DBConnection dbConnection = new DBConnection();
		
		dbConnection.setDatabase(database);
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
		
	}
}
