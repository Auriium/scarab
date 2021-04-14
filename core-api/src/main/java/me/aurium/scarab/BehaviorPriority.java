package me.aurium.scarab;

public class BehaviorPriority {

    private final int priorityNumber;

    public BehaviorPriority(int priorityNumber) {
        this.priorityNumber = priorityNumber;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }

    //example shit
    public static final BehaviorPriority LOW = new BehaviorPriority(0);
    public static final BehaviorPriority MEDIUM = new BehaviorPriority(100);
    public static final BehaviorPriority HIGH = new BehaviorPriority(500);



}
