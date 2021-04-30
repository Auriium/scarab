package me.aurium.scarab.newshit;

import me.aurium.scarab.newshit.system.UniverseSystem;

public interface BasicSystem<T> extends UniverseSystem<T> {

    @Override
    default boolean isSimple() {
        return false;
    }
}
