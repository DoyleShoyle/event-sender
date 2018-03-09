package com.eventsender.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by Brian Doyle
 */
@Controller
@RequestMapping("events")
public class EventController {

    static ArrayList<String> events = new ArrayList<>();

    //Request Path: /events
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("events", events);
        model.addAttribute("title", "Event Sender");
        return "events/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddEventForm(Model model){
        model.addAttribute("title", "Add Event" );
        return "events/add";

    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddEventForm(@RequestParam String eventName){
    events.add(eventName);

    //Redirect to /events
    return "redirect:";
    }
}
