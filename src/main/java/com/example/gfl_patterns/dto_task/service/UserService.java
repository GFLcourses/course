package com.example.gfl_patterns.dto_task.service;

import com.example.gfl_patterns.dto_task.dto.UserFilterDto;
import com.example.gfl_patterns.dto_task.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    Optional<User> findById(Long id);

    List<User> findAll(Integer pageNo);

    List<User> findAllByFilter(UserFilterDto filter);

    void delete(Long id);
}
