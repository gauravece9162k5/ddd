package com.tw.ddd_workshop.domain.bank;

import java.util.UUID;

public class Account {
    UUID accountNumber = UUID.randomUUID();
    Address address;

    public Account(Address address) {
        this.address = address;
    }
    public void updateAddress(Address address) {
        this.address = address;
    }
}
