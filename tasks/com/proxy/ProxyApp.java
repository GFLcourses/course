package com.proxy;

public class ProxyApp {

    public static void main(String[] args) {
        Car car = new ProxyAddingGasInstallationToCar();
        car.drive();
    }
}
