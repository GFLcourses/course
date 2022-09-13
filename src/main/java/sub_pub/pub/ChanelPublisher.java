package sub_pub.pub;

import sub_pub.CategoriesOfPosts;
import sub_pub.sub.Subscriber;

import java.util.*;

public class ChanelPublisher implements Publisher {

    private final Map<String, List<Subscriber>> subscribersList;

    public ChanelPublisher() {
        this.subscribersList = new HashMap<>();
        this.subscribersList.put(CategoriesOfPosts.POSTS.value, new ArrayList<>());
        this.subscribersList.put(CategoriesOfPosts.VIDEO.value, new ArrayList<>());
        this.subscribersList.put(CategoriesOfPosts.STREAM.value, new ArrayList<>());
        this.subscribersList.put(CategoriesOfPosts.SPONSORS.value, new ArrayList<>());
    }

    @Override
    public void subscribe(String topic, Subscriber... subscribers) {
        this.subscribersList.get(topic)
                .addAll(Arrays.stream(subscribers).toList());
    }

    @Override
    public void unsubscribe(String topic, Subscriber subscriber) {
        this.subscribersList.get(topic).remove(subscriber);
    }

    @Override
    public void publish() {
        // Publish post
        List<Subscriber> postSubscribers = subscribersList.get(CategoriesOfPosts.POSTS.value);
        publish(postSubscribers, "На канале новый пост!");
        // Publish video
        List<Subscriber> videoSubscribers = subscribersList.get(CategoriesOfPosts.VIDEO.value);
        publish(videoSubscribers, "На канале новое видео!");
        // Publish stream
        List<Subscriber> streamSubscribers = subscribersList.get(CategoriesOfPosts.STREAM.value);
        publish(streamSubscribers, "На канале начался стрим");
        // Publish sponsor
        List<Subscriber> sponsorSubscribers = subscribersList.get(CategoriesOfPosts.SPONSORS.value);
        publish(sponsorSubscribers, "На канале новый спонсор!");
    }

    private void publish(List<Subscriber> subscribers, String message) {
        subscribers.forEach(subscriber -> subscriber.message(message));
    }
}