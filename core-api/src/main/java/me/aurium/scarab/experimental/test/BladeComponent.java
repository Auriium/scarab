package me.aurium.scarab.experimental.test;

import me.aurium.scarab.experimental.component.AbstractComponent;

/**
 * A bladecomponent that will be slotted into a SwordComponent.
 *
 * If a system subscribed to BladeComponent and someone swung an item that was at it's base a SwordComponent,
 * the only time said system would fire is if it had a BladeComponent also attached.
 *
 */
public class BladeComponent extends AbstractComponent<NameableAspect,BladeFacet> {


    protected BladeComponent(NameableAspect aspect, BladeFacet facet) {
        super(aspect, facet);
    }
}
