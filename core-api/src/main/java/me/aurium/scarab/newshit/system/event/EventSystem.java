package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.BasicSystem;
import me.aurium.scarab.newshit.Node;

import java.util.Set;

/**
 * A clean system that only provides access to the aspect data and not the entire fucking node, plus the event requested.
 * @param <T>
 */
public class EventSystem<T extends AspectData> implements BasicSystem<Event> {

    private final Class<T> aspectClass;
    private final ListenerCollection<T> listeners;

    protected EventSystem(Class<T> aspectClass, ListenerCollection<T> listeners) {
        this.aspectClass = aspectClass;
        this.listeners = listeners;
    }

    @Override
    public Set<Class<? extends AspectData>> acceptedComponents() {
        return Set.of(aspectClass);
    }

    @Override
    public void consume(Node node, Event consumable) {
        listeners.asMap().forEach((eventClass, consumer) -> {
            if (eventClass.isInstance(consumable) && node.uglyAccess(aspectClass).isPresent()) {
                consumer.consume(node.uglyAccess(aspectClass).get(),consumable);
            }
        });
    }
}
