package com.example.gfl_patterns.facade_task.repository;

import com.example.gfl_patterns.facade_task.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
