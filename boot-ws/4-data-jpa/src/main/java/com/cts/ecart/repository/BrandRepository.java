package com.cts.ecart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.ecart.entity.Brand;
import com.cts.ecart.entity.Category;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
		
	
	
}
