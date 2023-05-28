package com.e_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long>{
	
}
