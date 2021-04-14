package me.aurium.scarab.behavioir;

import me.aurium.scarab.node.NodeInterpreter;

import java.util.Set;

/**
 * Represents something that can consume a behavior and fuck it in the asshole
 */
public interface BehaviorInterpreter extends NodeInterpreter {

    Set<BehaviorReaction<?>> getReactions();

}
