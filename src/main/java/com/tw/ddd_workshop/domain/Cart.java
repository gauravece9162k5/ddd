package com.tw.ddd_workshop.domain;

import com.tw.ddd_workshop.event.ItemAddedToCartEvent;
import com.tw.ddd_workshop.event.ItemRemovedFromCartEvent;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Cart {
    private UUID id = UUID.randomUUID();
    private List<Item> items = new ArrayList<>();
    private List<Item> deletedItemsList = new ArrayList<>();

    public void add(Item item) {
        items.add(item);
        new ItemAddedToCartEvent(item);
    }

    public void remove(Item item) {
        if (items.remove(item)) {
            new ItemRemovedFromCartEvent(item);
            deletedItemsList.add(item);
        }
    }

    public void remove(Product product) {
        List<Item> toBeRemovedItems = new ArrayList<>();
        for (Item item : items) {
            if (item.getProduct().equals(product)) {
                toBeRemovedItems.add(item);
                deletedItemsList.add(item);
            }
        }
        toBeRemovedItems.forEach(item -> new ItemRemovedFromCartEvent(item));
        items.removeAll(toBeRemovedItems);
    }

    public Order checkout() {
        List<Product> products = new ArrayList<>();
        for (Item item : items) {
            for (int i = 1; i <= item.getQuantity(); i++) {
                products.add(item.getProduct());
            }
        }
        List<Item> toBeRemovedItems = new ArrayList<>();
        toBeRemovedItems.addAll(items);
        toBeRemovedItems.forEach(item -> remove(item));
        toBeRemovedItems.clear();


        return new Order(products);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return id.equals(cart.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
