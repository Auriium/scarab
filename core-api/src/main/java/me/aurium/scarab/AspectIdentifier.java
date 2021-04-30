package me.aurium.scarab;

import me.aurium.scarab.newshit.AspectData;

import java.util.ArrayList;
import java.util.List;

public class AspectIdentifier {
    private final List<Integer> acceptedComponents;

    AspectIdentifier(List<Integer> acceptedComponents) {
        this.acceptedComponents = acceptedComponents;
    }

    public boolean isAccepted(Class<? extends AspectData> data) {
        return acceptedComponents.contains(data.hashCode());
    }

    public static AspectIdentifier of(Class<? extends AspectData>... datas) {
        List<Integer> components = new ArrayList<>();

        for (Class<? extends AspectData> clazz : datas) {
            components.add(clazz.hashCode());
        }

        return new AspectIdentifier(List.copyOf(components));
    }
}
