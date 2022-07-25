package com.example.gfl_patterns.builder;

import java.math.BigDecimal;

public class SomeObjectBuilder {

    private String string;
    private Long aLong;
    private Integer integer;
    private Double aDouble;
    private BigDecimal bigDecimal;

    public static SomeObjectBuilder builder() {
        return new SomeObjectBuilder();
    }

    public SomeObject build() {
        return new SomeObject(string, aLong, integer, aDouble, bigDecimal);
    }

    public SomeObjectBuilder setString(String string) {
        this.string = string;
        return this;
    }

    public SomeObjectBuilder setLong(Long aLong) {
        this.aLong = aLong;
        return this;
    }

    public SomeObjectBuilder setInteger(Integer integer) {
        this.integer = integer;
        return this;
    }

    public SomeObjectBuilder setDouble(Double aDouble) {
        this.aDouble = aDouble;
        return this;
    }

    public SomeObjectBuilder setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
        return this;
    }
}
