package com.example.gfl_patterns.proxy;

public class UsingExample {

    public static void main(String[] args) {
        new UsingExample().run();
    }

    private void run() {
        SomeService someService = new SomeService("it's great string");
        System.out.println(someService.someLogic());

        SomeServiceProxy someServiceProxy = new SomeServiceProxy(someService);
        System.out.println(someServiceProxy.someLogic());
    }
}
