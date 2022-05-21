package com.tw.ddd_workshop;

import com.tw.ddd_workshop.domain.Cart;
import com.tw.ddd_workshop.domain.Item;
import com.tw.ddd_workshop.domain.Product;

public class Application {

    public static void main(String[] args) {
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Item item1 = new Item(new Product("Sony Wireless headphone"), 1);
        Item item2 = new Item(new Product("Sony Wireless headphone"), 1);
        cart1.add(item1);
        cart2.add(item2);
        System.out.println(cart1.equals(cart2));// should return false

        System.out.println(cart1.equals(cart1));  // return true

        System.out.println(cart2.equals(cart2)); //should return true


    }
}