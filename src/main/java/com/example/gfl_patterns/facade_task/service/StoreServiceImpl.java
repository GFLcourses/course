package com.example.gfl_patterns.facade_task.service;

import com.example.gfl_patterns.facade_task.entity.Store;
import com.example.gfl_patterns.facade_task.repository.StoreRepository;
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
public class StoreServiceImpl implements StoreService {

    @Value("${page.size}")
    private Integer pageSize;
    private final StoreRepository storeRepository;

    @Autowired
    public StoreServiceImpl(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    public Store saveOrUpdate(Store store) {
        return this.storeRepository.save(store);
    }

    @Override
    public Optional<Store> findById(Long id) {
        return this.storeRepository.findById(id);
    }

    @Override
    public List<Store> findAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.unsorted());
        Page<Store> page = this.storeRepository.findAll(pageable);

        if (page.hasContent()) {
            return page.getContent();
        }
        return new ArrayList<>();
    }

    @Override
    public void delete(Long id) {
        this.storeRepository.deleteById(id);
    }
}
