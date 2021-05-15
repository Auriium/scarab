package me.aurium.scarab.experimental.test;

import me.aurium.scarab.experimental.component.AbstractComponent;

public class SwordComponent extends AbstractComponent<SwordAspect,SwordFacet> {

    private final BladeComponent bladeComponent;

    public SwordComponent(SwordAspect aspect, SwordFacet facet, BladeComponent bladeComponent) {
        super(aspect, facet);

        this.bladeComponent = bladeComponent;
    }


}
