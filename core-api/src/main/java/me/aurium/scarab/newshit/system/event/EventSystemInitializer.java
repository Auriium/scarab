package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;

public abstract class EventSystemInitializer<T extends AspectData> {

    private final Class<T> data;

    protected EventSystemInitializer(Class<T> data) {
        this.data = data;
    }

    public Class<T> getData() {
        return data;
    }

    public abstract ListenerCollection<T> getCollection(ListenerCollection<T> collection);

}
