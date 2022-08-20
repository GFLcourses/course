package com.example.gfl_patterns.factory_task.dao;

import com.example.gfl_patterns.factory_task.entity.Employee;
import com.example.gfl_patterns.factory_task.factory.BeanFactory;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeDaoTest {
    private final EmployeeDao employeeDao = new EmployeeDao(BeanFactory.getInstance());

    @Test
    void findById() {
        Optional<Employee> byId = this.employeeDao.findById(1L);
        System.out.println(byId);
    }
}