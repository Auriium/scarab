package me.aurium.scarab.system.event.single;

import me.aurium.scarab.AspectData;
import me.aurium.scarab.Node;
import me.aurium.scarab.system.UniverseSystem;
import me.aurium.scarab.system.condition.SystemCondition;
import me.aurium.scarab.system.event.Event;

/**
 * A clean system that only provides access to the aspect data and not the entire fucking node, plus the event requested.
 * @param <T>
 */
public class SingleEventSystem<T extends AspectData> implements UniverseSystem<Event> {

    private final ListenerCollection<T> listeners;
    private final SingleCondition<T> condition;
    private final Class<T> aspectClass;

    SingleEventSystem(SingleCondition<T> condition, ListenerCollection<T> listeners) {
        this.condition = condition;
        this.listeners = listeners;
        this.aspectClass = condition.primaryAspect();
    }

    @Override
    public SystemCondition acceptedAspects() {
        return condition;
    }

    @Override
    public void consume(Node node, Event consumable) {
        listeners.asMap().forEach((eventClass, consumer) -> {
            if (eventClass.isInstance(consumable) && node.uglyAccess(aspectClass).isPresent()) {
                consumer.consume(node.uglyAccess(aspectClass).get(),consumable);
            }
        });
    }

    /*public static class Builder<T extends AspectData> {
        private final ListenerCollection<T> collection;
        private final SingleEventCondition<T> condition;

        public Builder(SingleEventCondition<T> condition) {
            this.condition = condition;
            this.collection = new ListenerCollection<>();
        }

        public <E extends Event> Builder<T> withListener(Class<E> eventType, EventConsumer<T, E> listener, int priority) {
            collection.registerEvent(eventType,listener,priority);

            return this;
        }

        public BasicSystem<?> build() {
            return new SingleEventSystem<>(condition, collection);
        }
    }*/


}
