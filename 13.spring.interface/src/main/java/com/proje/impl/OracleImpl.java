package com.proje.impl;

import com.proje.db.DBConnection;

public class OracleImpl implements DBConnection{

	@Override
	public void openConnection() {
		
		System.out.println("Oracle veritabanı bağlantısı açıldı");
	}

	@Override
	public void closeConnection() {
		
		System.out.println("Oracle veritabanı bağlantısı kapatıldı");
	}

}
