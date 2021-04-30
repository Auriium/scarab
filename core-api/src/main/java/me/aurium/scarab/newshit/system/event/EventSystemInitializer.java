package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.BasicSystem;
import me.aurium.scarab.newshit.centralized.SystemProvider;

public class EventSystemInitializer<T extends AspectData> {

    private final Class<T> aspectClass;
    private final ListenerCollection<T> collection = new ListenerCollection<>();

    public EventSystemInitializer(Class<T> aspectClass) {
        this.aspectClass = aspectClass;
    }

    public <E extends Event> EventSystemInitializer<T> withListener(Class<E> eventType, EventConsumer<T, E> listener, int priority) {
        collection.registerEvent(eventType,listener,priority);

        return this;
    }

    public BasicSystem<?> produceSystem() {
        return new EventSystem<>(aspectClass,collection);
    }
}
