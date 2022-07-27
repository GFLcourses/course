package main.java.tasks.patterns.facade;

import main.java.tasks.patterns.facade.converters.MovConverter;
import main.java.tasks.patterns.facade.converters.Mp3Converter;
import main.java.tasks.patterns.facade.converters.Mp4Converter;

public record ConverterFacade(String file) {

    public void convert(String format) {
        switch (format) {
            case "mp3" -> Mp3Converter.getInstance().convert();
            case "mp4" -> Mp4Converter.getInstance().convert();
            case "mov" -> MovConverter.getInstance().convert();
            default -> System.out.println("This format cannot be converted");
        }
    }
}
