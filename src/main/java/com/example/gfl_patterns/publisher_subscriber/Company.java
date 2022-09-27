package com.example.gfl_patterns.publisher_subscriber;

public class Company implements Topic {
    private static Long COMPANIES_COUNT = 0L;
    private final Long id;
    private final String title;

    public Company(String title) {
        this.title = title;
        this.id = ++COMPANIES_COUNT;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}
