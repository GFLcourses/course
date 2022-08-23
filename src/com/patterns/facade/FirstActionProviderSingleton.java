package com.patterns.facade;

public class FirstActionProviderSingleton implements FirstActionProvider {

    private static volatile FirstActionProviderSingleton INSTANCE;

    private FirstActionProviderSingleton(){}

    public static FirstActionProviderSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (FirstActionProviderSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FirstActionProviderSingleton();
                }
            }
        }

        return INSTANCE;
    }

    @Override
    public void doFirstAction() {
        System.out.println("Action 1");
    }
}
