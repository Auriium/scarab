package me.aurium.scarab.newshit.system;

import me.aurium.scarab.newshit.AspectData;

import java.util.Set;

public interface System {

    /**
     * Gets a set of all accepted data types that this system uses
     * @return said set
     */
    Set<Class<? extends AspectData>> acceptedComponents();

}
