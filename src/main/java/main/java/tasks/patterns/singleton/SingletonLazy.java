package main.java.tasks.patterns.singleton;

public class SingletonLazy {
    private static volatile SingletonLazy instance;
    private final String singleton;

    private SingletonLazy() {
        this.singleton = "singleton";
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            new SingletonLazy();
        }
        return instance;
    }
}
