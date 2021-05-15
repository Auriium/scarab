package me.aurium.scarab.model2.types;

import java.util.function.Function;

@FunctionalInterface
public interface StatFunc<T> {

    T apply(T origin);

}
