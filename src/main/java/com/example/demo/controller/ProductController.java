package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/api/products/")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("search-by-name")
	public ResponseEntity<List<Product>> searchProductByName(@PathVariable String name){
		List<Product> productsByName = productService.searchProductsByName(name);
		return new ResponseEntity<>(productsByName, HttpStatus.OK);
	}
	
	public ResponseEntity<Product> searchProductById(@PathVariable Integer id) throws ProductNotFoundException{
		Product productById = productService.searchProductsById(id);
		if(productById==null) {
			throw new ProductNotFoundException("Product not found with following id "+id);
		}
		return new ResponseEntity<>(productById,HttpStatus.OK);
	}
	
	
	
}
