package me.aurium.scarab.behavioir.func;

import me.aurium.scarab.behavioir.Behavior;
import me.aurium.scarab.behavioir.BehaviorInterpreter;
import me.aurium.scarab.behavioir.BehaviorReaction;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class InterpreterTest implements BehaviorInterpreter {

    private Registry registry;

    @Override
    public Set<BehaviorReaction<?>> getReactions() {

        registry.registerListener(TestBehavior.class,this::accept,1);

        return null;
    }

    protected void accept(TestBehavior behavior) {

    }
}
