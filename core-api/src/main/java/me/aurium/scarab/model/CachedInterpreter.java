package me.aurium.scarab.model;

import me.aurium.scarab.model.interpretation.NodeModifier;

public class CachedInterpreter<T extends ModifierContext> {

    private final NodeModifier<T> interpreter;

    public CachedInterpreter(NodeModifier<T> interpreter) {
        this.interpreter = interpreter;
    }


}
