package com.pub_sub;

import com.pub_sub.publisher.WeatherStation;
import com.pub_sub.subscriber.ConsoleSubscriber;
import com.pub_sub.subscriber.FileSubscriber;

public class MeteApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.addSubscriber(new ConsoleSubscriber());
        station.addSubscriber((new FileSubscriber()));

        station.setMeasurements(11, 760);
        station.setMeasurements(5, 745);
    }
}
