package Publisher_Subscriber;

import Publisher_Subscriber.Publisher.ChanelPublisher;
import Publisher_Subscriber.Publisher.Publisher;
import Publisher_Subscriber.Subscriber.*;

public class PublisherSubscriber {

    private final static Subscriber subscriber1 = new Subscriber1();
    private final static Subscriber subscriber2 = new Subscriber2();
    private final static Subscriber subscriber3 = new Subscriber3();
    private final static Subscriber subscriber4 = new Subscriber4();
    private final static Publisher publisher = new ChanelPublisher();


    public static void main(String[] args) {
        publisher.subscribe(CategoriesOfPosts.POSTS.value,subscriber1);
        publisher.subscribe(CategoriesOfPosts.VIDEO.value,subscriber1,subscriber2);
        publisher.subscribe(CategoriesOfPosts.STREAM.value,subscriber1,subscriber2,subscriber3);
        publisher.subscribe(CategoriesOfPosts.SPONSORS.value,subscriber4);
        publisher.unsubscribe(CategoriesOfPosts.STREAM.value, subscriber3);
        publisher.publish();
    }
}
