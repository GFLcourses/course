package com.patterns.factory;

public class App {
    public static void main(String[] args) throws IllegalAccessException {
        SingletonFactory singletonFactory = new SingletonFactory();

        Singleton eager = singletonFactory.create("eager");
        System.out.println(eager);

        Singleton lazy = singletonFactory.create("lazy");
        System.out.println(lazy);

        Singleton unknown = singletonFactory.create("unknown");
        System.out.println(unknown);
    }
}