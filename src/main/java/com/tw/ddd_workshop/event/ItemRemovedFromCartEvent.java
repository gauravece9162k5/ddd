package com.tw.ddd_workshop.event;

import com.tw.ddd_workshop.domain.Item;

public class ItemRemovedFromCartEvent extends Event {
    public ItemRemovedFromCartEvent(Item item) {
        super("ItemRemovedFromCartEvent", item);
    }
}
