package main.java.tasks.patterns.factory.furniture;

public class Table extends Furniture {
    private String form;

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name=" + getName() +
                ", style=" + getStyle() +
                ", price=" + getPrice() +
                ", form='" + form +
        '}';
    }
}
