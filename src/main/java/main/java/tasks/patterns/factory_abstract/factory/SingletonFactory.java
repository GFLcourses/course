package main.java.tasks.patterns.factory_abstract.factory;

import main.java.tasks.patterns.factory_abstract.factory.singleton.FirstSingleton;
import main.java.tasks.patterns.factory_abstract.factory.singleton.SecondSingleton;
import main.java.tasks.patterns.factory_abstract.factory.singleton.SingletonServiceNameable;

public class SingletonFactory {
        public static SingletonServiceNameable createSingleton(String type){
            return switch (type) {
                case "first" -> FirstSingleton.getInstance();
                case "second" -> SecondSingleton.getInstance();
                default -> throw new IllegalArgumentException("wrong type");
            };

        }
}
