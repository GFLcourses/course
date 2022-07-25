package com.example.gfl_patterns.lazy_singletone;

public class Singleton {

    private static volatile Singleton instance;
    private String firstAttribute;
    private String secondAttribute;

    private Singleton() {  }

    private Singleton(String firstAttribute, String secondAttribute) {
        instance = new Singleton();
        instance.firstAttribute = firstAttribute;
        instance.secondAttribute = secondAttribute;
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            System.out.println("init"); // for check create moment
            new Singleton("some first value", "some second value");
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{" +
               "firstAttribute='" + firstAttribute + '\'' +
               ", secondAttribute='" + secondAttribute + '\'' +
               '}';
    }
}
