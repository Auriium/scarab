package me.aurium.scarab.statistic;

import me.aurium.scarab.experimental.makeup.Facet;

public interface FacetMap<T extends Facet> {

    <I> void register(StatKey<I,T> key, StatFunction<I> function);

}
