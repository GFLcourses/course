package main.java.tasks.patterns.factory_abstract;

import main.java.tasks.patterns.factory_abstract.factory.SingletonFactory;
import main.java.tasks.patterns.factory_abstract.factory.singleton.SingletonServiceNameable;

public class Client {
    public static void main(String[] args) {
        SingletonServiceNameable service = SingletonFactory.createSingleton("first");
        service.printName();
        SingletonServiceNameable service2 = SingletonFactory.createSingleton("second");
        service2.printName();
    }
}
