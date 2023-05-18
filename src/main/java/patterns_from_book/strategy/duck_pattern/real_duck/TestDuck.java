package patterns_from_book.strategy.duck_pattern.real_duck;

import duck_pattern.Duck;
import duck_pattern.flying_class.FlyWithWings;
import duck_pattern.quacking_class.Quack;

public class TestDuck extends Duck {
    public TestDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    //собственный метод
    public void display(){
        System.out.println("i am real test duck");
    }
}
