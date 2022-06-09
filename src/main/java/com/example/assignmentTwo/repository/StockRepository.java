package com.example.assignmentTwo.repository;

import com.example.assignmentTwo.entity.stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<stock, Long> {
}
