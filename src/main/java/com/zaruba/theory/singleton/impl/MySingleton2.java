package com.zaruba.theory.singleton.impl;

import com.zaruba.theory.singleton.SingletonService;

public class MySingleton2 implements SingletonService {

    private static volatile MySingleton2 INSTANCE;

    private MySingleton2() {
    }

    public static MySingleton2 getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton2.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton2();
                }
            }
        }
        return INSTANCE;
    }


    @Override
    public String toString() {
        return "This is MySingleton2";
    }

    @Override
    public void getAction() {
        System.out.println("Action 2");
    }
}
