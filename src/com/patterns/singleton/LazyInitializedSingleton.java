package com.patterns.singleton;

public class LazyInitializedSingleton {
    private static volatile LazyInitializedSingleton INSTANCE;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (LazyInitializedSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyInitializedSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
