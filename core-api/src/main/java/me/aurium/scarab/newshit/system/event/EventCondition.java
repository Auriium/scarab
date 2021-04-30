package me.aurium.scarab.newshit.system.event;

import me.aurium.scarab.newshit.AspectData;
import me.aurium.scarab.newshit.Node;
import me.aurium.scarab.newshit.system.condition.SystemCondition;

public class EventCondition implements SystemCondition {

    private final Class<? extends AspectData> primaryAspectHash;

    private final int[] withComponents;
    private final int[] withoutComponents;
    private final int[] withChildComponents;
    private final int[] withoutChildComponents;

    public EventCondition(Class<? extends AspectData> primaryAspectHash, int[] withComponents, int[] withoutComponents, int[] withChildComponents, int[] withoutChildComponents) {
        this.primaryAspectHash = primaryAspectHash;
        this.withComponents = withComponents;
        this.withoutComponents = withoutComponents;
        this.withChildComponents = withChildComponents;
        this.withoutChildComponents = withoutChildComponents;
    }


    @Override
    public boolean isAcceptable(Node node) {
        if (!node.hasAspect(primaryAspectHash.hashCode())) {
            return false;
        }

        for (Integer num : withComponents) {
            if (!node.hasAspect(num)) return false;
        }

        for (Integer num : withoutComponents) {
            if (node.hasAspect(num)) return false;
        }

        for (Integer num : withChildComponents) {
            if (!node.hasAspectIncludingChildren(num)) return false;
        }

        for (Integer num : withoutChildComponents) {
            if (node.hasAspectIncludingChildren(num)) return false;
        }

        return true;
    }

    public static class Builder {

    }
}
