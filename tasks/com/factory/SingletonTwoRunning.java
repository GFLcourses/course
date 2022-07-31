package com.factory;

public class SingletonTwoRunning implements Runnable{
    @Override
    public void run() {
        SingletonTwo.getInstance();
    }
}
