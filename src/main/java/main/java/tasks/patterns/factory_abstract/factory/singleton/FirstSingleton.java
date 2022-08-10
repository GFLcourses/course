package main.java.tasks.patterns.factory_abstract.factory.singleton;

public class FirstSingleton implements SingletonServiceNameable {
    private static volatile FirstSingleton INSTANCE;
    private static String name;

    private FirstSingleton() {
        name = "First singleton";
    }

    public static synchronized FirstSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new FirstSingleton();
        }
        return INSTANCE;
    }

    public static String getName() {
        return name;
    }

    @Override
    public void printName() {
        System.out.println("This is singleton - " + name);
    }
}
