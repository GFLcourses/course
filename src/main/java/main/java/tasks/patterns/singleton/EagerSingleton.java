package main.java.tasks.patterns.singleton;

public class EagerSingleton {

    private final String singleton;
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
        this.singleton = "eager singleton";
    }

    public static synchronized EagerSingleton getInstance() {
        return instance;
    }
}
