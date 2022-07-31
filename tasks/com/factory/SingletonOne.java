package com.factory;

public class SingletonOne implements SingletonFactoryService {
    private static volatile SingletonOne INSTANCE;
    private static String KEY;

    private SingletonOne() {
        KEY = Thread.currentThread().getName();
    }

    public static SingletonOne getInstance() {
        if(INSTANCE == null) {
            synchronized (SingletonOne.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonOne();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void getKey() {
        System.out.println("SingletonOne - " + KEY);
    }
}
