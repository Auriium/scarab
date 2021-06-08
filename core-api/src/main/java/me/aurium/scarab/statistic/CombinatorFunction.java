package me.aurium.scarab.statistic;

public class CombinatorFunction<T> implements StatFunction<T> {

    private final StatFunction<T> first;
    private final StatFunction<T> second;

    public CombinatorFunction(StatFunction<T> first, StatFunction<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public T function(T input) {
        return second.function(first.function(input));
    }

    @Override
    public StatFunction<T> append(StatFunction<T> other) {
        return new CombinatorFunction<>(this,other);
    }
}
