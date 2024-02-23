package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	
	public List<Product> searchProductsByBrand(String brand);
	public List<Product> searchProductsByName(String name);
	public List<Product> searchProductsByColor(String color);
	public Product searchProductsById(Integer id);
	
}
