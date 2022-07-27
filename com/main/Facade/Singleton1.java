package com.main.Facade;

public class Singleton1 implements SingletonService1{

    private static Singleton1 instance;
    private Singleton1() {
    }

    public static Singleton1 getInstance(){
        if(instance==null){
            instance = new Singleton1();
        }
        return instance;
    }

    @Override
    public void action(String param) {
        System.out.println("action in singleton 1");
    }
}
