package com.tw.ddd_workshop.event.util;

import com.tw.ddd_workshop.event.Event;
/**
 * Handles the events
 */
public interface EventHandler {
    public void handle(Event event);
}


