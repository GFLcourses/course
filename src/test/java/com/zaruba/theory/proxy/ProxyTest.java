package com.zaruba.theory.proxy;

import com.zaruba.theory.proxy.impl.ParameterImpl;
import com.zaruba.theory.proxy.impl.ParameterProxy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyTest {

    public static final String SOMETHING = "something";
    public static final int NUMBER = 125;
    public static final long ID = 30L;

    private static final String RESULT = System.lineSeparator() +
            "ParameterImpl give first letter of String parameter : " + SOMETHING.charAt(0) +
            System.lineSeparator() +
            "ParameterImpl give number + 5 of Integer parameter : " + (NUMBER + 5) +
            System.lineSeparator() +
            "ParameterImpl give id + 20 of Integer parameter : " + (ID + 20L);


    @DisplayName("JUnit test for results of parameters if using proxy")
    @Test
    public void shouldBeSuccess() {
        Parameter parameter = new ParameterImpl();
        assertEquals(parameter.printParameters(SOMETHING, NUMBER, ID), RESULT);


        Parameter parameterProxy = new ParameterProxy(parameter);
        assertEquals(parameterProxy.printParameters(SOMETHING, NUMBER, ID), RESULT);

    }


}
