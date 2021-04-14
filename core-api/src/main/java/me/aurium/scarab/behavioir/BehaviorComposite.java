package me.aurium.scarab.behavioir;

/**
 * Represents a combination of a behavior and a result
 * @param <T>
 * @param <C>
 */
public interface BehaviorComposite<T extends Behavior,C extends BehaviorResult<T>> {

    T getBehavior();
    C getPreviousResult();
}
