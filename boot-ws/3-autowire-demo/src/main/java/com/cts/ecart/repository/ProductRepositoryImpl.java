package com.cts.ecart.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepositoryImpl {
	
	public void save() {
		System.out.println("Repository:: saving product...");
	}

}
