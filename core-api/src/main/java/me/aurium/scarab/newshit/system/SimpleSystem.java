package me.aurium.scarab.newshit.system;

public interface SimpleSystem extends UniverseSystem<Void> {

    @Override
    default boolean isSimple() {
        return true;
    }
}
