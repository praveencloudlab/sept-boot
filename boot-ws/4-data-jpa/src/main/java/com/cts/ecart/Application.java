package com.cts.ecart;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.entity.Category;
import com.cts.ecart.repository.BrandRepository;
import com.cts.ecart.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository prodRepo = context.getBean(ProductRepository.class);
	
		BrandRepository brandRepo = context.getBean(BrandRepository.class);
		// fetch all categories
		//prodRepo.findAll().forEach(System.out::println);
		
		//prodRepo.findAll().stream().limit(4).forEach(System.out::println);
		// find by ID
		/*
		Category catObj = prodRepo.findById(5983).orElse(null);
		
		if(catObj!=null) {
			System.out.println(catObj);
		}else {
			System.out.println("ID Not found");
		}
		*/
		
		Category catObj=new Category();
		catObj.setCategoryTitle("New-Category-Name");
		
		//prodRepo.save(catObj);
		Category obj = prodRepo.findById(52).orElse(null);

		//obj.setCategoryTitle("Sonething else");

		//prodRepo.save(obj);
		
		//prodRepo.delete(obj);
		
		
		// find all categories by category title
		
		///prodRepo.findByCategoryTitleLike("%o%").forEach(System.out::println);
		
		//brandRepo.findAll().forEach(System.out::println);
		
		Category catData = prodRepo.findById(45).orElse(null);
		
		System.out.println(catData);
		
		
		
		
	}

}
