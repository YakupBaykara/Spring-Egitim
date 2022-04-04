package com.proje.test;

import com.proje.db.DBConnection;

public class Test {

	public static void main(String[] args) {
		
		DBConnection dbConnection = new DBConnection();
		
		dbConnection.openConnection();
		
		dbConnection.closeConnection();
	}

}
