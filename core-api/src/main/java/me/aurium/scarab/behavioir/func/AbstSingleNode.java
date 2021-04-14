package me.aurium.scarab.behavioir.func;

import me.aurium.scarab.behavioir.Behavior;
import me.aurium.scarab.behavioir.BehaviorComposite;
import me.aurium.scarab.behavioir.BehaviorNode;
import me.aurium.scarab.behavioir.BehaviorResult;

public class AbstSingleNode <T extends Behavior,INPUT extends BehaviorResult<T>,OUTPUT extends BehaviorResult<T>> implements BehaviorNode<T, INPUT, OUTPUT> {
    @Override
    public BehaviorComposite<T, OUTPUT> consume(BehaviorComposite<T, INPUT> composite) {
        return null;
    }
}
