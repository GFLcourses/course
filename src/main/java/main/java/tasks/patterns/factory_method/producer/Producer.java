package main.java.tasks.patterns.factory_method.producer;

import main.java.tasks.patterns.factory_method.product.Content;

public abstract class Producer {
    public Content getContent() {
        Content content = createContent();
        content.riseIndex();
        return content;
    }

    //Factory method
    protected abstract Content createContent();
}
