package com.tw.ddd_workshop.domain.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {
    UUID id = UUID.randomUUID();
    String name;
    Address address;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    List<Account> accounts = new ArrayList<>();

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void linkAccount(Account account) {
        accounts.add(account);
    }

    public void updateAddress(Address address) {
        this.address = address;
        accounts.forEach(account->account.updateAddress(address));
    }
}
