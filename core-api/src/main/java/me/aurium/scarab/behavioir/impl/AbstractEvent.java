package me.aurium.scarab.behavioir.impl;

import me.aurium.scarab.behavioir.Event;
import me.aurium.scarab.statmap.StatMap;

public class AbstractEvent implements Event {

    private final StatMap map;

    public AbstractEvent(StatMap map) {
        this.map = map;
    }

    public StatMap getStats() {
        return map;
    }
}
