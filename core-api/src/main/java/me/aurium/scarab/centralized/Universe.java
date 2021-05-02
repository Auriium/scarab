package me.aurium.scarab.centralized;

import me.aurium.scarab.Node;
import me.aurium.scarab.system.UniverseSystem;

public interface Universe {

    /**
     * Pulses all simple systems using the specified node
     * @param node the node
     */
    void pulseSimple(Node node);

    /**
     * Pulses a specific system using
     * @param node
     * @param system
     * @param input
     * @param <C>
     * @param <T>
     */
    <C,T extends UniverseSystem<C>> void pulseSpecific(Node node, Class<T> system, C input);
}
