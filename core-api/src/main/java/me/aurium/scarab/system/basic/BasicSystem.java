package me.aurium.scarab.system.basic;

import me.aurium.scarab.Node;
import me.aurium.scarab.system.UniverseSystem;
import me.aurium.scarab.system.condition.SystemCondition;

import java.util.function.BiConsumer;

public class BasicSystem<T> implements UniverseSystem<T> {

    private final SystemCondition condition;
    private final BiConsumer<Node,T> consumer;

    BasicSystem(SystemCondition condition, BiConsumer<Node, T> consumer) {
        this.condition = condition;
        this.consumer = consumer;
    }

    @Override
    public SystemCondition acceptedAspects() {
        return condition;
    }

    @Override
    public void consume(Node node, T object) {
        consumer.accept(node,object);
    }

}
