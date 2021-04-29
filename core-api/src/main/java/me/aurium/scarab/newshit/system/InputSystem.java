package me.aurium.scarab.newshit.system;

import me.aurium.scarab.newshit.Node;

public interface InputSystem<T> extends System {

    void consume(Node node, T consumable);

}
