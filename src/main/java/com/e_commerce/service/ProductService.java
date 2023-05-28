package com.e_commerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.repository.ProductRepository;

import model.Products;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void saveImage(Products image) {
		productRepository.save(image);	
	}

	public List<Products> getAllActiveImages() {
		return productRepository.findAll();
	}

	public Optional<Products> getImageById(Long id) {
		return productRepository.findById(id);
	}
	
}
