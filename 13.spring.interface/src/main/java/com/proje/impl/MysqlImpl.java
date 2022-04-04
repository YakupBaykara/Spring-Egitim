package com.proje.impl;

import com.proje.db.DBConnection;

public class MysqlImpl implements DBConnection{

	@Override
	public void openConnection() {
		
		System.out.println("Mysql veritabanı bağlantısı açıldı");
	}

	@Override
	public void closeConnection() {
		
		System.out.println("Mysql veritabanı bağlantısı kapatıldı");
	}

}
