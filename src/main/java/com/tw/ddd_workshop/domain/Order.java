package com.tw.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private UUID id = UUID.randomUUID();
    private List<Product> products = new ArrayList<>();
    double totalProductCost = 0.0d;
    double totalWeightInGram = 0.0d;
    public Order(List<Product> products) {
        this.products.addAll(products);
        products.forEach(product->  {
            totalWeightInGram +=product.getWeightInGram();
            totalProductCost+=product.getPrice().getValue();
        });
    }

    public int getNumberOfproducts() {
       return this.products.size();
    }

    public List<Product> getProducts() {
        return products;
    }
    public double getOrderCostAlongWithTransportation(double transportCostPerGram) {
        return totalProductCost + totalWeightInGram *transportCostPerGram;
    }
}
