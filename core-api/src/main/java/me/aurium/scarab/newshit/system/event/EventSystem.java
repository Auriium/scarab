package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.Node;
import me.aurium.scarab.newshit.system.InputSystem;
import me.aurium.scarab.newshit.system.System;
import me.aurium.scarab.newshit.system.event.EventConsumer;

import java.util.Set;
import java.util.function.Consumer;

/**
 * A clean system that only provides access to the aspect data and not the entire fucking node, plus the event requested.
 * @param <T>
 */
public class EventSystem<T extends AspectData> implements InputSystem<Event> {



    @Override
    public void consume(Node node, Event consumable) {

    }

    @Override
    public Set<Class<? extends AspectData>> acceptedComponents() {
        return null;
    }
}
