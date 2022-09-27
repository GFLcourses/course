package com.example.gfl_patterns.publisher_subscriber;

public interface Subscriber {

    String getUsername();

    void message(String message);
}
