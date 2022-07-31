package com.factory;

public class SingletonTwo implements SingletonFactoryService{
    private static volatile SingletonTwo INSTANCE;
    private static String KEY;

    private SingletonTwo() {
        KEY = Thread.currentThread().getName();
    }

    public static SingletonTwo getInstance() {
        if(INSTANCE == null) {
            synchronized (SingletonTwo.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonTwo();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void getKey() {
        System.out.println("SingletonTwo - " + KEY);
    }
}
