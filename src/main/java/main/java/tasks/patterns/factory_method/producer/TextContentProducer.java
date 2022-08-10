package main.java.tasks.patterns.factory_method.producer;

import main.java.tasks.patterns.factory_method.product.Content;
import main.java.tasks.patterns.factory_method.product.TextContent;

public class TextContentProducer extends Producer{
    @Override
    protected Content createContent() {
        return new TextContent("Text", "txt");
    }
}
