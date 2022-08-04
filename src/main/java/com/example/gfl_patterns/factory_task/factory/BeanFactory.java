package com.example.gfl_patterns.factory_task.factory;

import com.example.gfl_patterns.factory_task.controller.CompanyController;
import com.example.gfl_patterns.factory_task.controller.EmployeeController;
import com.example.gfl_patterns.factory_task.dao.CompanyDao;
import com.example.gfl_patterns.factory_task.dao.EmployeeDao;
import com.example.gfl_patterns.factory_task.exception.BeanNotExistException;
import com.example.gfl_patterns.factory_task.mapper.CompanyMapper;
import com.example.gfl_patterns.factory_task.mapper.EmployeeMapper;
import com.example.gfl_patterns.factory_task.service.CompanyService;
import com.example.gfl_patterns.factory_task.service.EmployeeService;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory implements Factory {

    private static final Map<Class, Object> context = new HashMap<>();

    @Override
    public <T> T createBean(Class<T> clazz) {
        if (CompanyController.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new CompanyController(this));
        }
        if (EmployeeController.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new EmployeeController(this));
        }
        if (CompanyService.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new CompanyService(this));
        }
        if (EmployeeService.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new EmployeeService(this));
        }
        if (CompanyDao.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new CompanyDao());
        }
        if (EmployeeDao.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new EmployeeDao(this));
        }
        if (CompanyMapper.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new CompanyMapper());
        }
        if (EmployeeMapper.class.isAssignableFrom(clazz)) {
            return (T)context.getOrDefault(clazz, new EmployeeMapper(this));
        }
        throw new BeanNotExistException(
                String.format("bean of class: %s not exist", clazz.getSimpleName()));
    }
}
