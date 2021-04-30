package me.aurium.scarab.newshit.centralized;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.system.QueueSystem;

/**
 * Managed accessor to a queuesystem that submits to it.
 */
public interface QueueAccessor {

    /**
     * Submits data into the queue of a specific
     * @param clazz
     * @param data
     * @param <T>
     * @param <C>
     */
    <T extends AspectData,C extends QueueSystem<T>> void submit(Class<C> clazz, T data);

}
