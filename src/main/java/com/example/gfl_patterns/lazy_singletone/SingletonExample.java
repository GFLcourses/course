package com.example.gfl_patterns.lazy_singletone;

import java.util.ArrayList;
import java.util.List;

public class SingletonExample {

    public static void main(String[] args) {
        new SingletonExample().run();
    }

    private void run() {
        System.out.println("Application start...");
        System.out.println("Proceed some code...");
        List<Singleton> singletonList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            singletonList.add(Singleton.getInstance());
        }

        for (Singleton singleton : singletonList) {
            System.out.println(singleton);
        }
    }
}
