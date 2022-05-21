package com.tw.ddd_workshop;

import com.tw.ddd_workshop.domain.*;
import com.tw.ddd_workshop.domain.bank.Account;
import com.tw.ddd_workshop.domain.bank.Address;
import com.tw.ddd_workshop.domain.bank.Customer;
import com.tw.ddd_workshop.domainservice.CompetitorPricingStrategy;

import java.util.Currency;
import java.util.List;

public class RetailApplication {

    public static void main(String[] args) {

        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Item item1 = new Item(new Product("Sony Wireless headphone",new Price(10, Currency.getInstance("USD")),10D), 3);
        Item item2 = new Item(new Product("Sony Wireless headphone",new Price(20, Currency.getInstance("USD")),10d), 1);
        cart1.add(item1);
        cart2.add(item2);

        //Problem 8
        Price discountedPrice = CompetitorPricingStrategy.getDiscountPrice("Apple Pencil",20D);
        cart1.add(new Item(new Product("Apple Pencil",discountedPrice,10d)));
        System.out.println(cart1.equals(cart2));// should return false
        System.out.println(cart1.equals(cart1));  // return true
        System.out.println(cart2.equals(cart2)); //should return true

        //Problem 9
        List<Product> products = cart1.checkout();
        Order order = new Order(products);
        order.getOrderCostAlongWithTransportation(0.1);
        System.out.println(cart1.isEmpty());// return true
    }
}
