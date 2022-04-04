package com.proje.model;

public class Product {

	private String name;
	private Double price;
	private int available;
	private String category;
	
	public Product() {}

	public Product(String name, Double price, int available, String category) {
		super();
		this.name = name;
		this.price = price;
		this.available = available;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getAvailable() {
		return available;
	}

	public void setAvailable(int available) {
		this.available = available;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", available=" + available + ", category=" + category
				+ "]";
	}
	
}
