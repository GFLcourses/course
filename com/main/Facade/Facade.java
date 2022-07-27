package com.main.Facade;

public class Facade implements FacadeService{
    Singleton1 singleton1;
    Singleton2 singleton2;

    public Facade(Singleton1 singleton1, Singleton2 singleton2) {
        this.singleton1 = singleton1;
        this.singleton2 = singleton2;
    }

    @Override
    public void actionFacade(String param) {
        singleton1.action(param);
        singleton2.action(param);
    }
}
