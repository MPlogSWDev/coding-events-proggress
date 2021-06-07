package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.ui.Model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
//place to put things
    private static final Map<Integer, Event> events = new HashMap<>();

    //get all events
    public static Collection<Event> getAll() {
        return events.values();
    }


    //get a single event
    //TODO does it need to be changed?
    public static Event getId( int id) {

        return events.get(id);
    }

    //add an event
    public static void add(Event event) {
        events.put(event.getId(), event);
    }
// remove an event
    public static void remove(int id) {
        events.remove(id);
    }

}
