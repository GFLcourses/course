package main.java.tasks.patterns.factory.furniture;

import main.java.tasks.patterns.factory.FurnitureFactory;

public class Client {
    public static void main(String[] args) {
        Furniture furniture = FurnitureFactory.produceFurniture("chair");
        System.out.println(furniture);
    }
}
