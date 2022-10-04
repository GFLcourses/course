package com.pub_sub.subscriber;

public class ConsoleSubscriber implements Subscriber{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("The weather has changed. Temperature = " + temp + ", Pressure = " + presser);
    }
}
