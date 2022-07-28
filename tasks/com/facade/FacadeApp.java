package com.facade;

import com.singleton.Test;

public class FacadeApp {
    public static void main(String[] args) throws InterruptedException {
        final int SIZE = 1000;

        Thread t[] = new Thread[SIZE];

        for(int i=0; i<SIZE; i++){
            t[i] = new Thread(new SingletonFirstRunning());
            t[i].start();
        }

        for(int i=0; i<SIZE; i++) {
            t[i].join();
        }

        for(int i=0; i<SIZE; i++){
            t[i] = new Thread(new SingletonSecondRunning());
            t[i].start();
        }

        for(int i=0; i<SIZE; i++) {
            t[i].join();
        }

        SingletonService singletonFirst = SingletonFirst.getInstance();
        SingletonService singletonSecond = SingletonSecond.getInstance();

        SingletonFacade singletonFacade = new SingletonFacade(singletonFirst, singletonSecond);
        singletonFacade.getKey();

    }
}
