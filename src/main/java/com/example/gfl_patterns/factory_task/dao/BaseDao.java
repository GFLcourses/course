package com.example.gfl_patterns.factory_task.dao;

import java.util.List;
import java.util.Optional;

public interface BaseDao<E, K> {

    E save(E entity);                       // C

    Optional<E> findById(K key);            // R

    List<E> findAll();                      // R

    boolean update(E entity);               // U

    boolean delete(K key);                  // D
}
