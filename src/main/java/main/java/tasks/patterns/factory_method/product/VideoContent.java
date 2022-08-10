package main.java.tasks.patterns.factory_method.product;

public class VideoContent extends Content {
    public VideoContent(String header, String body) {
        super(header, body);
    }

    @Override
    public String createContent() {
        return toString();
    }

    @Override
    public String toString() {
        return "VideoContent # " + getIndex() + "\r{" +
                "header='" + getHeader() + '\'' +
                ", body='" + getBody() + '\'' +
                '}';
    }
}
