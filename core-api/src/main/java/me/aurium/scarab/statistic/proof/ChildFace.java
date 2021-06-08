package me.aurium.scarab.statistic.proof;

import me.aurium.scarab.statistic.StatFunction;

public interface ChildFace extends TestFace  {

    StatFunction<Integer> getFirerate();

    @Override
    StatFunction<Integer> getDamage();

}
