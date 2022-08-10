package main.java.tasks.patterns.factory.furniture;

public class Bed extends Furniture {
    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "name=" + getName() + '\'' +
                ", style=" + getStyle() +
                ", price=" + getPrice() +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
