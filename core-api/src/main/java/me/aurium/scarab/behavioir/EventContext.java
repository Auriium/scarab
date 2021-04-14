package me.aurium.scarab.behavioir;

import me.aurium.scarab.model.ModifierContext;

import java.util.function.Consumer;

public interface EventContext extends ModifierContext {

    <E extends Event> void registerListener(Class<E> eventType, Consumer<E> listener, int priority);
}
