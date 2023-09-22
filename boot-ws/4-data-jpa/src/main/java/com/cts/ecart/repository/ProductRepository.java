package com.cts.ecart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Category;

public interface ProductRepository extends JpaRepository<Category, Integer> {
	
	
	// DSL : Domain specific language
	
	// find all categories by category Title
	
	List<Category> findByCategoryTitleLike(String name);
	
	
	
	
	
}
