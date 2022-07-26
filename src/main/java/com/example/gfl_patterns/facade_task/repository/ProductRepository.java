package com.example.gfl_patterns.facade_task.repository;

import com.example.gfl_patterns.facade_task.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
