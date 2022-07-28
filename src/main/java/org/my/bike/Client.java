package org.my.bike;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        //TODO
        BicycleFactory bicycleFactory = new BicycleFactory();
        for (int i = 0; i < 30; i++) {
            rideRandomBike(bicycleFactory);
        }
        bicycleFactory.printCounts();
    }

    public static void rideRandomBike(BicycleFactory factory) {
        Bicycle randomBicycle = getRandomBicycle(factory);
        randomBicycle.ride();
    }

    public static Bicycle getRandomBicycle(BicycleFactory factory) {
        Random random = new Random();
        BikeTypes type = BikeTypes.values()[random.nextInt(BikeTypes.values().length)];
        return (factory.create(type));
    }
}
