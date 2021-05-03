package me.aurium.scarab.system.condition;

import me.aurium.scarab.AspectData;
import me.aurium.scarab.Node;

import java.util.Set;

public abstract class AbstractCondition implements SystemCondition {

    private final Set<Class<? extends AspectData>> withComponents;
    private final Set<Class<? extends AspectData>> withoutComponents;
    private final Set<Class<? extends AspectData>> withChildComponents;
    private final Set<Class<? extends AspectData>> withoutChildComponents;

    protected AbstractCondition(Set<Class<? extends AspectData>> withComponents, Set<Class<? extends AspectData>> withoutComponents, Set<Class<? extends AspectData>> withChildComponents, Set<Class<? extends AspectData>> withoutChildComponents) {
        this.withComponents = withComponents;
        this.withoutComponents = withoutComponents;
        this.withChildComponents = withChildComponents;
        this.withoutChildComponents = withoutChildComponents;
    }

    protected abstract boolean primaryAcceptableCheck(Node node);

    @Override
    public boolean isAcceptable(Node node) {
        if (!primaryAcceptableCheck(node)) {
            return false;
        }

        for (Class<? extends AspectData> num : withComponents) {
            if (!node.hasAspect(num)) return false;
        }

        for (Class<? extends AspectData> num : withoutComponents) {
            if (node.hasAspect(num)) return false;
        }

        for (Class<? extends AspectData> num : withChildComponents) {
            if (!node.hasAspectIncludingChildren(num)) return false;
        }

        for (Class<? extends AspectData> num : withoutChildComponents) {
            if (node.hasAspectIncludingChildren(num)) return false;
        }

        return true;
    }
}
