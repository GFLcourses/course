package main.java.tasks.patterns.factory_method.product;

public class TextContent extends Content {
    public TextContent(String header, String body) {
        super(header, body);
    }

    @Override
    public String createContent() {
        return toString();
    }

    @Override
    public String toString() {
        return "TextContent # " + getIndex() + "\r{" +
                "header='" + getHeader() + '\'' +
                ", body='" + getBody() + '\'' +
                '}';
    }
}
