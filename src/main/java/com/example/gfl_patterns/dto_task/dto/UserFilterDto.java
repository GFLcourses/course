package com.example.gfl_patterns.dto_task.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserFilterDto {

    private String username;
    private BigDecimal minBalance;
    private BigDecimal maxBalance;
    private Integer currentPage;
}
