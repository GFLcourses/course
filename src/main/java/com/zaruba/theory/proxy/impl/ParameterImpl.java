package com.zaruba.theory.proxy.impl;

import com.zaruba.theory.proxy.Parameter;

public class ParameterImpl implements Parameter {

    public ParameterImpl(){
        runThis();
    }

    @Override
    public String printParameters(String word, Integer number, Long id) {
        return System.lineSeparator() +
                "ParameterImpl give first letter of String parameter : " + word.charAt(0) +
                System.lineSeparator() +
                "ParameterImpl give number + 5 of Integer parameter : " + (number + 5) +
                System.lineSeparator() +
                "ParameterImpl give id + 20 of Integer parameter : " + (id + 20L);
    }

    private void runThis(){
        System.out.println(System.lineSeparator() + "ParameterImpl class start.....");
    }
}
