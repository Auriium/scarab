package me.aurium.scarab.newshit.system.event.test;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.BasicSystem;
import me.aurium.scarab.newshit.centralized.SystemProvider;
import me.aurium.scarab.newshit.system.event.Event;
import me.aurium.scarab.newshit.system.event.EventSystem;
import me.aurium.scarab.newshit.system.event.EventSystemInitializer;
import me.aurium.scarab.newshit.system.event.ListenerCollection;

public class CoolEventSystem implements SystemProvider {

    @Override
    public BasicSystem<?> produceSystem() {
        return new EventSystemInitializer<>(CoolAspect.class)
                .withListener(CoolEvent.class, this::onCoolEvent,1)
                .withListener(Event.class, this::onBaseEvent, 1)
                .produceSystem();
    }

    public void onCoolEvent(CoolAspect aspect, CoolEvent event) {

    }

    public void onBaseEvent(CoolAspect aspect, Event event) {

    }
}
