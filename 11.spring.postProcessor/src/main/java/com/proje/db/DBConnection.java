package com.proje.db;

public class DBConnection {

	private String url, username, password;
	
	@SuppressWarnings("unused")
	private void validation() {
		
		if(this.url == null || this.username == null || this.password == null) {
			
			System.out.println("Hata : Girilen değer null");
			throw new NullPointerException("Veritabanı bilgileri yanlış");
		
		}else
			
			System.out.println("Doğrulama başarılı bir şekilde gerçekleşti");
	}

	public void openConnection() {
		
		System.out.println("Url : " + url);
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
		
		System.out.println("Veritabanı bağlantısı açıldı");
	}
	
//	public void closeConnection() {
//		
//		System.out.println("Veritabanı bağlantısı kapatıldı");
//	}
	
	// Destroy-method için böyle yapıldı
	@SuppressWarnings("unused")
	private void closeConnection() {
		
		System.out.println("Veritabanı bağlantısı kapatıldı");
	}

	public String getUrl() {
		return url;
	}

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

	@Override
	public String toString() {
		return "DBConnection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}
	

}
