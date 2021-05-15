package me.aurium.scarab.experimental.test;

/**
 * The bladefacet is a facet extending the sword
 */
public interface BladeFacet extends SwordFacet {

    /**
     * The attack speed of the sword. The reason this isn't an aspect is because
     * this can be modified further by Enchantment components
     *
     * @return the speed
     */
    int speed();

}
