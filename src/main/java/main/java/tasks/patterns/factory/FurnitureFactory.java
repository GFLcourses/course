package main.java.tasks.patterns.factory;

import main.java.tasks.patterns.factory.furniture.Bed;
import main.java.tasks.patterns.factory.furniture.Chair;
import main.java.tasks.patterns.factory.furniture.Furniture;
import main.java.tasks.patterns.factory.furniture.Table;

public class FurnitureFactory {
    public static Furniture produceFurniture(String name) {
        switch (name) {
            case "chair" -> {
                return new Chair();
            }
            case "table" -> {
                return new Table();
            }
            case "bed" -> {
                return new Bed();
            }
            default -> throw new IllegalArgumentException("We can't produce it!");
        }
    }
}
