package me.aurium.scarab.node;

import me.aurium.scarab.model.interpretation.NodeModifier;

import java.util.Set;

/**
 * Something that can have multiple behavior nodes registered to it
 */
public interface ScarabNode {

    Set<NodeModifier<?>> allModifiers();

}
