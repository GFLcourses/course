package main.java.tasks.patterns.facade.converters;

public class MovConverter implements Convertable {
    private static volatile MovConverter instance;

    public static synchronized MovConverter getInstance() {
        if (instance == null) {
            instance = new MovConverter();
        }
        return instance;
    }

    @Override
    public void convert() {
        System.out.println("Converting to mov");
    }
}
