package com.example.gfl_patterns.builder;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class SomeObject {

    private final String string;
    private final Long aLong;
    private final Integer integer;
    private final Double aDouble;
    private final BigDecimal bigDecimal;

    public SomeObject(String string,
                      Long aLong,
                      Integer integer,
                      Double aDouble,
                      BigDecimal bigDecimal) {
        this.string = string;
        this.aLong = aLong;
        this.integer = integer;
        this.aDouble = aDouble;
        this.bigDecimal = bigDecimal;
    }
}
