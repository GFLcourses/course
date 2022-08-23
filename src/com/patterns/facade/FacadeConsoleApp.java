package com.patterns.facade;

public class FacadeConsoleApp {
    public static void main(String[] args) {
        FirstActionProvider firstActionProvider = FirstActionProviderSingleton.getInstance();
        SecondActionProvider secondActionProvider = SecondActionProviderSingleton.getInstance();

        ActionsProvider actionsProvider = new ActionsProviderFacade(firstActionProvider,secondActionProvider);
        actionsProvider.doActions();
    }
}
