package com.cts.ecart.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Service
@Scope("singleton") // by default
//@Scope("prototype")
@Lazy(value = false) // default
//@Lazy(value=true)// lazy init
public class ProductServiceImpl {

	public ProductServiceImpl() {
		System.out.println(">> 1.ProductServiceImpl object created on "+this.hashCode());
	}
	
	@PostConstruct
	public void f1() {
		System.out.println(">> 2.f1::post-construct on "+this.hashCode());
		
	}
	
	@PostConstruct
	public void f2() {
		System.out.println(">> 2.f2::post-construct on "+this.hashCode());
		
	}
	
	
	// on prototype scope, bean will create separate objects
	@Bean // will not work on lazy init
	public void f3() {
		System.out.println(">> 3.f3 :: bean on "+this.hashCode());
	}
	
	@Bean
	public void f4() {
		System.out.println(">> 3.f4 :: bean on "+this.hashCode());
	}
	
	@PreDestroy
	public void f5() {
		System.out.println(">> 4.f5 :: destroy on "+this.hashCode());
	}
	
	
	
	// void f1() {
	//	System.out.println(">> f1 method called on "+this.hashCode());
	//}

}
