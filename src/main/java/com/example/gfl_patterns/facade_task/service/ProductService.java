package com.example.gfl_patterns.facade_task.service;

import com.example.gfl_patterns.facade_task.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    Product saveOrUpdate(Product product);

    Optional<Product> findById(Long id);

    List<Product> findAll(Integer pageNo);

    void delete(Long id);
}
