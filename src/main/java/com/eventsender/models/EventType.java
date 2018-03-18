package com.eventsender.models;
/**
 * Created by Brian Doyle
 */
public enum EventType {

    MANDATORY ("Mandatory"),
    OPTIONAL ("Optional");

    private final String name;

    EventType(String name){

        this.name = name;
    }

    public String getName() {
        return name;
    }

}
