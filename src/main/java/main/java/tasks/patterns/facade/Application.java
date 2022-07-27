package main.java.tasks.patterns.facade;

public class Application {
    public static void main(String[] args) {
        String file = "cat.wmv";
        String formatMp3 = "mp3";
        String formatMp4 = "mp4";
        String formatMov = "mov";
        ConverterFacade converter = new ConverterFacade(file);
        converter.convert(formatMp3);
        converter.convert(formatMp4);
        converter.convert(formatMov);
        converter.convert("");
    }
}
