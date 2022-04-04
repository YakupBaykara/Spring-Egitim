package com.proje.db;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DBConnection {
	
	private String username, password;	
	private List<String> list;
	private Map<String, String> maps;
	private Properties props;
	
	public void openConnection() {
		
		System.out.println("Username : " + this.username);
		System.out.println("Password : " + this.password);
		
		// List içindekileri listeleme
		
		System.out.println("List içindekiler ; ");
		
		for(String ozellik : this.list) {
			System.out.println("\t - " + ozellik);
		}
		
		// Map içindekileri listeleme
		
		System.out.println("Map içindekiler ; ");
		Set<String> keys = this.maps.keySet();
		
		for(String key : keys) {
			System.out.println("\t - " +key+ " : " + maps.get(key));
		}
		
		// Properties içindekileri listeleme
		
		System.out.println("Properties içindekiler ; ");
		Set<String> keyProps = this.props.stringPropertyNames();
		
		for(String propsKey : keyProps) {
			System.out.println("\t - " + propsKey + " : " + this.props.getProperty(propsKey));
		}
		
		System.out.println("Veritabanı bağlantısı açıldı");
	}
	
	public void closeConnection() {
		
		System.out.println("Veritabanı bağlantısı kapatıldı");
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

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	
}
