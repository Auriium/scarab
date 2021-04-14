package me.aurium.scarab.behavioir.func;

import me.aurium.scarab.behavioir.Behavior;
import me.aurium.scarab.behavioir.BehaviorComposite;
import me.aurium.scarab.behavioir.BehaviorResult;

public interface ActionFunction<T extends Behavior,C extends BehaviorResult<T>> {

    <X extends BehaviorResult<T>> C consume(BehaviorComposite<T,X> composite);

}
