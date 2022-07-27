package com.main.Proxy;

public class Main {
    public static void main(String[] args) {
        PrintService printSevice = new PrintSeviceStandart();
        printSevice.print("some param value");
        System.out.println();
        PrintService printSeviceProxy = new PrintServiceProxy(printSevice);
        printSeviceProxy.print("some value");

    }
}
