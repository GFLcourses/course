package com.zaruba.theory.facade.impl;

import com.zaruba.theory.facade.Facade;
import com.zaruba.theory.singleton.SingletonService;

import java.util.ArrayList;
import java.util.List;

public class FacadeImpl implements Facade {

    private final List<SingletonService> singletonServices = new ArrayList<>();


    public void addSingleton(SingletonService singletonService) {
        singletonServices.add(singletonService);
    }

    public void removeSingleton(SingletonService singletonService) {
        singletonServices.remove(singletonService);
    }


    public void getSingleton() {
        System.out.println(System.lineSeparator() + "Run singletons ......");
        for (SingletonService singletonService : singletonServices) {
            singletonService.getAction();
        }
    }

}
