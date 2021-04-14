package me.aurium.scarab.behavioir.func;

import me.aurium.scarab.behavioir.Behavior;

import java.util.function.Consumer;

public interface Registry {

    public <E extends Behavior> void registerListener(Class<E> eventType, Consumer<E> listener, int priority);
}
