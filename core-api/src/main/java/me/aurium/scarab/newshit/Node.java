package me.aurium.scarab.newshit;

import java.util.Optional;

public interface Node {

    /**
     * Attempt to ugly access a data that is potentially located at this node
     * @param clazz class of type T
     * @param <T> data attempting to access
     * @return the data if present (optional)
     */
    <T extends AspectData> Optional<T> uglyAccess(Class<T> clazz);

}
