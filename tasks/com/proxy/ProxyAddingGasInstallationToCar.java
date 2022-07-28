package com.proxy;

public class ProxyAddingGasInstallationToCar implements Car {
    Car car = new PetrolCar();

    @Override
    public void drive() {
        car.drive();
        System.out.println("Now I have a gas installation and we can drive on gas");
    }
}
