package com.example.gfl_patterns.factory_task.service;

import com.example.gfl_patterns.factory_task.dao.CompanyDao;
import com.example.gfl_patterns.factory_task.dto.CompanyFilterDto;
import com.example.gfl_patterns.factory_task.entity.Company;
import com.example.gfl_patterns.factory_task.factory.Factory;
import com.example.gfl_patterns.factory_task.util.PropertiesUtil;

import java.util.List;
import java.util.Optional;

public class CompanyService {

    private final Integer pageSize;
    private final CompanyDao companyDao;

    public CompanyService(Factory factory) {
        this.pageSize = Integer.valueOf(PropertiesUtil.get("page.size"));
        this.companyDao = factory.createBean(CompanyDao.class);
    }

    public Company save(Company company) {
        return this.companyDao.save(company);
    }

    public Optional<Company> findById(Long id) {
        return this.companyDao.findById(id);
    }

    public List<Company> findAll() {
        return this.companyDao.findAll();
    }

    public List<Company> findAllByFilter(CompanyFilterDto filter) {
        filter.setLimit(this.pageSize);
        return this.companyDao.findAllByFilter(filter);
    }

    public boolean update(Company company) {
        return this.companyDao.update(company);
    }

    public boolean delete(Long id) {
        return this.companyDao.delete(id);
    }
}
