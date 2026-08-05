package com.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.request.ProductRequest;
import com.amazon.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController
{
	@Autowired
	ProductService productService;
	
	@PostMapping("/briefProduct")
	public String CreateProduct(@RequestBody ProductRequest productRequest)
	{
		return productService.createProduct(productRequest);
		
	}

}
