package com.main.Singleton;

public class SomeSingleton {
    private static SomeSingleton instance;
    private SomeSingleton() {
    }

    public SomeSingleton getInstance(){
        if(instance==null){
            instance = new SomeSingleton();
        }
        return instance;
    }
}
