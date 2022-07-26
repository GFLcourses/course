package com.example.gfl_patterns.facade_task.mapper;

import com.example.gfl_patterns.facade_task.dto.ProductDto;
import com.example.gfl_patterns.facade_task.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper implements Mapper<ProductDto, Product> {

    private final StoreMapper storeMapper;

    @Autowired
    public ProductMapper(StoreMapper storeMapper) {
        this.storeMapper = storeMapper;
    }

    @Override
    public ProductDto map(Product from) {
        return new ProductDto(
                from.getId(),
                from.getTitle(),
                this.storeMapper.map(from.getStore())
        );
    }

    @Override
    public List<ProductDto> map(List<Product> fromList) {
        return fromList.stream()
                .map(product -> new ProductDto(
                        product.getId(),
                        product.getTitle(),
                        this.storeMapper.map(product.getStore())
                ))
                .collect(Collectors.toList());
    }
}
