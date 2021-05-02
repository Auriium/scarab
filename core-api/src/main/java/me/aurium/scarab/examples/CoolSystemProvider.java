package me.aurium.scarab.examples;

import me.aurium.scarab.Node;
import me.aurium.scarab.system.basic.BasicCondition;
import me.aurium.scarab.system.basic.BasicSystemProvider;

public class CoolSystemProvider implements BasicSystemProvider<String> {

    @Override
    public BasicCondition getCondition() {
        return null;
    }

    @Override
    public void getConsumer(Node node, String t) {

    }


    /*@Override
    public UniverseSystem<?> produceSystem() {
        return new SingleEventSystem.Builder<>(new SingleEventCondition.Builder<>(CoolAspect.class)
                .addInclusiveComponents(OtherAspect.class).build())
                .withListener(CoolEvent.class, this::onCoolEvent,1)
                .withListener(Event.class, this::onBaseEvent, 1)
                .build();
    }

    protected void onCoolEvent(CoolAspect aspect, CoolEvent event) {

    }

    protected void onBaseEvent(CoolAspect aspect, Event event) {

    }*/

}
