package com.cts.ecart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.ecart.entity.Product;
import com.cts.ecart.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductRestResource {
	
	@Autowired
	private ProductRepository prodRepo;
	
	@GetMapping
	public List<Product> findAllProducts(){
		return prodRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id) {
		return prodRepo.findById(id).orElse(null);
		
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return prodRepo.save(product);
	}
	
	
	
	
	
	
	

}
