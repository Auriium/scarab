package me.aurium.scarab.model.interpretation;

import me.aurium.scarab.model.ModifierContext;

public interface NodeModifier<T extends ModifierContext> {

    T modify(T parent);

}
