package com.factory;

public class SingletonOneRunning implements Runnable {

    @Override
    public void run() {
        SingletonOne.getInstance();
    }
}
