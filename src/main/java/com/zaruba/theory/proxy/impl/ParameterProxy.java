package com.zaruba.theory.proxy.impl;

import com.zaruba.theory.proxy.Parameter;

public class ParameterProxy implements Parameter {

    private final Parameter parameter;

    public ParameterProxy(Parameter parameter) {
        this.parameter = parameter;
    }


    @Override
    public String printParameters(String word, Integer number, Long id) {

        System.out.println(System.lineSeparator() + "Proxy prints parameters : " + word.getClass() + " -> " + word
                + ", " + number.getClass() + " -> " + number
                + ", " + id.getClass() + " -> " + id + ". ");

        return parameter.printParameters(word, number, id);

    }
}
