package main.java.tasks.patterns.proxy;

public class Video implements Displaylable{
    private final String path;

    public Video(String path) {
        this.path = path;
        load();
    }

    public void load() {
        System.out.println("Load video from path + " + path);
    }

    @Override
    public void display() {
        System.out.println("Watch video from path + " + path);
    }
}
