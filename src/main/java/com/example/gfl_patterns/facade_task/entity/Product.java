package com.example.gfl_patterns.facade_task.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "product", schema = "facade_task")
public class Product extends BaseEntity {

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
}
