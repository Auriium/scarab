package me.aurium.scarab.toStay.stat1;

import java.util.Collection;
import java.util.function.Function;

/**
 * Statistic calculated
 * @param <T> type of value
 * @param <O> type of operation
 */
public interface Stat<T,O extends Function<T,T>> {

    /**
     * Retrieve value stored in this Stat
     * @return the value
     */
    T get();

    O getOperation();

    /**
     * Combines another stat with this stat
     * @param otherStat
     * @return
     */
    <V> Stat<T,O> combineThis(Stat<T,V> otherStat);


}
