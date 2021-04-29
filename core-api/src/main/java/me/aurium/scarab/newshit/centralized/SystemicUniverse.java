package me.aurium.scarab.newshit.centralized;

import me.aurium.scarab.newshit.ItemNode;
import me.aurium.scarab.newshit.WalkStrategy;
import me.aurium.scarab.newshit.system.System;

import java.util.Set;

public class SystemicUniverse implements Universe {

    private final Set<System<?>> systems;
    private final WalkStrategy strategy;

    public SystemicUniverse(Set<System<?>> systems, WalkStrategy strategy) {
        this.systems = systems;
        this.strategy = strategy;
    }

    @Override
    public void pulseSystems(ItemNode node) {
        //Iterate over the node's components, fire them into their respective systems. Repeat over node's children.
    }
}
