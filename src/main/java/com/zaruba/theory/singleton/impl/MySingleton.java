package com.zaruba.theory.singleton.impl;

import com.zaruba.theory.singleton.SingletonService;

public class MySingleton implements SingletonService {

    private static volatile MySingleton INSTANCE;

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton();
                }
            }
        }
        return INSTANCE;
    }


    @Override
    public String toString() {
        return "This is MySingleton";
    }

    @Override
    public void getAction() {
        System.out.println("Action 1");
    }
}
