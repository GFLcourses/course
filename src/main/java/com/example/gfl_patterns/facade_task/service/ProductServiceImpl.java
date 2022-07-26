package com.example.gfl_patterns.facade_task.service;

import com.example.gfl_patterns.facade_task.entity.Product;
import com.example.gfl_patterns.facade_task.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Value("${page.size}")
    private Integer pageSize;
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public List<Product> findAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.unsorted());
        Page<Product> page = this.productRepository.findAll(pageable);

        if (page.hasContent()) {
            return page.getContent();
        }
        return new ArrayList<>();
    }

    @Override
    public void delete(Long id) {
        this.productRepository.deleteById(id);
    }
}
