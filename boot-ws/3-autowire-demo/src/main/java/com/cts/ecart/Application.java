package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.repository.ProductMySQLRepositoryImpl;
import com.cts.ecart.service.ProductService;
import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductService ps = context.getBean(ProductServiceImpl.class);
		
	
		ps.saveProduct();
		
		
	
	}

}
