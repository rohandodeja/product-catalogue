package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ProductInventory;

public interface ProductInventoryRepository extends JpaRepository<ProductInventory, Integer> {

}
