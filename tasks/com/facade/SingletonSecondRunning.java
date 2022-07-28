package com.facade;

public class SingletonSecondRunning implements Runnable{
    @Override
    public void run() {
        SingletonSecond.getInstance();
    }
}
