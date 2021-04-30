package me.aurium.scarab.newshit;

import java.util.Optional;

public interface Node {

    /**
     * Attempt to ugly access a data that is potentially located at this node
     *
     * clazz simply is used to the hashcode of itself for the node's internal aspect storage
     *
     * @param clazz class of type T
     * @param <T> data attempting to access
     * @return the data if present (optional)
     */
    <T extends AspectData> Optional<T> uglyAccess(Class<T> clazz);

    /**
     * Checks if the node contains an aspect (typically compares hashcode)
     * @param clazz class hashcode
     * @param <T> type
     * @return whether it contains it or not
     */
    <T extends AspectData> boolean hasAspect(int clazz);

    /**
     * Checks if the node contains an aspect in itself or on its children
     * @param clazz class hashcode
     * @param <T> type
     * @return whether it is contained orn ot
     */
    <T extends AspectData> boolean hasAspectIncludingChildren(int clazz);

}
