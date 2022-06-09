package com.example.assignmentTwo.repository;


import com.example.assignmentTwo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
