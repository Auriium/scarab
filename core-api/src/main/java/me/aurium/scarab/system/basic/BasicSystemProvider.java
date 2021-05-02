package me.aurium.scarab.system.basic;

import me.aurium.scarab.Node;
import me.aurium.scarab.system.SystemProvider;
import me.aurium.scarab.system.UniverseSystem;

public interface BasicSystemProvider<T> extends SystemProvider {

    BasicCondition getCondition();
    void getConsumer(Node node, T t);

    @Override
    default UniverseSystem<?> produceSystem() {
        return new BasicSystem<>(getCondition(),this::getConsumer);
    }
}
