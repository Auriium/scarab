package me.aurium.scarab.newshit.system;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.Node;
import me.aurium.scarab.newshit.system.condition.SystemCondition;

import java.util.Set;

public interface UniverseSystem<T> {

    SystemCondition acceptedComponents();
    boolean isSimple();

    void consume(Node node, T object);

}
