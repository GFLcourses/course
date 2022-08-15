package com.patterns.factory;

public class SingletonFactory {
    Singleton create(String singletonType) throws IllegalAccessException {
        switch (singletonType) {
            case "eager":
                return EagerInitializedSingleton.getInstance();
            case "lazy":
                return LazyInitializedSingleton.getInstance();
            default:
                throw new IllegalAccessException("Unknown singleton type");
        }
    }
}
