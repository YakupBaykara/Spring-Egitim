package com.proje.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.proje.config.AppConfig;
import com.proje.model.Product;
import com.proje.repository.ProductRepository;

public class TestAnnotation {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductRepository productRepository = applicationContext.getBean("productRepository", ProductRepository.class);
		
		Product product = new Product("İphone 11", 10000.00, 3, "TELEFON");
		
		productRepository.saveProduct(product);
				
		System.out.println("-------------------------------");
		
		Product findProduct = productRepository.findProduct(0);
		System.out.println("Bulunan product : " +findProduct);
		
		System.out.println("-------------------------------");
		
		productRepository.findProducts();	
		
		System.out.println("-------------------------------");
		
		productRepository.deleteProduct(product);
		
		applicationContext.close();

	}

}
