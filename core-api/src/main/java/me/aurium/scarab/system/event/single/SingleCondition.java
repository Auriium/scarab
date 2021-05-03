package me.aurium.scarab.system.event.single;

import me.aurium.scarab.AspectData;
import me.aurium.scarab.Node;
import me.aurium.scarab.system.condition.AbstractCondition;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SingleCondition<T extends AspectData> extends AbstractCondition {

    public Class<T> primaryAspect() {
        return clazz;
    }

    private final Class<T> clazz;

    protected SingleCondition(Set<Class<? extends AspectData>> withComponents, Set<Class<? extends AspectData>> withoutComponents, Set<Class<? extends AspectData>> withChildComponents, Set<Class<? extends AspectData>> withoutChildComponents, Class<T> clazz) {
        super(withComponents, withoutComponents, withChildComponents, withoutChildComponents);
        this.clazz = clazz;
    }

    @Override
    protected boolean primaryAcceptableCheck(Node node) {
        return node.hasAspect(clazz);
    }

    public static class Builder<T extends AspectData> {

        private final Class<T> primaryAspectHash;

        private final Set<Class<? extends AspectData>> withComponents = new HashSet<>();
        private final Set<Class<? extends AspectData>> withoutComponents = new HashSet<>();
        private final Set<Class<? extends AspectData>> withChildComponents = new HashSet<>();
        private final Set<Class<? extends AspectData>> withoutChildComponents = new HashSet<>();

        public Builder(Class<T> primaryAspectHash) {
            this.primaryAspectHash = primaryAspectHash;
        }

        @SafeVarargs
        public final Builder<T> addInclusiveComponents(Class<? extends AspectData>... components) {
            Collections.addAll(withComponents, components);

            return this;
        }

        @SafeVarargs
        public final Builder<T> addExclusiveComponents(Class<? extends AspectData>... components) {
            Collections.addAll(withoutComponents, components);

            return this;
        }

        @SafeVarargs
        public final Builder<T> addInclusiveChildren(Class<? extends AspectData>... components) {
            Collections.addAll(withChildComponents, components);

            return this;
        }

        @SafeVarargs
        public final Builder<T> addExclusiveChildren(Class<? extends AspectData>... components) {
            Collections.addAll(withoutChildComponents, components);

            return this;
        }

        public SingleCondition<T> build() {
            return new SingleCondition<>(withComponents,withoutComponents,withChildComponents,withoutChildComponents,primaryAspectHash);
        }
    }
}
