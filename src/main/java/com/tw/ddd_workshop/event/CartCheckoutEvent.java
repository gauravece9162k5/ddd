package com.tw.ddd_workshop.event;

import com.tw.ddd_workshop.domain.Item;
import com.tw.ddd_workshop.domain.Product;

import java.util.List;

public class CartCheckoutEvent extends Event {
    public CartCheckoutEvent(List<Product> products) {
        super("CartCheckout", products);
    }

    public List<Product> getProducts(){
        return (List<Product>) payload;
    }
}
