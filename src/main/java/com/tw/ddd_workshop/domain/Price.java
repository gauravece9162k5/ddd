package com.tw.ddd_workshop.domain;

import java.util.Currency;

public class Price {
    double value;
    Currency currency;

    public Price(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }
    public Price(double value) {
        this(value,Currency.getInstance("USD"));
    }

    public double getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Price ReduceByPercent(float percent) {
        return new Price(percent*value,currency);
    }
}
