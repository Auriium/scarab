package me.aurium.scarab.model2.types.impl;

import me.aurium.scarab.model2.IntStat;
import me.aurium.scarab.model2.types.SwordGaset;

public class IronSword implements SwordGaset {

    private final IntStat stat;

    public IronSword(IntStat stat) {
        this.stat = stat;
    }

    @Override
    public IntStat weight(IntStat fromParent) {
        return fromParent.apply(stat);
    }
}
