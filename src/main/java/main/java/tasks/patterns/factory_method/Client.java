package main.java.tasks.patterns.factory_method;

import main.java.tasks.patterns.factory_method.producer.AudioContentProducer;
import main.java.tasks.patterns.factory_method.producer.Producer;
import main.java.tasks.patterns.factory_method.producer.TextContentProducer;
import main.java.tasks.patterns.factory_method.producer.VideoContentProducer;
import main.java.tasks.patterns.factory_method.product.Content;

public class Client {
    public static void main(String[] args) {
        printMessage(new AudioContentProducer());
        printMessage(new TextContentProducer());
        printMessage(new VideoContentProducer());
    }

    public static void printMessage(Producer producer) {
        Content content = producer.getContent();
        System.out.println(content);
    }
}
