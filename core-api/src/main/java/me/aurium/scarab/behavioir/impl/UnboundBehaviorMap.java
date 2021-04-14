package me.aurium.scarab.behavioir.impl;

import me.aurium.scarab.behavioir.Event;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class UnboundBehaviorMap {

    private final Map<Class<? extends Event>,Consumer<? extends Event>> behaviors = new HashMap<>();

    <T extends Event> UnboundBehaviorMap register(Class<T> clazz, Consumer<T> consumer) {
        this.behaviors.put(clazz,consumer);

        return this;
    }




}
