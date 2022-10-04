package com.pub_sub.subscriber;

public interface Subscriber {
    void handleEvent(int temp, int presser);
}
