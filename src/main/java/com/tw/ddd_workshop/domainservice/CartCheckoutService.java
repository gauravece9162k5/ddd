package com.tw.ddd_workshop.domainservice;

import com.tw.ddd_workshop.domain.Cart;
import com.tw.ddd_workshop.domain.Product;
import com.tw.ddd_workshop.event.CartCheckoutEvent;
import com.tw.ddd_workshop.event.util.EventBus;

import java.util.List;

public class CartCheckoutService {
    public CartCheckoutService() {
    }
    public void checkout(Cart cart) {
        List<Product> products = cart.checkout();
        EventBus.raise(new CartCheckoutEvent(products));
    }
}
