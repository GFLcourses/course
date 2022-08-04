package com.example.gfl_patterns.factory_task.mapper;

import com.example.gfl_patterns.factory_task.dto.EmployeeDto;
import com.example.gfl_patterns.factory_task.entity.Employee;
import com.example.gfl_patterns.factory_task.factory.Factory;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper implements Mapper<EmployeeDto, Employee> {

    private final CompanyMapper companyMapper;

    public EmployeeMapper(Factory factory) {
        this.companyMapper = factory.createBean(CompanyMapper.class);
    }

    @Override
    public EmployeeDto map(Employee from) {
        return new EmployeeDto(
                from.getId(),
                from.getFirstName(),
                from.getFirstName(),
                this.companyMapper.map(from.getCompany())
        );
    }

    @Override
    public List<EmployeeDto> map(List<Employee> fromList) {
        return fromList.stream()
                .map(employee -> new EmployeeDto(
                        employee.getId(),
                        employee.getFirstName(),
                        employee.getFirstName(),
                        this.companyMapper.map(employee.getCompany())
                ))
                .collect(Collectors.toList());
    }
}
