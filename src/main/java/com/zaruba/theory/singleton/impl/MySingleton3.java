package com.zaruba.theory.singleton.impl;

import com.zaruba.theory.singleton.SingletonService;

public class MySingleton3 implements SingletonService {

    private static volatile MySingleton3 INSTANCE;

    private MySingleton3() {
    }

    public static MySingleton3 getInstance() {
        if (INSTANCE == null) {
            synchronized (MySingleton3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySingleton3();
                }
            }
        }
        return INSTANCE;
    }


    @Override
    public String toString() {
        return "This is MySingleton3";
    }

    @Override
    public void getAction() {
        System.out.println("Action 3");
    }
}
