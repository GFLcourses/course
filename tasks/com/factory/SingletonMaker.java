package com.factory;

public class SingletonMaker {
    public static SingletonFactoryService createSingleton(String type){
        switch (type) {
            case "singletonOne":
                return SingletonOne.getInstance();
            case "singletonTwo":
                return  SingletonTwo.getInstance();
            default:
                throw new IllegalArgumentException("Singleton type is unknown");
        }

    };
}
