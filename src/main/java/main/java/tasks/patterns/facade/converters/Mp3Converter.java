package main.java.tasks.patterns.facade.converters;

public class Mp3Converter implements Convertable{
    private static volatile Mp3Converter instance;

    public static synchronized Mp3Converter getInstance() {
        if (instance == null) {
            instance = new Mp3Converter();
        }
        return instance;
    }

    @Override
    public void convert() {
        System.out.println("Converting to mp3");
    }
}
