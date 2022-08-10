package main.java.tasks.patterns.factory_method.producer;

import main.java.tasks.patterns.factory_method.product.AudioContent;
import main.java.tasks.patterns.factory_method.product.Content;

public class AudioContentProducer extends Producer{
    @Override
    protected Content createContent() {
        return new AudioContent("Audio", "mp3");
    }
}
