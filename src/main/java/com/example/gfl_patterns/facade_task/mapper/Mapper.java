package com.example.gfl_patterns.facade_task.mapper;

import java.util.List;

public interface Mapper<T, F> {

    T map(F from);

    List<T> map(List<F> fromList);
}
