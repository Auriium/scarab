package me.aurium.scarab.statistic;

public class AdditionStatFunction implements StatFunction<Integer> {

    private final int number;
    private final AdditionStatFunction cum = this;

    public AdditionStatFunction(int number) {
        this.number = number;
    }

    @Override
    public Integer function(Integer input) {
        return input + number;
    }

}
