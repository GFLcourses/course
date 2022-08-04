package com.example.gfl_patterns.factory_task.factory;

public class BeanFactorySingleton {

    private static volatile Factory factory;

    private BeanFactorySingleton() {
        factory = new BeanFactory();
    }

    public static synchronized Factory getBeanFactory() {
        if (factory == null) {
            new BeanFactorySingleton();
        }
        return factory;
    }
}
