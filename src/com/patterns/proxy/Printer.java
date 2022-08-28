package com.patterns.proxy;

public class Printer implements PrintProvider{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
