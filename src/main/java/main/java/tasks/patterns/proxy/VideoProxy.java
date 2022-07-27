package main.java.tasks.patterns.proxy;

public class VideoProxy implements Displaylable{

    private final String path;
    Video video;

    public VideoProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (video == null) {
            video = new Video(path);
        }
        video.display();
    }
}
