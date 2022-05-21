package com.tw.ddd_workshop;

import com.tw.ddd_workshop.domain.Cart;
import com.tw.ddd_workshop.domain.Item;
import com.tw.ddd_workshop.domain.Price;
import com.tw.ddd_workshop.domain.Product;
import com.tw.ddd_workshop.domain.bank.Account;
import com.tw.ddd_workshop.domain.bank.Address;
import com.tw.ddd_workshop.domain.bank.Customer;
import com.tw.ddd_workshop.domainservice.CompetitorPricingStrategy;

import java.util.Currency;

public class BankApplication {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Gaurav",new Address("Delhi"));
        customer1.linkAccount(new Account(customer1.getAddress()));
        customer1.updateAddress(new Address("Banglore"));
    }
}
