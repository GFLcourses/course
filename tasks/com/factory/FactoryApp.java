package com.factory;

import com.facade.SingletonFirstRunning;
import com.facade.SingletonSecondRunning;

public class FactoryApp {
    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 1000;

        Thread t[] = new Thread[SIZE];

        for(int i=0; i<SIZE; i++){
            t[i] = new Thread(new SingletonOneRunning());
            t[i].start();
        }

        for(int i=0; i<SIZE; i++) {
            t[i].join();
        }

        for(int i=0; i<SIZE; i++){
            t[i] = new Thread(new SingletonTwoRunning());
            t[i].start();
        }

        for(int i=0; i<SIZE; i++) {
            t[i].join();
        }

        //SingletonFactoryService service1 = SingletonMaker.createSingleton("singletonOne");
        //service1.getKey();
        SingletonFactoryService service2 = SingletonMaker.createSingleton("singletonTwo");
        service2.getKey();
        //SingletonFactoryService service3 = SingletonMaker.createSingleton("singleton");

    }
}
