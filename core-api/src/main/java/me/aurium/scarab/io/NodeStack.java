package me.aurium.scarab.io;

import me.aurium.scarab.behavioir.BehaviorInterpreter;

/**
 * Represents some sort of serialized behavior node that can be quickly adapted back into a node
 */
public interface NodeStack {

    BehaviorInterpreter getNode(String identifier); //uhhh i dont fcking know figure this out later

}
