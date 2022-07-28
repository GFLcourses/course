package com.facade;

public class SingletonFirstRunning implements Runnable{
    @Override
    public void run() {
        SingletonFirst.getInstance();
    }
}
