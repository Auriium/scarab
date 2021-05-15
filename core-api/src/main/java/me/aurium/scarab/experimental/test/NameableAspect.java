package me.aurium.scarab.experimental.test;

import me.aurium.scarab.experimental.makeup.Aspect;

/**
 * Represents an aspect that has a name unique to the component
 */
public interface NameableAspect extends Aspect {

    String name();

}
