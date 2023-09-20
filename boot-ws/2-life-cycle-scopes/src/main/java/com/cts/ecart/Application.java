package com.cts.ecart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cts.ecart.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
	
		// 3 ways to get bean from container :: context object
		
		//way-1 : using bean name and type casting
		//ProductServiceImpl ps=(ProductServiceImpl) context.getBean("productServiceImpl");
		//way-2 : using bean name, with out type caste:: reflection api
		//ProductServiceImpl ps=context.getBean("productServiceImpl",ProductServiceImpl.class);
		// way-3: using reflection api (class name). no type caste or bean name.
		
		 ProductServiceImpl ps1 = context.getBean(ProductServiceImpl.class);
		//ProductServiceImpl ps2 = context.getBean(ProductServiceImpl.class);

		
		//ps1.f1();
		//ps2.f1();
	
	}

}
