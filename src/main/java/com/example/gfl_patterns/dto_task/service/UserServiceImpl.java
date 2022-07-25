package com.example.gfl_patterns.dto_task.service;

import com.example.gfl_patterns.dto_task.dto.UserFilterDto;
import com.example.gfl_patterns.dto_task.entity.User;
import com.example.gfl_patterns.dto_task.repository.UserRepository;
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
public class UserServiceImpl implements UserService {

    @Value("${page.size}")
    private Integer pageSize;
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userRepository.findById(id);
    }

    @Override
    public List<User> findAll(Integer pageNo) {
        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.unsorted());
        Page<User> queryResult = this.userRepository.findAll(pageable);

        if (queryResult.hasContent()) {
            return queryResult.getContent();
        }
        return new ArrayList<>();
    }

    @Override
    public List<User> findAllByFilter(UserFilterDto filter) {
        return this.userRepository.findAllByFilter(filter);
    }

    @Override
    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }
}
