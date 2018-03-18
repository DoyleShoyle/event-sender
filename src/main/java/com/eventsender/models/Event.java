package com.eventsender.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Brian Doyle
 */

@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=40, message = "Please enter an Event Name")
    private String name;

    @NotNull
    @Size(min=1, message = "Please enter a Description")
    private String description;

    private EventType type;

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Event() { }

    public int getId() {
        return id;
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

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }
}