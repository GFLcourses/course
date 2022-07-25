package com.example.gfl_patterns.lazy_singletone;

public class UsingExample {

    public static void main(String[] args) {
        new UsingExample().run();
    }

    private void run() {
        Singleton singleton = Singleton.getInstance();
    }
}
