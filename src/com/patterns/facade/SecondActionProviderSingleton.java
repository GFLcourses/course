package com.patterns.facade;

public class SecondActionProviderSingleton implements SecondActionProvider {

    private static volatile SecondActionProviderSingleton INSTANCE;

    private SecondActionProviderSingleton(){}

    public static SecondActionProviderSingleton getInstance() {
        if(INSTANCE == null) {
            synchronized (SecondActionProviderSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SecondActionProviderSingleton();
                }
            }
        }

        return INSTANCE;
    }

    @Override
    public void doSecondAction() {
        System.out.println("Action 2");
    }
}
