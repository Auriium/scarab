package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.BasicSystem;
import me.aurium.scarab.newshit.Node;

import java.util.Set;

public class ReduxSystem implements BasicSystem<Event> {

    private final Class<? extends AspectData> aClass;

    public ReduxSystem(Class<? extends AspectData> aClass) {
        this.aClass = aClass;
    }

    @Override
    public Set<Class<? extends AspectData>> acceptedComponents() {
        return null;
    }

    @Override
    public void consume(Node node, Event object) {

    }
}
