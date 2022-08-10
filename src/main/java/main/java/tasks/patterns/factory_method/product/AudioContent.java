package main.java.tasks.patterns.factory_method.product;

public class AudioContent extends Content {
    public AudioContent(String header, String body) {
        super(header, body);
    }

    @Override
    public String createContent() {
        return toString();
    }

    @Override
    public String toString() {
        return "AudioContent # " + getIndex() + "\r{" +
                "header='" + getHeader() + '\'' +
                ", body='" + getBody() + '\'' +
                '}';
    }
}
