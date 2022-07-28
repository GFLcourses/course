package com.facade;

public class SingletonFacade implements SingletonService{
    private SingletonService singletonFirst;
    private SingletonService singletonSecond;

    public SingletonFacade(SingletonService singletonFirst, SingletonService singletonSecond) {
        this.singletonFirst = singletonFirst;
        this.singletonSecond = singletonSecond;
    }

    @Override
    public void getKey() {
        singletonFirst.getKey();
        singletonSecond.getKey();

    }
}
