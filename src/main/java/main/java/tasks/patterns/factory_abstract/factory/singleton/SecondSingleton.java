package main.java.tasks.patterns.factory_abstract.factory.singleton;

public class SecondSingleton implements SingletonServiceNameable{
    private static volatile SecondSingleton INSTANCE;
    private static String name;

    private SecondSingleton() {
        name = "Second singleton";
    }

    public static synchronized SecondSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SecondSingleton();
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
