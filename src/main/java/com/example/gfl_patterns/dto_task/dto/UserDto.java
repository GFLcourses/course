package com.example.gfl_patterns.dto_task.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserDto {

    private final Long id;
    private final String username;
    private final String password;
    private final BigDecimal balance;
}
