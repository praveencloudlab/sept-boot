package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.ecart.repository.ProductRepositoryImpl;

@Service
public class ProductServiceImpl {
	
	@Autowired // passes/injects dependency to the dependent :: DI
	private ProductRepositoryImpl prodRepo;
	
	
	

	public void saveProduct() {
		System.out.println("Service:: saveProduct");
		prodRepo.save();
	}
}
