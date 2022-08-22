package com.example.gfl_patterns.builder;

import java.math.BigDecimal;

public class UsingExample {

    public static void main(String[] args) {
        new UsingExample().run();
    }

    private void run() {
        SomeObject someObject = new SomeObject.Builder()
                .setString("string")
                .setDouble(13.37)
                .setBigDecimal(BigDecimal.valueOf(1.337))
                .setLong(1337L)
                .setInteger(1337)
                .build();

        System.out.println(someObject);
    }
}
