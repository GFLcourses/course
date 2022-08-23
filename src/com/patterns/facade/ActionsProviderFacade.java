package com.patterns.facade;

public class ActionsProviderFacade implements ActionsProvider{

    private FirstActionProvider firstActionProvider;
    private SecondActionProvider secondActionProvider;

    public ActionsProviderFacade(FirstActionProvider firstActionProvider, SecondActionProvider secondActionProvider) {
        this.firstActionProvider = firstActionProvider;
        this.secondActionProvider = secondActionProvider;
    }

    @Override
    public void doActions() {
        firstActionProvider.doFirstAction();
        secondActionProvider.doSecondAction();
    }
}
