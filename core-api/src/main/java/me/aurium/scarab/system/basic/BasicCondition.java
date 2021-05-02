package me.aurium.scarab.system.basic;

import me.aurium.scarab.AspectData;
import me.aurium.scarab.Node;
import me.aurium.scarab.system.condition.AbstractCondition;

import java.util.Set;

public class BasicCondition extends AbstractCondition {

    public BasicCondition(Set<Class<? extends AspectData>> withComponents, Set<Class<? extends AspectData>> withoutComponents, Set<Class<? extends AspectData>> withChildComponents, Set<Class<? extends AspectData>> withoutChildComponents) {
        super(withComponents, withoutComponents, withChildComponents, withoutChildComponents);
    }

    @Override
    protected boolean primaryAcceptableCheck(Node node) {
        return true;
    }
}
