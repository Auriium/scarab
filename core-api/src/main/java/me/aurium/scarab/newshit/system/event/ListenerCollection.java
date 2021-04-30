package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;

import java.util.Map;

public class ListenerCollection<T extends AspectData> {

    public <E extends Event> ListenerCollection<T> registerEvent(Class<E> eventType, EventConsumer<T, E> listener, int priority) {
        return this;
    }

    public <E extends Event> Map<Class<E>, EventConsumer<T, E>> asMap() {
        return null;
    }
}
