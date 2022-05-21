package com.tw.ddd_workshop.event;

import com.tw.ddd_workshop.domain.Item;

public class ItemAddedToCartEvent extends Event {
    public ItemAddedToCartEvent(Item item) {
        super("ItemAddedToCartEvent", item);
    }

    public Item getItemAddedToCartEvent(){
        return (Item) payload;
    }
}
