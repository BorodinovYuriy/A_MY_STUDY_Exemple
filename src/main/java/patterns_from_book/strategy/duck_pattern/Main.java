package patterns_from_book.strategy.duck_pattern;


import patterns_from_book.strategy.duck_pattern.flying_class.FlyNoWay;
import patterns_from_book.strategy.duck_pattern.quacking_class.MuteQuack;
import patterns_from_book.strategy.duck_pattern.real_duck.TestDuck;

public class Main {
    public static void main(String[] args) {
        TestDuck testDuck = new TestDuck();
        testDuck.performQuack();
        testDuck.performFly();

        testDuck.display();

        //смена поведения
        System.out.println("\n-------------------\n");

        testDuck.setFlyBehavior(new FlyNoWay());
        testDuck.setQuackBehavior(new MuteQuack());
        testDuck.performFly();
        testDuck.performQuack();
        testDuck.display();

    }
}
