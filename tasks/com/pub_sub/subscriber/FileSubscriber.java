package com.pub_sub.subscriber;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSubscriber implements Subscriber{
    @Override
    public void handleEvent(int temp, int presser) {
        File file;
        try {
            file = File.createTempFile("TempPressure", "_txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.print("The weather has changed. Temperature = " + temp + ", Pressure = " + presser);
            printWriter.println();
            printWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
