package com.tw.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id = UUID.randomUUID();
    private List<Product> products = new ArrayList<>();
    public Order(List<Product> products) {
        this.products.addAll(products);
    }

    public int getNumberOfproducts() {
       return this.products.size();
    }

    public List<Product> getProducts() {
        return products;
    }
}
