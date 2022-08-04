package com.example.gfl_patterns.factory_task.service;

import com.example.gfl_patterns.factory_task.dao.EmployeeDao;
import com.example.gfl_patterns.factory_task.dto.EmployeeFilterDto;
import com.example.gfl_patterns.factory_task.entity.Employee;
import com.example.gfl_patterns.factory_task.factory.Factory;
import com.example.gfl_patterns.factory_task.util.PropertiesUtil;

import java.util.List;
import java.util.Optional;

public class EmployeeService {

    private final Integer pageSize;
    private final EmployeeDao employeeDao;

    public EmployeeService(Factory factory) {
        this.pageSize = Integer.valueOf(PropertiesUtil.get("page.size"));
        this.employeeDao = factory.createBean(EmployeeDao.class);
    }

    public Employee save(Employee employee) {
        return this.employeeDao.save(employee);
    }

    public Optional<Employee> findById(Long id) {
        return this.employeeDao.findById(id);
    }

    public List<Employee> findAll() {
        return this.employeeDao.findAll();
    }

    public List<Employee> findAllByFilter(EmployeeFilterDto filter) {
        filter.setLimit(this.pageSize);
        return this.employeeDao.findAllByFilter(filter);
    }

    public boolean update(Employee employee) {
        return this.employeeDao.update(employee);
    }

    public boolean delete(Long id) {
        return this.employeeDao.delete(id);
    }
}
