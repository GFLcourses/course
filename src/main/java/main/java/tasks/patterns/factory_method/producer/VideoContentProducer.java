package main.java.tasks.patterns.factory_method.producer;

import main.java.tasks.patterns.factory_method.product.Content;
import main.java.tasks.patterns.factory_method.product.VideoContent;

public class VideoContentProducer extends Producer{
    @Override
    protected Content createContent() {
        return new VideoContent("Video", "mov");
    }
}
