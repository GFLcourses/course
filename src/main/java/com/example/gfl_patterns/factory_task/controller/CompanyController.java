package com.example.gfl_patterns.factory_task.controller;

import com.example.gfl_patterns.factory_task.dto.CompanyDto;
import com.example.gfl_patterns.factory_task.dto.CompanyFilterDto;
import com.example.gfl_patterns.factory_task.entity.Company;
import com.example.gfl_patterns.factory_task.factory.Factory;
import com.example.gfl_patterns.factory_task.mapper.CompanyMapper;
import com.example.gfl_patterns.factory_task.service.CompanyService;

import java.util.List;

public class CompanyController {

    private final CompanyService companyService;
    private final CompanyMapper companyMapper;

    public CompanyController(Factory factory) {
        this.companyService = factory.createBean(CompanyService.class);
        this.companyMapper = factory.createBean(CompanyMapper.class);
    }

    public CompanyDto save(Company company) {
        Company result = this.companyService.save(company);
        return this.companyMapper.map(result);
    }

    public CompanyDto findById(Long id) {
        Company result = this.companyService.findById(id).orElse(
                new Company(null, null)
        );
        return this.companyMapper.map(result);
    }

    public List<CompanyDto> findAll() {
        List<Company> companies = this.companyService.findAll();
        return this.companyMapper.map(companies);
    }

    public List<CompanyDto> findAllByFilter(CompanyFilterDto filter) {
        List<Company> companies = this.companyService.findAllByFilter(filter);
        return this.companyMapper.map(companies);
    }

    public boolean update(Company company) {
        return this.companyService.update(company);
    }

    public boolean delete(Long id) {
        return this.companyService.delete(id);
    }
}
