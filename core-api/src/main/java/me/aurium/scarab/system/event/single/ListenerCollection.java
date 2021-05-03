package me.aurium.scarab.system.event.single;

import me.aurium.scarab.AspectData;
import me.aurium.scarab.system.event.Event;
import me.aurium.scarab.system.event.EventConsumer;

import java.util.Map;

public class ListenerCollection<T extends AspectData> {

    public <E extends Event> ListenerCollection<T> registerEvent(Class<E> eventType, EventConsumer<T, E> listener, int priority) {
        return this;
    }

    public <E extends Event> Map<Class<E>, EventConsumer<T, E>> asMap() {
        return null;
    }
}
