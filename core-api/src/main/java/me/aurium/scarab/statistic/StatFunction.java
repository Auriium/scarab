package me.aurium.scarab.statistic;

public interface StatFunction<T> {

    /**
     * Modulates based on input
     * @param input input value
     * @return the modified input
     */
    T function(T input);

    default StatFunction<T> append(StatFunction<T> other) {
        return new CombinatorFunction<>(this,other);
    }



}
