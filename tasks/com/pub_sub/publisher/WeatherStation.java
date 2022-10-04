package com.pub_sub.publisher;

import com.pub_sub.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher{
    private int temperature;
    private int pressure;
    List<Subscriber> subscribers = new ArrayList<>();

    public void setMeasurements(int t, int p) {
        temperature = t;
        pressure = p;
        notifySubscriber();
    }

    @Override
    public void addSubscriber(Subscriber o) {
        subscribers.add(o);
    }

    @Override
    public void removeSubscriber(Subscriber o) {
        subscribers.remove(o);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber o: subscribers) {
            o.handleEvent(temperature, pressure);
        }
    }
}
