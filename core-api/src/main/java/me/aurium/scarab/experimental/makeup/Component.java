package me.aurium.scarab.experimental.makeup;

import me.aurium.scarab.experimental.makeup.Aspect;
import me.aurium.scarab.experimental.makeup.Facet;
import me.aurium.scarab.experimental.makeup.SlotMap;

public interface Component<A extends Aspect, F extends Facet> {

    A getAspect();
    F getFacet();

}
