package me.aurium.scarab.experimental.test;

public interface SwordAspect extends NameableAspect {

    /**
     * The material is unique to the sword (what it's made of cannot be changed by the blade installed)
     * @return the material of the blade
     */
    String material();

}
