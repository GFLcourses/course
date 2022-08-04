package com.example.gfl_patterns.factory_task.dto;

public class EmployeeFilterDto {

    private String firstName;
    private String lastName;
    private Long companyId;
    private int limit;
    private int offset;

    public EmployeeFilterDto(String firstName, String lastName, Long companyId, int limit, int offset) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyId = companyId;
        this.limit = limit;
        this.offset = offset;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
