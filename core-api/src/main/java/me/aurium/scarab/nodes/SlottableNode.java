package me.aurium.scarab.nodes;

import me.aurium.scarab.AspectData;
import me.aurium.scarab.Node;

import java.util.Optional;

public class SlottableNode implements Node {
    @Override
    public <T extends AspectData> Optional<T> uglyAccess(Class<T> clazz) {
        return Optional.empty();
    }

    @Override
    public <T extends AspectData> boolean hasAspect(Class<T> clazz) {
        return false;
    }

    @Override
    public <T extends AspectData> boolean hasAspectIncludingChildren(Class<T> clazz) {
        return false;
    }
}
