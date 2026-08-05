package com.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amazon.entity.ProductEntity;
import com.amazon.repository.ProductRepository;
import com.amazon.request.ProductRequest;

@Service
public class ProductService 
{
	@Autowired
	ProductRepository productRepository;
	
	public String createProduct(ProductRequest request)
	{
		ProductEntity entity = new ProductEntity();
		entity.setProductName(request.getProductName());
		entity.setCategory(request.getCategory());
		entity.setBrand(request.getBrand());
		entity.setPrice(request.getPrice());
		
		productRepository.save(entity);
		
		return entity.getProductName();
	}

}
