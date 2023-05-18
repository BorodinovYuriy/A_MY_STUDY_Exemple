package patterns_from_book.strategy.duck_pattern.flying_class;


import patterns_from_book.strategy.duck_pattern.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("can not fly");
    }
}

