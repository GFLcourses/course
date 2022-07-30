package com.zaruba.theory.factory;

import com.zaruba.theory.singleton.SingletonService;

public class SingletonFactory {

    public String getSingleton(SingletonService singletonService) {
        if (singletonService == null) {
            throw new RuntimeException("Service is empty");
        }
        System.out.println(System.lineSeparator() + "Factory create Singleton....");
        singletonService.getAction();
        return singletonService.toString();
    }


}
