package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private Integer id;
	private String name;
	private String description;
	private String Brand;
	private String color;

}
