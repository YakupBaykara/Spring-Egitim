package com.proje.db;

import org.springframework.beans.factory.annotation.Required;

public class DBConnection {

	private String url, username, password;

	public void openConnection() {
		
		System.out.println("Url : " + url);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
		
		System.out.println("Veritabanı bağlantısı açıldı");
	}
	
	public void closeConnection() {
		
		System.out.println("Veritabanı bağlantısı kapatıldı");
	}

	public String getUrl() {
		return url;
	}

	@Required
	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
