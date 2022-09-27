package com.example.gfl_patterns.publisher_subscriber;

public class DouUserSubscriber implements Subscriber {
    private static Long USERS_COUNT = 0L;
    private final Long id;
    private final String username;

    public DouUserSubscriber(String username) {
        this.username = username;
        this.id = ++USERS_COUNT;
    }

    @Override
    public void message(String message) {
        System.out.println(message);
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}
