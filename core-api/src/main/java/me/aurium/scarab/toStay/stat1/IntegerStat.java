package me.aurium.scarab.toStay.stat1;

import java.util.Collection;

public class IntegerStat implements Stat<Integer, IntegerStat.Operation> {

    private final int stored;
    private final Operation operation;

    public IntegerStat(int stored, Operation operation) {
        this.stored = stored;
        this.operation = operation;
    }

    @Override
    public Integer get() {
        return stored;
    }

    @Override
    public Operation getOperation() {
        return operation;
    }

    @Override
    public <V> Stat<Integer, Operation> combineThis(Stat<Integer, V> otherStat) {
        int value = 0;

        return null;
    }


    public enum Operation {
        ADD,
        SUBTRACT
    }
}
