package main.java.tasks.patterns.factory.furniture;

public class Chair extends Furniture {
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "name=" + getName() +
                ", style=" + getStyle() +
                ", price=" + getPrice() +
                ", height=" + height +
                '}';
    }
}
