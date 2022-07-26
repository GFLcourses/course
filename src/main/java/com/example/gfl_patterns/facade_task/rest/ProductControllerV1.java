package com.example.gfl_patterns.facade_task.rest;

import com.example.gfl_patterns.facade_task.dto.ProductDto;
import com.example.gfl_patterns.facade_task.entity.Product;
import com.example.gfl_patterns.facade_task.facade.ProductStoreFacade;
import com.example.gfl_patterns.facade_task.mapper.ProductMapper;
import com.example.gfl_patterns.facade_task.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductControllerV1 {

    private final ProductService productService;
    private final ProductMapper productMapper;
    private final ProductStoreFacade productStoreFacade;

    @Autowired
    public ProductControllerV1(ProductService productService, ProductMapper productMapper, ProductStoreFacade productStoreFacade) {
        this.productService = productService;
        this.productMapper = productMapper;
        this.productStoreFacade = productStoreFacade;
    }

    @PostMapping("/")
    ProductDto save(@RequestBody Product product) {
        Product result = this.productStoreFacade.saveProduct(product);
        return this.productMapper.map(result);
    }

    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable(name = "id") Long id) {
        Product product = this.productService.findById(id).orElse(new Product());
        return this.productMapper.map(product);
    }

    @GetMapping("/")
    public List<ProductDto> findAll(@RequestParam(name = "PAGE", defaultValue = "1") Integer pageNo) {
        List<Product> products = this.productService.findAll(pageNo - 1);
        return this.productMapper.map(products);
    }

    @PatchMapping("/")
    ProductDto update(@RequestBody Product product) {
        Product result = this.productService.saveOrUpdate(product);
        return this.productMapper.map(result);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        this.productService.delete(id);
    }
}
