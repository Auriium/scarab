package me.aurium.scarab.model2.types.impl;

import me.aurium.scarab.model2.types.StatComposite;
import me.aurium.scarab.model2.types.StatFunc;

import java.util.Set;

public abstract class CompositeBase implements StatComposite {
    @Override
    public Set<StatFunc<?>> functions() {
        return null;
    }
}
