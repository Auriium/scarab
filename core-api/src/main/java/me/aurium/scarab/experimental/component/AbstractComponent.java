package me.aurium.scarab.experimental.component;

import me.aurium.scarab.experimental.makeup.Aspect;
import me.aurium.scarab.experimental.makeup.Component;
import me.aurium.scarab.experimental.makeup.Facet;

public abstract class AbstractComponent<A extends Aspect,F extends Facet> implements Component<A,F> {

    private final A aspect;
    private final F facet;

    protected AbstractComponent(A aspect, F facet) {
        this.aspect = aspect;
        this.facet = facet;
    }

    @Override
    public A getAspect() {
        return aspect;
    }

    @Override
    public F getFacet() {
        return facet;
    }
}
