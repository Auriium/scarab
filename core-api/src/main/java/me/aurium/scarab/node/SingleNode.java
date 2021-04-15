package me.aurium.scarab.node;

import me.aurium.scarab.behavioir.EventContext;
import me.aurium.scarab.behavioir.EventModifier;
import me.aurium.scarab.model.interpretation.NodeModifier;

import java.util.Set;

public class SingleNode implements ScarabNode{

    private final EventModifier modifier;

    public SingleNode(EventModifier modifier) {
        this.modifier = modifier;
    }

    @Override
    public Set<NodeModifier<?>> allModifiers() {
        return null;
    }

    public EventContext modify(EventContext context) {
        return modifier.modify(context);
    }
}
