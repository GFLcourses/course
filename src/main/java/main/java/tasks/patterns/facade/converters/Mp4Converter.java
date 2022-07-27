package main.java.tasks.patterns.facade.converters;

public class Mp4Converter implements Convertable{
    private static volatile Mp4Converter instance;

    public static synchronized Mp4Converter getInstance() {
        if (instance == null) {
            instance = new Mp4Converter();
        }
        return instance;
    }

    @Override
    public void convert() {
        System.out.println("Converting to mp4");
    }
}
