package com.example.gfl_patterns.factory_task.controller;

import com.example.gfl_patterns.factory_task.dto.EmployeeDto;
import com.example.gfl_patterns.factory_task.dto.EmployeeFilterDto;
import com.example.gfl_patterns.factory_task.entity.Employee;
import com.example.gfl_patterns.factory_task.factory.Factory;
import com.example.gfl_patterns.factory_task.mapper.EmployeeMapper;
import com.example.gfl_patterns.factory_task.service.EmployeeService;

import java.util.List;

public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    public EmployeeController(Factory factory) {
        this.employeeService = factory.createBean(EmployeeService.class);
        this.employeeMapper = factory.createBean(EmployeeMapper.class);
    }

    public EmployeeDto save(Employee employee) {
        Employee result = this.employeeService.save(employee);
        return this.employeeMapper.map(result);
    }

    public EmployeeDto findById(Long id) {
        Employee result = this.employeeService.findById(id).orElse(
                new Employee(null, null, null, null)
        );
        return this.employeeMapper.map(result);
    }

    public List<EmployeeDto> findAll() {
        List<Employee> employees = this.employeeService.findAll();
        return this.employeeMapper.map(employees);
    }

    public List<EmployeeDto> findAllByFilter(EmployeeFilterDto filter) {
        List<Employee> employees = this.employeeService.findAllByFilter(filter);
        return this.employeeMapper.map(employees);
    }

    boolean update(Employee employee) {
        return this.employeeService.update(employee);
    }

    boolean delete(Long id) {
        return this.employeeService.delete(id);
    }
}
