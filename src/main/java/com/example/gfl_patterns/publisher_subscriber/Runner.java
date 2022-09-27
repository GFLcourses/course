package com.example.gfl_patterns.publisher_subscriber;

public class Runner {

    public static void main(String[] args) {
        new Runner().run();
    }

    private void run() {
        NewOfferNotificationPublisher notificationPublisher = NewOfferNotificationPublisher.getInstance();

        Company gfl = new Company("GFL");
        Company epam = new Company("EPAM");
        Company google = new Company("Google");

        DouUserSubscriber petro = new DouUserSubscriber("Petro");
        DouUserSubscriber taras = new DouUserSubscriber("Taras");
        DouUserSubscriber maxim = new DouUserSubscriber("Maxim");
        DouUserSubscriber oleg = new DouUserSubscriber("Oleg");
        DouUserSubscriber sergey = new DouUserSubscriber("Sergey");
        DouUserSubscriber oleksiy = new DouUserSubscriber("Oleksiy");
        DouUserSubscriber gennadiy = new DouUserSubscriber("Gennadiy");

        notificationPublisher.subscribe(gfl, petro);
        notificationPublisher.subscribe(gfl, taras);
        notificationPublisher.subscribe(gfl, maxim);
        notificationPublisher.subscribe(gfl, sergey);
        notificationPublisher.subscribe(gfl, oleksiy);

        notificationPublisher.subscribe(google, sergey);
        notificationPublisher.subscribe(google, oleksiy);

        notificationPublisher.subscribe(epam, sergey);
        notificationPublisher.subscribe(epam, gennadiy);
        notificationPublisher.subscribe(epam, oleg);

        notificationPublisher.publish();
    }
}
