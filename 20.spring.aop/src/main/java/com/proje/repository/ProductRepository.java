package com.proje.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.proje.model.Product;

@Component
public class ProductRepository {

	private List<Product> products = new ArrayList<>();
	
	public void saveProduct(Product product) {
		
		System.out.println("Ürün eklendi.");
		this.products.add(product);
	}
	
	public void deleteProduct(Product product) {
		
		this.products.remove(product);
	}
	
	public Product findProduct(int index) {
		
		Product product = this.products.get(index);
		return product;
//		return this.products.get(index);
	}
	
	public void findProducts() {
		
		for (Product product : this.products) {
			System.out.println(product);
		}
	}
}
