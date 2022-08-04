package com.example.gfl_patterns.factory_task.dto;

public record EmployeeDto(Long id,
                          String firstName,
                          String lastname,
                          CompanyDto company) {
}
