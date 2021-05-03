package me.aurium.scarab.system.condition;

import me.aurium.scarab.AspectData;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractConditionBuilder {

    private final Set<Class<? extends AspectData>> withComponents = new HashSet<>();
    private final Set<Class<? extends AspectData>> withoutComponents = new HashSet<>();
    private final Set<Class<? extends AspectData>> withChildComponents = new HashSet<>();
    private final Set<Class<? extends AspectData>> withoutChildComponents = new HashSet<>();

    @SafeVarargs
    public final AbstractConditionBuilder addInclusiveComponents(Class<? extends AspectData>... components) {
        Collections.addAll(withComponents, components);

        return this;
    }

    @SafeVarargs
    public final AbstractConditionBuilder addExclusiveComponents(Class<? extends AspectData>... components) {
        Collections.addAll(withoutComponents, components);

        return this;
    }

    @SafeVarargs
    public final AbstractConditionBuilder addInclusiveChildren(Class<? extends AspectData>... components) {
        Collections.addAll(withChildComponents, components);

        return this;
    }

    @SafeVarargs
    public final AbstractConditionBuilder addExclusiveChildren(Class<? extends AspectData>... components) {
        Collections.addAll(withoutChildComponents, components);

        return this;
    }

    abstract SystemCondition build();

}
