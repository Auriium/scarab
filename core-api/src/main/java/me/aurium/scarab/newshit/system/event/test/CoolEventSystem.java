package me.aurium.scarab.newshit.system.event.test;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.system.event.EventSystem;
import me.aurium.scarab.newshit.system.event.EventSystemInitializer;
import me.aurium.scarab.newshit.system.event.ListenerCollection;

public class CoolEventSystem extends EventSystemInitializer<CoolAspect> {

    protected CoolEventSystem() {
        super(CoolAspect.class);
    }

    @Override
    public ListenerCollection<CoolAspect> getCollection(ListenerCollection<CoolAspect> collection) {
        collection.registerEvent(CoolEvent.class,)

        return collection;
    }

    public static class cum extends EventSystem<CoolAspect> {

        protected cum() {
            super(CoolAspect.class, new ListenerCollection<CoolAspect>()
                    .registerEvent(CoolEvent.class,cum::eat,1)
            );
        }

        public static void eat(CoolAspect aspect, CoolEvent event) {

        }
    }
}
