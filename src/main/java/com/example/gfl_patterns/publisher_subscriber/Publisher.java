package com.example.gfl_patterns.publisher_subscriber;

public interface Publisher {

    void subscribe(Topic topic, Subscriber... subscriber);

    void publish();
}
