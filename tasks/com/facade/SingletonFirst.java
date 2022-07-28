package com.facade;

public class SingletonFirst implements SingletonService{
    private static volatile SingletonFirst INSTANCE;
    private static String KEY;

    private SingletonFirst(){
        KEY = Thread.currentThread().getName();
    }

    public static SingletonFirst getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonFirst.class){
                if (INSTANCE == null){
                    INSTANCE = new SingletonFirst();
                }
            }
        }
        return INSTANCE;
    }

    @Override
    public void getKey() {
        System.out.println("SingletonFirst - " + KEY);
    }
}
