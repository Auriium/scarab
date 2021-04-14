package me.aurium.scarab.behavioir;

/**
 * Represents something that can consume a behavior and fuck it in the asshole
 */
public interface BehaviorNode<T extends Behavior,INPUT extends BehaviorResult<T>, OUTPUT extends BehaviorResult<T>> {

    BehaviorComposite<T,OUTPUT> consume(BehaviorComposite<T,INPUT> composite);

}
