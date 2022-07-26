package com.example.gfl_patterns.facade_task.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "store", schema = "facade_task")
public class Store extends BaseEntity {

    @Column(name = "title")
    private String title;

    @Column(name = "capacity")
    private Integer capacity;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Product> products;

    public boolean addProduct(Product product) {
        if (products.size() < capacity) {
            this.products.add(product);
            return true;
        }
        return false;
    }
}
