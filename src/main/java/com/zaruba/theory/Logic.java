package com.zaruba.theory;

import com.zaruba.theory.facade.impl.FacadeImpl;
import com.zaruba.theory.factory.SingletonFactory;
import com.zaruba.theory.proxy.Parameter;
import com.zaruba.theory.proxy.impl.ParameterImpl;
import com.zaruba.theory.proxy.impl.ParameterProxy;
import com.zaruba.theory.singleton.SingletonService;
import com.zaruba.theory.singleton.impl.MySingleton;
import com.zaruba.theory.singleton.impl.MySingleton2;
import com.zaruba.theory.singleton.impl.MySingleton3;

public class Logic {

    public void run() {

        FacadeImpl facade = runFacade();

        runProxy();

        runFactory(facade);

    }


    private void runFactory(FacadeImpl facade) {

        for (SingletonService singletonService : facade.getSingletonServices()) {
            System.out.println(new SingletonFactory().getSingleton(singletonService));
        }

    }

    private void runProxy() {

        Parameter parameter = new ParameterImpl();
        parameter.printParameters("something", 125, 30L);

        Parameter parameterProxy = new ParameterProxy(parameter);
        parameterProxy.printParameters("newWord", 200, 300L);

    }

    private FacadeImpl runFacade() {

        FacadeImpl facade = new FacadeImpl();
        facade.addSingleton(MySingleton.getInstance());
        facade.addSingleton(MySingleton2.getInstance());
        facade.addSingleton(MySingleton3.getInstance());

        facade.getSingleton();

        facade.removeSingleton(MySingleton2.getInstance());

        facade.getSingleton();

        facade.addSingleton(MySingleton2.getInstance());

        return facade;
    }


}
