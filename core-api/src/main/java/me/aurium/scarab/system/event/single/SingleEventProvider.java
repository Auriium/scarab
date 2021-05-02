package me.aurium.scarab.system.event.single;

import me.aurium.scarab.AspectData;
import me.aurium.scarab.system.SystemProvider;
import me.aurium.scarab.system.UniverseSystem;

public interface SingleEventProvider<T extends AspectData> extends SystemProvider {

    ListenerCollection<T> createListeners();
    SingleCondition<T> createConditions();

    @Override
    default UniverseSystem<?> produceSystem() {
        return new SingleEventSystem<>(createConditions(), createListeners());
    }
}
