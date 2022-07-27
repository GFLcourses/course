package com.main.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(Singleton1.getInstance(),Singleton2.getInstance());
        facade.actionFacade("param value");
    }
}
