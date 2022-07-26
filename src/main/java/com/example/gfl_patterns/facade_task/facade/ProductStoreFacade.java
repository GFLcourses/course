package com.example.gfl_patterns.facade_task.facade;

import com.example.gfl_patterns.facade_task.entity.Product;
import com.example.gfl_patterns.facade_task.entity.Store;
import com.example.gfl_patterns.facade_task.exception.EntityNoSuchException;
import com.example.gfl_patterns.facade_task.exception.StoreIsFullException;
import com.example.gfl_patterns.facade_task.service.ProductService;
import com.example.gfl_patterns.facade_task.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductStoreFacade {

    private final ProductService productService;
    private final StoreService storeService;

    @Autowired
    public ProductStoreFacade(ProductService productService, StoreService storeService) {
        this.productService = productService;
        this.storeService = storeService;
    }

    public Product saveProduct(Product product) {
        Long storeId = product.getStore().getId();
        Store store = this.storeService.findById(storeId).orElseThrow(
                ()-> new EntityNoSuchException("store with id=" + storeId + " no such")
        );

        if (store.addProduct(product)) { // maybe trash if
            product = this.productService.saveOrUpdate(product);
        } else {
            throw new StoreIsFullException("store is full, current capacity=" + store.getCapacity());
        }
        return product;
    }
}
