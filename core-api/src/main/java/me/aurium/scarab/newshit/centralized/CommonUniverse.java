package me.aurium.scarab.newshit.centralized;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.ItemNode;
import me.aurium.scarab.newshit.Node;
import me.aurium.scarab.newshit.WalkStrategy;
import me.aurium.scarab.newshit.system.QueueSystem;
import me.aurium.scarab.newshit.system.UniverseSystem;

import java.util.Set;

public class CommonUniverse implements Universe, QueueAccessor {

    private final Set<UniverseSystem<?>> universeSystems;
    private final WalkStrategy strategy;

    public CommonUniverse(Set<UniverseSystem<?>> universeSystems, WalkStrategy strategy) {
        this.universeSystems = universeSystems;
        this.strategy = strategy;
    }


    @Override
    public void pulseSimple(Node node) {

    }

    @Override
    public <C, T extends UniverseSystem<C>> void pulseSpecific(Node node, Class<T> system, C input) {

    }

    @Override
    public <T extends AspectData, C extends QueueSystem<T>> void submit(Class<C> clazz, T data) {

    }
}
