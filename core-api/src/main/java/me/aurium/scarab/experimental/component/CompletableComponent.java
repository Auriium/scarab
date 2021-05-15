package me.aurium.scarab.experimental.component;

import me.aurium.scarab.experimental.makeup.Aspect;
import me.aurium.scarab.experimental.makeup.Component;
import me.aurium.scarab.experimental.makeup.Facet;
import me.aurium.scarab.experimental.Slot;

import java.util.Set;

/**
 * Represents a component that has slots and can be completed
 */
public interface CompletableComponent<A extends Aspect,F extends Facet> extends Component<A,F> {

    Set<Slot<Component<?,? extends F>>> children();

    /**
     * Checks whether all required slots are full
     * @return whether they are full
     */
    boolean isComplete();

    /**
     * Checks if all slots (including optional ones) are full
     * @return whether they are full
     */
    boolean isFull();

}
