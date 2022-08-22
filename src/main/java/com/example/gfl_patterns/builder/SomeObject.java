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

    public static class Builder {

        private String string;
        private Long aLong;
        private Integer integer;
        private Double aDouble;
        private BigDecimal bigDecimal;

        public Builder() {  }

        public SomeObject build() {
            return new SomeObject(string, aLong, integer, aDouble, bigDecimal);
        }

        public Builder setString(String string) {
            this.string = string;
            return this;
        }

        public Builder setLong(Long aLong) {
            this.aLong = aLong;
            return this;
        }

        public Builder setInteger(Integer integer) {
            this.integer = integer;
            return this;
        }

        public Builder setDouble(Double aDouble) {
            this.aDouble = aDouble;
            return this;
        }

        public Builder setBigDecimal(BigDecimal bigDecimal) {
            this.bigDecimal = bigDecimal;
            return this;
        }
    }
}
