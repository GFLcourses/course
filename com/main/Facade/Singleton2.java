package com.main.Facade;

public class Singleton2 implements SingletonService2{
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance(){
        if(instance==null){
            instance = new Singleton2();
        }
        return instance;
    }

    @Override
    public void action(String param) {
        System.out.println("action in singleton 2");
    }
}
