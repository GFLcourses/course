package com.pub_sub.publisher;

import com.pub_sub.subscriber.Subscriber;

public interface Publisher {
    void addSubscriber(Subscriber o);
    void removeSubscriber(Subscriber o);
    void notifySubscriber();
}
