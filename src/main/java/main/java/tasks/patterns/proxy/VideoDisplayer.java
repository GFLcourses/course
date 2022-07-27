package main.java.tasks.patterns.proxy;

public class VideoDisplayer {
    public static void main(String[] args) {
        VideoProxy videoProxy = new VideoProxy("D:\\Video\\Film.mov");
        videoProxy.display();
        videoProxy.display();
        videoProxy.display();
    }
}
