package me.aurium.scarab.statistic.proof;

import me.aurium.scarab.statistic.AdditionStatFunction;
import me.aurium.scarab.statistic.StatFunction;

public class ManualChildImpl implements ChildFace{
    @Override
    public StatFunction<Integer> getFirerate() {
        return new AdditionStatFunction(5); //this object increments the existing statmap's firerate value by 5
    }
    @Override
    public StatFunction<Integer> getDamage() {
        return null; //This object does nothing to the existing statmap. A problem arises in that if the stat is still null at the end, what actions are taken?
        //another problem arises in defining default logic. What if a value is
    }
}
