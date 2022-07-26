package com.example.gfl_patterns.facade_task.rest;

import com.example.gfl_patterns.facade_task.dto.StoreDto;
import com.example.gfl_patterns.facade_task.entity.Store;
import com.example.gfl_patterns.facade_task.mapper.StoreMapper;
import com.example.gfl_patterns.facade_task.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/stores")
public class StoreControllerV1 {

    private final StoreMapper storeMapper;
    private final StoreService storeService;

    @Autowired
    public StoreControllerV1(StoreMapper storeMapper, StoreService storeService) {
        this.storeMapper = storeMapper;
        this.storeService = storeService;
    }

    @PostMapping("/")
    StoreDto save(@RequestBody Store store) {
        Store result = this.storeService.saveOrUpdate(store);
        return this.storeMapper.map(result);
    }

    @GetMapping("/{id}")
    StoreDto findById(@PathVariable(name = "id") Long id) {
        Store store = this.storeService.findById(id).orElse(new Store());
        return this.storeMapper.map(store);
    }

    @GetMapping("/")
    List<StoreDto> findAll(@RequestParam(name = "PAGE") Integer pageNo) {
        List<Store> stores = this.storeService.findAll(pageNo);
        return this.storeMapper.map(stores);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable(name = "id") Long id) {
        this.storeService.delete(id);
    }
}
