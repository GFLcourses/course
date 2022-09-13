package sub_pub.pub;

import sub_pub.sub.Subscriber;

public interface Publisher {
    void subscribe(String chanel, Subscriber... subscribers);
    void unsubscribe(String chanel, Subscriber subscriber);
    void publish();
}
