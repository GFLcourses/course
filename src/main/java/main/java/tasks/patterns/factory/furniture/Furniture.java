package main.java.tasks.patterns.factory.furniture;

public abstract class Furniture {
    private String name;
    private Style style;
    private int price;

    public String getName() {
        return name;
    }

    public Style getStyle() {
        return style;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", style=" + style +
                ", price=" + price +
                '}';
    }
}
