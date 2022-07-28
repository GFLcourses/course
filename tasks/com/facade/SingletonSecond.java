package com.facade;

public class SingletonSecond implements SingletonService{
    private static volatile SingletonSecond INSTANCE;
    private static String KEY;

    private SingletonSecond(){
        KEY = Thread.currentThread().getName();
    }

    public static SingletonSecond getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonSecond.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonSecond();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void getKey() {
        System.out.println("SingletonSecond - " + KEY);
    }
}
