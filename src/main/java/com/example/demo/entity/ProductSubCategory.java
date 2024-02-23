package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductSubCategory {
	
	@Id
	private Integer id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private ProductCategory productCategory;
}
