package me.aurium.scarab.behavioir;

import java.util.function.Consumer;

public interface BehaviorReaction<T extends Behavior> extends Consumer<T> {

}
