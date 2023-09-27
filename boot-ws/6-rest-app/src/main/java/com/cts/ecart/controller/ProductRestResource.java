package com.cts.ecart.controller;

import java.nio.file.spi.FileSystemProvider;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestResource {
	
	String names[]= {"N1","N2","N3","N4","N5"};
	
	List<String> emps=Arrays.asList("Praveen","James","Kumari","Prashanth");
	
	List<Product> prods=Arrays.asList(new Product(1, "P1", 100),
			new Product(2, "P2", 200),
			new Product(3, "P3", 300));
	
	
	@GetMapping
	public String f1() {
		return "GET Mapping";
	}
	
	@GetMapping("/getNames")
	public String[] f11() {
		return names;
	}
	
	@GetMapping("/getEmployees")
	public List<String> f111() {
		return emps;
	}
	
	@GetMapping("/getProducts")
	public List<Product> f1111() {
		return prods;
	}
	
	@GetMapping("/getProducts/{pid}")
	public Product f111111(@PathVariable int pid) {
		return prods.stream().filter(prod->prod.getId()==pid).findFirst().orElse(null);
	}
	
	@GetMapping("/{firstParam}")
	public String f11111(@PathVariable int firstParam) {
		return "SERVER: ==> Given ID: "+firstParam;
	}
	
	@PostMapping
	public String f2() {
		return "POST Mapping";
	}
	
	@PostMapping("/save")
	public Product f22(@RequestBody Product prod) {
		// bl to process or save
		
		System.out.println(">>>>>> SERVER :: "+prod);
		
		return prod;
	}
	
	@PutMapping
	public String f3() {
		return "PUT Mapping";
	}
	
	@PatchMapping
	public String f4() {
		return "PATCH Mapping";
	}
	
	@DeleteMapping
	public String f5() {
		return "DELETE Mapping";
	}

}
