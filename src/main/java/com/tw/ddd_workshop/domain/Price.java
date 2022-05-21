package com.tw.ddd_workshop.domain;

import java.util.Currency;

public class Price {
    float value;
    Currency currency;

    public Price(float value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public float getValue() {
        return value;
    }

    public Currency getCurrency() {
        return currency;
    }
}
