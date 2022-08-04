package com.example.gfl_patterns.factory_task.mapper;

import com.example.gfl_patterns.factory_task.dto.CompanyDto;
import com.example.gfl_patterns.factory_task.entity.Company;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyMapper implements Mapper<CompanyDto, Company> {

    @Override
    public CompanyDto map(Company from) {
        return new CompanyDto(
                from.getId(),
                from.getTitle()
        );
    }

    @Override
    public List<CompanyDto> map(List<Company> fromList) {
        return fromList.stream()
                .map(company -> new CompanyDto(
                        company.getId(),
                        company.getTitle()
                ))
                .collect(Collectors.toList());
    }
}
