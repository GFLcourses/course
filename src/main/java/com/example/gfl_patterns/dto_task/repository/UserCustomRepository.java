package com.example.gfl_patterns.dto_task.repository;

import com.example.gfl_patterns.dto_task.dto.UserFilterDto;
import com.example.gfl_patterns.dto_task.entity.User;

import java.util.List;

public interface UserCustomRepository {

    List<User> findAllByFilter(UserFilterDto filter);
}
