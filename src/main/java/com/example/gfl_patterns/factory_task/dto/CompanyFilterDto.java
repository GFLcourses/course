package com.example.gfl_patterns.factory_task.dto;

public class CompanyFilterDto {

    private String title;
    private int limit;
    private int offset;

    public CompanyFilterDto(String title, int limit, int offset) {
        this.title = title;
        this.limit = limit;
        this.offset = offset;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
