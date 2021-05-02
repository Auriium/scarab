package me.aurium.scarab.system;

public interface SimpleSystem extends UniverseSystem<Void> {

    @Override
    default boolean isSimple() {
        return true;
    }
}
