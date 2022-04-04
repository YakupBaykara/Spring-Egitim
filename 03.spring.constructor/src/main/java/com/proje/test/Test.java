package com.proje.test;

import com.proje.db.DBConnection;

public class Test {

	public static void main(String[] args) {
		
		DBConnection dbConnection = new DBConnection("mysql:localhost:8080", "yakup", "12345");
		
		dbConnection.openConnection();
		dbConnection.closeConnection();
	}

}
