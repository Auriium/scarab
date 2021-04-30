package me.aurium.scarab.newshit.system;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * Represents a SimpleSystem that allows the use of typed input through a queue of submitted objects
 * @param <T>
 */
/*
public abstract class QueueSystem<T extends AspectData> implements SimpleSystem {

    private final Queue<T> inputQueue = new LinkedList<>();
    private final Class<T> inputData;

    public QueueSystem(Class<T> inputData) {
        this.inputData = inputData;
    }

    @Override
    public Set<Class<? extends AspectData>> acceptedComponents() {
        return Set.of(inputData);
    }

    @Override
    public void consume(Node node, Void consumable) {
        for (T t : inputQueue) {
            consume(node,consumable);
        }
    }

    void submit(T data) {
        inputQueue.add(data);
    }

    abstract void consume(Node node, T t);
}
*/
