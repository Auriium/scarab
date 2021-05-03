package me.aurium.scarab.system;

import me.aurium.scarab.Node;
import me.aurium.scarab.system.condition.SystemCondition;

public interface UniverseSystem<T> {

    /**
     * A condition of required aspects on the specific targeted node in order for the system to process that node
     * @return the system used
     */
    SystemCondition acceptedAspects();

    /**
     * Checks if the node is ""simple"" or not (can be fired by the universe's no-args pulseSimple)
     * @return whether it is simple or not
     */
    default boolean isSimple() {
        return false;
    };

    /**
     * The action taken when a node is found to have the correct aspects
     * @param node
     * @param object
     */
    void consume(Node node, T object);

}
