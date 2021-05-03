package me.aurium.scarab.examples;

import me.aurium.scarab.system.event.single.ListenerCollection;
import me.aurium.scarab.system.event.single.SingleCondition;
import me.aurium.scarab.system.event.single.SingleEventProvider;

public class Test implements SingleEventProvider<CoolAspect> {
    @Override
    public ListenerCollection<CoolAspect> createListeners() {
        return new ListenerCollection<CoolAspect>()
                .registerEvent(CoolEvent.class, this::onEvent, 1);
    }

    @Override
    public SingleCondition<CoolAspect> createConditions() {
        return new SingleCondition.Builder<>(CoolAspect.class)
                .addInclusiveComponents(CoolAspect.class).build();
    }

    public void onEvent(CoolAspect aspect, CoolEvent event) {

    }
}
