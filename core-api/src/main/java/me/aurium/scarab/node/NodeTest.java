package me.aurium.scarab.node;

import me.aurium.scarab.behavioir.EventModifier;
import me.aurium.scarab.model.interpretation.NodeModifier;

import java.util.Set;

public class NodeTest implements ScarabNode{

    private final NodeTest childNode;
    private final EventModifier modifier;

    public NodeTest(NodeTest childNode, EventModifier modifier) {
        this.childNode = childNode;
        this.modifier = modifier;
    }

    @Override
    public Set<NodeModifier<?>> allModifiers() {
        return null;
    }
}
