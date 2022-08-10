package main.java.tasks.patterns.factory_method.product;

public abstract class Content {
    private static int index;
    private final String header;
    private final String body;

    public Content(String header, String body) {
        this.header = header;
        this.body = body;
        index = 0;
    }

    public abstract String createContent();

    public void riseIndex() {
        index++;
    }

    public static int getIndex() {
        return index;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }
}
