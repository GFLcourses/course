package com.example.gfl_patterns.dto_task.mapper;

import com.example.gfl_patterns.dto_task.dto.UserDto;
import com.example.gfl_patterns.dto_task.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper implements Mapper<UserDto, User> {

    @Override
    public UserDto map(User from) {
        return new UserDto(
                from.getId(),
                from.getUsername(),
                from.getPassword(),
                from.getBalance()
        );
    }

    @Override
    public List<UserDto> map(List<User> fromList) {
        return fromList.stream()
                .map(user -> new UserDto(
                        user.getId(),
                        user.getUsername(),
                        user.getPassword(),
                        user.getBalance()
                ))
                .collect(Collectors.toList());
    }
}
