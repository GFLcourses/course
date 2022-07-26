package com.example.gfl_patterns.facade_task.mapper;

import com.example.gfl_patterns.facade_task.dto.StoreDto;
import com.example.gfl_patterns.facade_task.entity.Store;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StoreMapper implements Mapper<StoreDto, Store> {

    @Override
    public StoreDto map(Store from) {
        return new StoreDto(
                from.getId(),
                from.getTitle()
        );
    }

    @Override
    public List<StoreDto> map(List<Store> fromList) {
        return fromList.stream()
                .map(store -> new StoreDto(
                        store.getId(),
                        store.getTitle()
                ))
                .collect(Collectors.toList());
    }
}
