package com.example.assignmentTwo.repository;

import com.example.assignmentTwo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
