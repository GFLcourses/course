package main.java.tasks.graph.utils;

public record Point(int row, int col) {

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
