package me.aurium.scarab.newshit.system;

import me.aurium.scarab.AspectIdentifier;
import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.Node;

import java.util.Set;

public interface UniverseSystem<T> {

    Set<Class<? extends AspectData>> acceptedComponents();
    boolean isSimple();

    void consume(Node node, T object);

}
