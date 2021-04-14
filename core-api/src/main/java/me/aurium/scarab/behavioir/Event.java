package me.aurium.scarab.behavioir;

import me.aurium.scarab.statmap.StatMap;

/**
 * Represents an interaction involving something that has a statmap
 */
public interface Event {

    /**
     * Gets the fully modified statistic mapping (post-modifications)
     * @return
     */
    StatMap getStats();

}
