package com.eventsender.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Brian Doyle
 */

public class Event {

    private String name;
    private String description;
    private int eventId;
    private static int nextId = 1;

    public Event(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public Event() {
        eventId = nextId;
        nextId++;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}