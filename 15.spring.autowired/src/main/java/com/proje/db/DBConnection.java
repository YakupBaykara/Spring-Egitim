package com.proje.db;

import org.springframework.beans.factory.annotation.Autowired;

import com.proje.model.Database;

public class DBConnection {
	
	@Autowired
	private Database database;
	
	public void openConnection() {
		
		System.out.println("Veritabanı bağlantısı açıldı");
	}
	
	public void closeConnection() {
		
		System.out.println("Veritabanı bağlantısı kapatıldı");
	}
	
	public void getDBInfo() {
		
		System.out.println("Url : " + this.database.getUrl());
		System.out.println("Username : " + this.database.getUsername());
		System.out.println("Password : " + this.database.getPassword());			
	}
	
	public Database getDatabase() {
		return database;
	}
	
	public void setDatabase(Database database) {
		this.database = database;
	}
}
