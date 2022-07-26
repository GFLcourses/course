package com.example.gfl_patterns.facade_task.service;

import com.example.gfl_patterns.facade_task.entity.Store;

import java.util.List;
import java.util.Optional;

public interface StoreService {

    Store saveOrUpdate(Store store);

    Optional<Store> findById(Long id);

    List<Store> findAll(Integer pageNo);

    void delete(Long id);
}
