package com.example.gfl_patterns.dto_task.rest;

import com.example.gfl_patterns.dto_task.dto.UserDto;
import com.example.gfl_patterns.dto_task.dto.UserFilterDto;
import com.example.gfl_patterns.dto_task.entity.User;
import com.example.gfl_patterns.dto_task.mapper.UserMapper;
import com.example.gfl_patterns.dto_task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserControllerV1 {

    private final UserMapper userMapper;
    private final UserService userService;

    @Autowired
    public UserControllerV1(UserMapper userMapper, UserService userService) {
        this.userMapper = userMapper;
        this.userService = userService;
    }

    @PostMapping("/")
    public UserDto saveOrUpdate(@RequestBody User user) {
        User result = this.userService.save(user);
        return this.userMapper.map(result);
    }

    @GetMapping("/{id}")
    public UserDto findById(@PathVariable(name = "id") Long id) {
        User user = this.userService.findById(id).orElse(new User());
        return this.userMapper.map(user);
    }

    @GetMapping("/")
    public List<UserDto> findAll(@RequestParam(defaultValue = "0") Integer pageNo) {
        List<User> users = this.userService.findAll(pageNo);
        return this.userMapper.map(users);
    }

    @GetMapping("/filter")
    public List<UserDto> findAllByFilter(@RequestParam(defaultValue = "0") Integer pageNo,
                                         @RequestBody UserFilterDto filter) {
        filter.setCurrentPage(pageNo);
        List<User> users = this.userService.findAllByFilter(filter);
        return this.userMapper.map(users);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id) {
        this.userService.delete(id);
    }
}
