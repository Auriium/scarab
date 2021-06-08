package me.aurium.scarab.statistic.proof;

import me.aurium.scarab.statistic.StatFunction;

//where a config values can determine the ChildFace:
public class ConfigImplementation implements ChildFace{

    @Override
    public StatFunction<Integer> getFirerate() {
        return null; //return if the child def has an override for firerate value
    }

    @Override
    public StatFunction<Integer> getDamage() {
        return null; //return if the child def has an override for damage value. if it is null (or rather SWrap.empty - OH GOD
        //this is already starting to feel like a shitty c# no type safety confusing "'magic"' library - then this face does nothing).
    }
}
