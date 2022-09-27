package com.example.gfl_patterns.publisher_subscriber;

import java.util.*;

public class NewOfferNotificationPublisher implements Publisher {
    private static final NewOfferNotificationPublisher INSTANCE = new NewOfferNotificationPublisher();
    private static final Map<Company, List<Subscriber>> SUBSCRIBERS_TOPICS = new HashMap<>();

    protected NewOfferNotificationPublisher() {  }

    public static NewOfferNotificationPublisher getInstance() {
        return INSTANCE;
    }

    @Override
    public void subscribe(Topic topic, Subscriber... subscriber) {
        if (!SUBSCRIBERS_TOPICS.containsKey(topic)) {
            SUBSCRIBERS_TOPICS.put((Company) topic, new ArrayList(List.of(subscriber)));
        } else {
            SUBSCRIBERS_TOPICS.get(topic).addAll(new ArrayList(List.of(subscriber)));
        }
    }

    @Override
    public void publish() {
        SUBSCRIBERS_TOPICS.forEach((company, subscribers) -> publish(subscribers, company));
    }

    private void publish(List<Subscriber> subscribers, Company company) {
        subscribers.forEach(subscriber -> {
            String message = String.format("Hello, %s! %s has published new offer!",
                    subscriber.getUsername(), company.getTitle());
            subscriber.message(message);
        });
    }
}
