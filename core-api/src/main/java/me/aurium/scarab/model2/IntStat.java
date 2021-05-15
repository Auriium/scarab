package me.aurium.scarab.model2;

import java.util.function.Function;

public class IntStat implements Stat{

    private int value;
    private Function<Integer,Integer> operation;

    public IntStat apply(IntStat stat) {
        return null;
    }

    int current() {
        return operation.apply(value);
    }
}
