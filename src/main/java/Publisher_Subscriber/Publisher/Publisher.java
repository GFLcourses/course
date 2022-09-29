package Publisher_Subscriber.Publisher;

import Publisher_Subscriber.Subscriber.Subscriber;

public interface Publisher {
    void subscribe(String chanel, Subscriber... subscribers);
    void unsubscribe(String chanel, Subscriber subscriber);
    void publish();
}
