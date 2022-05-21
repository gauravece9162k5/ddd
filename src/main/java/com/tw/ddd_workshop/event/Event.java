package com.tw.ddd_workshop.event;

import com.tw.ddd_workshop.domain.Item;

abstract public class Event {
    public final String  id;
    public final long    createdAt;
    public final String  name;
    public final Object  payload;

    public Event(String name, Object payload) {
        this.id = "ID:"+System.currentTimeMillis();
        this.name = name;
        this.payload = payload;
        createdAt = System.currentTimeMillis();
    }

}
