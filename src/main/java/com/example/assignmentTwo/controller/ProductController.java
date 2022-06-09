package com.example.assignmentTwo.controller;

import com.example.assignmentTwo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductController {

    @Autowired
    private ProductRepository productRepository;
}
