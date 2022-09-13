package sub_pub.sub;

public interface Subscriber {
    void message(String message);
    String getId();
}
