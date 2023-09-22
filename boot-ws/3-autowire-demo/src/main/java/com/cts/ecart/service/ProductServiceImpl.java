package com.cts.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.ecart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Value("${beanName}")
	private String implBeanName;
	
	//@Autowired // passes/injects dependency to the dependent :: DI
	//@Qualifier("productMySQLRepositoryImpl")
	//@Qualifier("productOracleRepositoryImpl")
	private ProductRepository prodRepo;
	
	public ProductServiceImpl(ProductRepository prodRepo) {
		this.prodRepo = prodRepo;
	}


	@Override
	public void saveProduct() {
		System.out.println("Service:: saveProduct");
		prodRepo.save();
		System.out.println(implBeanName);
	}
}
