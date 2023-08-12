package com.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productservice.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
